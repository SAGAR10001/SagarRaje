package in.Saksoft.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.Saksoft.Binding.EmployeeBind;
import in.Saksoft.Entity.Employee;
import in.Saksoft.Service.EmployeeService;


@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping("/Employee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		
		List<Employee> allEmployee = employeeService.getAllEmployee();
		
		return new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK);
	}
	
	
	@GetMapping("/Employee/{Id}")
	public ResponseEntity<Optional<Employee>> getEmployee(@PathVariable  int id){
		
		Optional<Employee>employee=employeeService.getEmployee(id);
		
		return new ResponseEntity<Optional<Employee>>(employee,HttpStatus.OK);
	}
	
	
	@PostMapping("/Employee")
	public ResponseEntity<String> upsert(@RequestBody  EmployeeBind emp){
		
		String upsert= employeeService.upsert(emp);
		
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/Employee/{Id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable int Id){
		
		String deleteEmployee = employeeService.deleteEmployee(Id);
		
		return new ResponseEntity<String>(deleteEmployee,HttpStatus.OK); 
	}
	
}
