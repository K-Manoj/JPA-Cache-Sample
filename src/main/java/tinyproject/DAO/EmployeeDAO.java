package tinyproject.DAO;

import org.springframework.beans.factory.annotation.Autowired;

import tinyproject.Employee;
import tinyproject.Repository.EmployeeRepository;

public class EmployeeDAO {
	@Autowired
	private EmployeeRepository repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	public String delete(Employee emp) {
		repo.deleteAll();
		return "Deleted";
	}

	public Employee update(Employee emp) {
		return repo.save(emp);
	}

	public Employee search(Employee emp) {
		return repo.findOne(emp.emp_id);
	}

}
