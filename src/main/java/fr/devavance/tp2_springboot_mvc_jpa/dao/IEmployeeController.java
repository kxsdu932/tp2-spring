package fr.devavance.tp2_springboot_mvc_jpa.dao;

import fr.devavance.tp2_springboot_mvc_jpa.beans.Employee;
import org.springframework.ui.Model;

public interface IEmployeeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee);
    public String displayEmployee(Long id,  Model model);
}
