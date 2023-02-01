package methods;

public class Phone {

    public void addOsAndYear(String clientOS, int clientDeviceYear) {

        int deviceYear = clientDeviceYear;
        int os = getClientOs(clientOS);

        if (os == 0) {
            if (deviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS");
            } else {
                System.out.println("Установить облегченную версию приложения для iOS можно по ссылке");
            }
        }
        if (os == 1) {
            if (deviceYear > 2015) {
                System.out.println("Установите версию приложения для Android");
            } else {
                System.out.println("Установить облегченную версию приложения для Android можно по ссылке");
            }
        }
    }

    public int getClientOs(String clientOsDevice) {
        String os = clientOsDevice;
        String clientOs = "ios";
        if (clientOs.equals(os.toLowerCase())) {
            return 0;
        } else {
            return 1;
        }
    }
}
