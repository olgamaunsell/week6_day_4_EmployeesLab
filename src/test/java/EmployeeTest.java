import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;
    private double salaryIncrease;

    @Before

    public void before(){
        employee = new Employee("Zsolt", "ZX1238BQ", 25000);
        salaryIncrease = 2000;
    }
    @Test

    public void getName(){
        assertEquals("Zsolt", employee.getName());
    }

    @Test

    public void getNiNumber(){
        assertEquals("ZX1238BQ", employee.getNiNumber());
    }

    @Test

    public void getSalary(){
        assertEquals(25000, employee.getSalary(), 0.01);
    }

    @Test

    public void raiseSalary(){
        employee.raiseSalary(salaryIncrease);
        assertEquals(27000.0, employee.getSalary(), 0.01);
    }

    @Test

    public void cantRaiseWithNegativeAmount(){
        employee.raiseSalary(-2000);
        assertEquals(25000.0, employee.getSalary(), 0.01);
    }

    @Test

    public void payBonus(){
        employee.payBonus();
        assertEquals(250, employee.payBonus(), 0.01);
    }

    @Test
    public void canChangeName(){
        employee.setName("Craig");
        assertEquals("Craig", employee.getName());
    }

    @Test
    public void cantChangeNameToSpaces(){
        employee.setName("");
        assertEquals("Zsolt", employee.getName());
    }

    @Test
    public void cantChangeNameToNull(){
        employee.setName(null);
        assertEquals("Zsolt", employee.getName());
    }
}
