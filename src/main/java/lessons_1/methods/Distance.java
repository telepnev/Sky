package lessons_1.methods;

public class Distance {
    void getDeliveryDistance(int deliveryDistance) {
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
