package ooplab9;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1111111111111",
                "krittiyaporn khaikhaoi",
                new Address("67 M.2", "Nakorn",
                        "80110"),
                new Job("Teacher", 20000));

        System.out.println(person.toString());

        person.getJob().setSalary(30000);
        System.out.println("Name: "+person.getName()+
                " Salary: "+person.getJob().getSalary());







    }   //main



}