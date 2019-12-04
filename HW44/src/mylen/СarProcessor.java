package mylen;


public class СarProcessor {

    static void printCarToModel(Car[] car, String model) {
        for (Car search : car) {
            if (search.model == model) {
                System.out.println("id=" + search.id + "; " +
                        "year_release=" + search.year_release + "; " +
                        "price=" + search.price + "; " +
                        "mark=" + search.mark + "; " +
                        "color=" + search.color + "; " +
                        "registration_number=" + search.registration_number);
            }

        }
    }

    static void printCarToFiltreYearЕxploitation(Car[] car, String model, int year) {
        for (Car search : car) {
            if (search.model == model && search.year_release - year < 1) {
                System.out.println("id=" + search.id + "; " +
                        "year_release=" + search.year_release + "; " +
                        "price=" + search.price + "; " +
                        "mark=" + search.mark + "; " +
                        "color=" + search.color + "; " +
                        "registration_number=" + search.registration_number);
            }
        }
    }

    static void printCarToFiltreYearЕxploitation(Car[] car, int year, double price) {
        for (Car search : car) {
            if (search.year_release== year && search.price >= price) {
                System.out.println("id=" + search.id + "; " +
                        "year_release=" + search.year_release + "; " +
                        "price=" + search.price + "; " +
                        "mark=" + search.mark + "; " +
                        "color=" + search.color + "; " +
                        "registration_number=" + search.registration_number);
            }
        }
    }
}
