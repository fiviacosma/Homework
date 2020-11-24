package tema3.person;

public class Employee extends Person {

    private String jobTitle;
    private String company;

    public Employee(String name, int age, String jobTitle, String company) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.company = company;

    }


}
