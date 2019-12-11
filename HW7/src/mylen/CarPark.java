package mylen;

public class CarPark {
    String mark;
    String model;
    int yearRelease;
    Double price;
    String registrationNumber;
    double сonsumptionFuel;
    double speed;


    public CarPark(String mark, String model, int yearRelease, Double price, String registrationNumber,
                   double сonsumptionFuel, double speed) {
        this.mark = mark;
        this.model = model;
        this.yearRelease = yearRelease;
        this.price = price;
        this.registrationNumber = registrationNumber;
        this.сonsumptionFuel = сonsumptionFuel;
        this.speed = speed;
    }

    public static double countingCost(CarPark[] carParks) {
        double cost = 0.0;
        for (CarPark counting : carParks) {
            cost = cost + counting.price;
        }
        return cost;
    }

    public static void sortByсonsumptionFuel(CarPark[] cars) {
        boolean isSorted = false;
        CarPark temp;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < cars.length - 1; i++) {
                if (cars[i].сonsumptionFuel > cars[i + 1].сonsumptionFuel) {
                    isSorted = false;

                    temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
    }

    public static CarPark[] filterBySpeedMaxMin(CarPark[] cars, double maxSpeed, double minSpeed) {
        int i = 2;
        int j = 0;
        CarPark[] totalArrayfilterBySpeed = new CarPark[i];
        for (CarPark arrayBySpeed : cars) {
            if (arrayBySpeed.speed >= minSpeed && arrayBySpeed.speed <= maxSpeed) {
                if (j < i) {
                    totalArrayfilterBySpeed[j] = arrayBySpeed;
                    j++;
                } else {
                    totalArrayfilterBySpeed = arrayResize(totalArrayfilterBySpeed);
                    totalArrayfilterBySpeed[j] = arrayBySpeed;
                    j++;
                    i++;
                }
            }

        }
        return totalArrayfilterBySpeed;
    }

    public static CarPark[] arrayResize(CarPark[] carParksresize) {
        int i = 0;
        CarPark[] temp = new CarPark[carParksresize.length + 1];
        for (CarPark arrayResizetemp : carParksresize) {
            temp[i] = arrayResizetemp;
            i++;
        }
        return temp;
    }
}


class PassengerCar extends CarPark {
    String typeClass;
    int countPassenger;

    public PassengerCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                        double сonsumptionFuel, double speed, String typeClass, int countPassenger) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeClass = typeClass;
        this.countPassenger = countPassenger;
    }

    @Override
    public String toString() {
        return "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", сonsumptionFuel=" + сonsumptionFuel +
                ", speed=" + speed +
                ", typeClass='" + typeClass + '\'' +
                ", countPassenger=" + countPassenger +
                '}';
    }
}

class TrucksCar extends CarPark {

    String typeTrucksCar;
    int carrying;

    public TrucksCar(String mark, String model, int yearRelease, Double price, String registrationNumber,
                     double сonsumptionFuel, double speed, String typeTrucksCar, int carrying) {
        super(mark, model, yearRelease, price, registrationNumber, сonsumptionFuel, speed);
        this.typeTrucksCar = typeTrucksCar;
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", сonsumptionFuel=" + сonsumptionFuel +
                ", speed=" + speed +
                ", typeTrucksCar='" + typeTrucksCar + '\'' +
                ", carrying=" + carrying +
                '}';
    }
}

