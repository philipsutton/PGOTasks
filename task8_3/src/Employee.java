public class Employee extends Person {
    int hireDate;
    String companyName;
    double salary;

    public Employee(String firstName, String lastName, int birthYear, int currentDate, String companyName, double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.currentDate=currentDate;
        this.companyName = companyName;
        this.salary = salary;
        age=this.currentDate-this.birthYear;

    }

    public int getJobSeniority(){
        int seniority= currentDate-hireDate;
        return seniority;
    }

    public double getSalary(){
        return salary;
    }
}
