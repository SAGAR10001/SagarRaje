package in.Saksoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Saksoft.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
