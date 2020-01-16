package mylen;

public class CarProccesor {
    Car carArray[];

    public CarProccesor(Car[] carArray) {
        this.carArray = carArray;
    }

    public CarProccesor() {
        Car[] carArraya = new Car[0];
        this.carArray = carArraya;
    }

    static void printCarToModel(Car[] car, String model) {
        for (Car search : car) {
            if (search.model.equals(model) == true) {
                search.printCar();
            }
        }
    }



    static void printCarToFiltreYearЕxploitation(Car[] car, String model, int year) {
        for (Car search : car) {
            if (search.model.equals(model) == true && search.yearRelease - year < 1) {
                search.printCar();
            }
        }
    }

    static void printCarToFiltreYearЕxploitation(Car[] car, int year, double price) {
        for (Car search : car) {
            search.printCar();

        }
    }
}

