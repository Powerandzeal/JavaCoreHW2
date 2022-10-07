public class Cat {
    String name;
    int age;

    Cat (String name){
        this.name = "Barsik";
        age = 1;
    }
    Cat (String name, int age){
        this.name = "Barsik";
        age = 1;
    }

    void meow() {
        System.out.println("Meow");
        System.out.println("My name is " + name);
        System.out.println("My years old is " + age);
    }
}
