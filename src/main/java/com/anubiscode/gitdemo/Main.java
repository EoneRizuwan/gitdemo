package main.java.com.anubiscode.gitdemo;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Halliday", 38);

        System.out.println(person);

        Person person1 = new Person();
        person1.setName("Mark");
        person1.setAge(15);

        System.out.println("Person 2 is " + person1.getName() + ", " + person1.getAge());
    }
}
