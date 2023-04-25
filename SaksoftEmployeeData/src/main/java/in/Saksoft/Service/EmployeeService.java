
package in.Saksoft.Service;

import java.util.List;
import java.util.Optional;

import in.Saksoft.Binding.EmployeeBind;
import in.Saksoft.Entity.Employee;

public interface EmployeeService {
	
	
	public List<Employee> getAllEmployee();//find all employee name list
	
	public Optional<Employee> getEmployee(int eId);//find one name by id
	
	public String upsert(EmployeeBind emp);  //update & insert
	
	public String deleteEmployee(int eId);  //delete of employee Id
}
