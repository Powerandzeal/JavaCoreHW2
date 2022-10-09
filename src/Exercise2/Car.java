package Exercise2;

public class Car {
    public String brandOfCar;         // fields
    public String model;             // fields
    public double capasityOfEngine; // fields
    public String colorOfCarcase;   // fields
    public int dateOfMade;          // fields
    public String madeCountry;      // fields

    public Car(String brandOfCar, String model, int dateOfMade, String madeCountry, String colorOfCarcase
            , double capasityOfEngine) {                    // constructor

        if (brandOfCar == null) {
            this.brandOfCar = "default";
        } else this.brandOfCar = brandOfCar;

        if (model==null) {
            this.model = "default";
        } else this.brandOfCar = brandOfCar ;

        if (dateOfMade > 0) {
            this.dateOfMade = dateOfMade;
        } else this.dateOfMade = Math.abs(dateOfMade);

        if (madeCountry==null) {
            this.madeCountry = "default";
        } else this.madeCountry = madeCountry;

        if (colorOfCarcase.length()!=0) {
            this.colorOfCarcase = colorOfCarcase;
        } else this.colorOfCarcase = "white";

        if (Double.compare(capasityOfEngine,0)==0) {
            this.capasityOfEngine = 1.5;
        } else this.capasityOfEngine = capasityOfEngine; // constructor
    }

    public Car() {

    }


    @Override
    public String toString() {
        System.out.println();
        return "Car" +
                " brandOfCar='" + brandOfCar + '\'' +
                ", model='" + model + '\'' +
                ", capasityOfEngine=" + capasityOfEngine +
                ", colorOfCarcase='" + colorOfCarcase + '\'' +
                ", dateOfMade=" + dateOfMade +
                ", madeCountry='" + madeCountry + '\'' +
                '}';

    }
}
