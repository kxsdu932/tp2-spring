package fr.devavance.tp2_springboot_mvc_jpa.controllers;
import fr.devavance.tp2_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp2_springboot_mvc_jpa.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeControleur {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @GetMapping("/home")
    public String displayHome(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        model.addAttribute("employee", new Employee());
        return "view_home";
    }

    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee) {
        this.employeeRepository.save(employee);
        return "redirect:/employee/home";
    }

    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model) {
        Optional<Employee> emp1 = employeeRepository.findById(id);
        if (emp1.isPresent()) {
            Employee employee = emp1.get();
            model.addAttribute("employee", employee);
            return "view_employee";
        }
        else {
            return "redirect:/employee/home";
        }
    }

}
