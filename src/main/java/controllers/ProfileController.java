package controllers;

import dto.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/register")
public class ProfileController {

    @GetMapping("/users")
    public List<Employee> getEmployee(@PathVariable String id) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"vijay","bhaskar","vijaybhaskar489@gmail.com"));

       return employees;
    }
}
