import Exercise1.Human;
import Exercise2.Car;

public class Main {
    public static void main(String[] args) {
        //Exercise1
        Human maksim = new Human(null,"Minsk",-1987,"brand Manager");
        Human anua = new Human("Anua","Moscow",-1996,"methodologist of educational programs.");
        Human kate = new Human("Kate","Kalingrad",1994,"Prodact Manager");
        Human artem = new Human("Artem","Moscow",1995,"Director of Business Development.");

        maksim.Welcome();
        anua.Welcome();
        kate.Welcome();
        artem.Welcome();
        System.out.println();

        //Exercise2
        Car lada = new Car(null,"Granta",-2015,"",
                "",-1.7);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", -2020, "Germany",
                "black", -3.0);
        Car bmw = new Car("BMW","Z8",2020,"Germany",
                        "Black",3);
        Car kia = new Car("Kia","Sportage 4 Generation",2018,
                "South Corea","Red",2.4 );
        Car hundai = new Car ("Huyndai","Avante",2016,
                "South Corea","Orange",1.6);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hundai);







    }
}