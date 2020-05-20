public class Manager extends Employee {
    double bonus;
    double salaryForManager;

    public Manager(String firstName, String lastName, int birthYear, int currentDate, String companyName, double salary, double bonus){
        super(firstName, lastName, birthYear, currentDate, companyName, salary);
        this.bonus=bonus;
        salaryForManager=this.salary+this.bonus;
        age=2020-birthYear;
    }

    @Override
    public double getSalary(){
        return salaryForManager;

    }

    @Override
    public String toString(){
        return "Manager with lastName "+lastName+ " and age "+age+" has a salary of "+ salaryForManager;
    }

}
