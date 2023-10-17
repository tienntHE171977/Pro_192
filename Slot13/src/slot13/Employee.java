
package slot13;
import java.lang.Comparable;

public class Employee implements Comparable {
    private String code;
    private String name;
    private int salary;

    public Employee(String code, String name, int salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }
    public void print(){
        System.out.println("Employee Code: " + code);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int compareTo (Object emp){
        return this.getCode().compareTo(((Employee)emp).getCode());
    }
    
}
