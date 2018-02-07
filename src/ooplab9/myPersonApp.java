package ooplab9;

public class myPersonApp {
    public static void main(String[] args) {
        Person person = new Person("1111111111111",
                "krittiyaporn khaikhao",
                new Address("67 M.2", "Phattalung",
                        "93210"),
                new Job("Student", 4000));

        System.out.println(person.toString());


    }   //main

}