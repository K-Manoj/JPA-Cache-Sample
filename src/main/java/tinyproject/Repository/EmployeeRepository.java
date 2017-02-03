package tinyproject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tinyproject.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
