package hm;

public class Main {
    public static void main(String[] args) {
        // task1_v2();
       // task2_v2();
        task3_v2_1();
    }

    public static void task1_v2() {
        System.out.println("task1_v2");
        int clientOS = 0;
        int iOS = 0;
        int Android = 1;
        int clientDeviceYear = 2010;


        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear > 2015) {
                System.out.println("Установите приложение");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == Android) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear > 2015) {
                System.out.println("Установите приложение");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            System.out.println("---------------------------");
        }
    }

    public static void task2_v2() {
        System.out.println("task1_v2");
        int year = 2023;
        int vesakos4 = year % 4;
        int vesakos100 = year % 100;
        int vesakos400 = year % 400;

        if (vesakos4 == 0 && vesakos100 != 0) {
            System.out.println(year + " - этот год весакосный - каждые 4 года");
        } else if (vesakos400 == 0) {
            System.out.println(year + " - этот год весакосный - каждые 400 лет");
        } else {
            System.out.println(year + " - это обычный год !");
        }
        System.out.println("---------------------------");
    }
    public static void task3_v2_1() {
        int deliveryDistance = 60;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: Один день");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: Два дня");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: Три дня");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

}
