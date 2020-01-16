package mylen;
import static mylen.CarProccesor.*;
public class Main {

    public static void main(String[] args) {
        Car[] arrayCar = new Car[6];
        arrayCar[0] = new Car(1, "Mazda", "RX3", 2017, "red", 2700.0, "SDF452");
        arrayCar[1] = new Car(3, "Mazda", "RX3", 2019, "white",  3700.00, "SDFFGG452");
        arrayCar[2] = new Car(2, "Mazda", "RX3", 2016, "white", 2000.0, "SDG452GGHH");
        arrayCar[3] = new Car(4, "VOLVO", "LS-3", 2018, "green", 2500.00, "SDG452GGHH");
        arrayCar[4] = new Car(4, "BMW", "3823", 2019, "black", 33000.00, "SDG452GGHH");
        arrayCar[5] = new Car(4, "Opel", "3823", 2018, "black", 33000.00, "SDG452GGHH");
        System.out.println ("Filter from model:");
        printCarToModel (arrayCar, "RX3");
        System.out.println ("Filter from model+year:");
        printCarToFiltreYearЕxploitation( arrayCar,"3823",2019 );
        System.out.println ("Filter from year+price:");
        printCarToFiltreYearЕxploitation (arrayCar, 2019, 30000.00);

        Recursion pintprintFromN= new Recursion();
        // sutask 2
        pintprintFromN.printFromN(7);
        // sutask 3
       System.out.println(pintprintFromN.printSun(2423));

    }
}
