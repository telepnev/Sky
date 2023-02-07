package methods;

public class Year {
    public void isYearLeap(int year) {
        int yearNow = year;

        if (yearNow % 4 == 0 && yearNow % 100 != 0 || yearNow % 400 == 0) {
            System.out.println(yearNow + " - этот год висакосный");
        } else {
            System.out.println(yearNow + " - этот год не является висакосным");
        }
    }
}
