package eu.nets;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.nets.config.Config;
import eu.nets.model.Employee;
import eu.nets.service.EmployeeService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext()) {
            ctx.register(Config.class);
            ctx.refresh();

            EmployeeService service = ctx.getBean(EmployeeService.class);

            List<Employee> zaposlenici = service.getEmployees();

            for (Employee zaposlenik: zaposlenici) {
                System.out.println(zaposlenik.getFirstName() + " " + zaposlenik.getLastName());
            }
        }

    }
}
