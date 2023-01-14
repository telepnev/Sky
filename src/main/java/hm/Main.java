package hm;

public class Main {
    public static void main(String[] args) {
        // task1_v2();
        // task2_v2();
        //  task4_v2_2();
        task5_v2_2();
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

    public static void task3_v2() {
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

    public static void task4_v2_2() {
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

    public static void task5_v2_2() {
        int monthNumber = 13;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Сизон Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сизон Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сизон Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сизон Осень");
                break;
            case 12:
                System.out.println("Сизон зима");
                break;

            default:
                System.out.println("Такого месяца не существует");
        }

        // switch v2
        switch (monthNumber) {
            case 1, 2, 12 -> {
                System.out.println("Сизон Зима версия - 2");
            }
            case 3, 4, 5 -> {
                System.out.println("Сизон Весна версия - 2");
            }
            case 6, 7, 8 -> {
                System.out.println("Сизон Лето версия - 2");
            }
            case 9, 10, 11 -> {
                System.out.println("Сизон Осень версия - 2");
            }
            default -> System.out.println("Такого месяца не существует версия - 2");
        }
    }
}
