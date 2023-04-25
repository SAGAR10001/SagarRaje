package in.Saksoft.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Saksoft.Binding.EmployeeBind;
import in.Saksoft.Entity.Employee;
import in.Saksoft.Repository.EmployeeRepository;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	
	
	@Override
	public List<Employee> getAllEmployee() {

		return employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> getEmployee(int eId) {
		Optional<Employee> findById = employeeRepository.findById(eId);
		return findById;
	}

	@Override
	public String upsert(EmployeeBind emp) {
		Employee ent=new Employee();
		BeanUtils.copyProperties(emp, ent);
		employeeRepository.save(ent);
		return "succesful program.....";
	}

	@Override
	public String deleteEmployee(int eId) {
		employeeRepository.deleteById(eId);
		return "succesful program.....";
	}

}
