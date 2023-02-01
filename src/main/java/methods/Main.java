package methods;

import java.time.LocalDate;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();
        int randomYear = new Random().nextInt(2010, currentYear);
        int randomDistance = new Random().nextInt(0, 101);

//        task 1
        Year year = new Year();
        year.isYearLeap(randomYear);
        System.out.println();

//        task 2
        Phone phone = new Phone();
        phone.getOsAndYear("Android", randomYear);
        System.out.println();

//        task 2
        Distance distance = new Distance();
        distance.getDeliveryDistance(randomDistance);
    }

}
