package tinyproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tinyproject.Employee;
import tinyproject.Repository.EmployeeRepository;

@RestController
@RequestMapping("/EmployeeCtrl")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepo;

	@RequestMapping(method = RequestMethod.POST, value = "/insert", headers = "Accept=application/json")
	public void insert(@RequestBody Employee emp) {
		employeeRepo.save(emp);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/update", headers = "Accept=application/json")
	public void update(@RequestBody Employee emp) {
		employeeRepo.save(emp);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/print")
	public List<Employee> get() {
		return employeeRepo.findAll();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/findbyid", headers = "Accept=application/json")
	public Employee gett(@RequestParam("id") Long id) {
		return employeeRepo.findOne(id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteall")
	public void delete(@RequestBody Employee emp) {
		employeeRepo.deleteAll();
	}
}
