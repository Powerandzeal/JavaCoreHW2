public class Main {
    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik");

        murzik.meow();

        Cat begemot = new Cat("begemot");
        begemot.age = 2;
        begemot.meow();
    }
}