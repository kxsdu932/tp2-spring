import fr.devavance.tp2_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp2_springboot_mvc_jpa.beans.Fonction;
import fr.devavance.tp2_springboot_mvc_jpa.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static fr.devavance.tp2_springboot_mvc_jpa.beans.Fonction.CHEF_PROJET;

@Component
class InitDataRepository implements CommandLineRunner {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {

        Employee emp1 = new Employee(8L,"kaissssssss","email", "2", "address", CHEF_PROJET);
        employeeRepository.save(emp1);


    }
}
