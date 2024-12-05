package Day3;

class User  {
    int Id;
    String Name;

    public User(int Id,String Name){
        this.Id=Id;
        this.Name=Name;

    }
    // Method to display user details
    public void Userinfo(){
        System.out.println("Id :"+Id);
        System.out.println("Name :"+ Name);
    }
}
class Employee extends User{
    double salary;
    public Employee(int Id,String Name,double salary){
        super(Id,Name);
        this.salary=salary;
    }
    // Method to calculate annual salary
    public  double calculateAnnualSalary(){
        return salary*12;
}
    public void displayEmployeeInfo() {
        super. Userinfo(); // Call parent class method to display user details
        System.out.println("Monthly Salary: " + salary);
    }
}
//main class
public class Annualsalary {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"Nisha",25000);
        emp.displayEmployeeInfo();

        double annualSalary=emp.calculateAnnualSalary();
        System.out.println("Annual salary :"+annualSalary);
    }
}