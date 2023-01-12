package hm;

public class Main {
    public static void main(String[] args) {
        task1_v2();
    }

    public static void task1_v2() {
        int clientOS = 0;
        int iOS = 0;
        int Android = 1;
        int clientDeviceYear = 2010;


        if (clientOS == iOS && (clientDeviceYear<= 2015  || clientDeviceYear >= 2015)){
            System.out.println("Установите версию приложения для iOS по ссылке");
            if(clientDeviceYear > 2015) {
                System.out.println("Установите приложение");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == Android && (clientDeviceYear<= 2015  || clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if(clientDeviceYear > 2015) {
                System.out.println("Установите приложение");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

}
