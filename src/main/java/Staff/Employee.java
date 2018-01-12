package Staff;

public class Employee {

    public String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

    public void setName(String name) {

        if(name != null && !name.isEmpty())
        {
            this.name = name;
        }
    }
}
