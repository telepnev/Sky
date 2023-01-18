package loop;

public class LoopHW_2 {
    public static void main(String[] args) {
        //loopTaskv2_1();
//        loopTaskv2_2();
//        loopTaskv2_3();
//         loopTaskv2_4();
//        loopTaskv2_5();
       // loopTaskv2_6();
        loopTaskv2_7();
    }

    public static void loopTaskv2_1() {
        System.out.println("loopTaskv2_1");

        int amountSavings = 2_459_000;
        int salary = 15_000;
        int month = 1;
        int total = 0;
        while (total < amountSavings) {
            total = total + salary;
            month++;
        }
        System.out.println("Месяцев " + month + " , сумма накоплений равна " + total + " рублей. И потребуется лет = " + month / 12);

        System.out.println("----------------------------");
    }

    public static void loopTaskv2_2() {
        System.out.println("loopTaskv2_2");
        int num = 10;
        int count = 0;

        while (count < num) {
            count++;
            System.out.print(count + " ");
        }
        count = 0;
        System.out.println(" ");
        for (int i = num; i > count; i--) {
            System.out.print(i + " ");
        }
    }

    public static void loopTaskv2_3() {
        System.out.println("loopTaskv2_3");
        int y = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int totalYear = 10;
        int year = 0;
        int birthRateResult = 0;
        int mortalityResult = 0;
        int result = 0;

        for (int i = year; i < totalYear; i++) {
            birthRateResult = ((y / 1000) * birthRate) * i;
            mortalityResult = ((y / 1000) * mortality) * i;
            result = (birthRateResult - mortalityResult) + y;
            year++;
        }
        System.out.println("Год " + year + " , численность населения составляет " + result);
    }

    public static void loopTaskv2_4() {
        System.out.println("loopTaskv2_4");
        double depozitProcent = 0.07;
        int startSum = 15_000;
        int needSum = 12_000_000;
        double mySum = 0;
        int moth = 0;
        while (mySum < needSum) {
            double result = 0;
            result = (startSum * depozitProcent) + startSum;
            mySum += result;
            moth++;
        }
        System.out.println("Василию нужно будет копить " + moth + " месяцев по " + startSum + " рублей , чтобы собрать сумму в 12 миллионов.");
    }

    public static void loopTaskv2_5() {
        System.out.println("loopTaskv2_5");
        double depozitProcent = 0.07;
        int startSum = 15_000;
        int needSum = 12_000_000;
        double mySum = 0;
        int moth = 0;
        while (mySum < needSum) {
            double result = 0;
            result = (startSum * depozitProcent) + startSum;
            mySum += result;
            moth++;
            if (moth % 6 == 0) {
                System.out.println("Василию нужно будет копить " + moth + " месяцев по " + startSum + " рублей , чтобы собрать сумму в 12 миллионов.");
            }
        }
    }

    public static void loopTaskv2_6() {
        System.out.println("loopTaskv2_6");
        double depozitProcent = 0.07;
        int startSum = 15_000;
        int needYears = 9;
        int totalMonth = needYears * 12;
        double mySum = 0;
        int moth = 0;
        while (moth < totalMonth) {
            double result = 0;
            result = (startSum * depozitProcent) + startSum;
            mySum += result;
            moth++;
            if (moth % 6 == 0) {
                System.out.println("За " + moth + " месяцев сумма " + mySum + " рублей.");
            }
        }
    }

    public static void loopTaskv2_7() {
        System.out.println("loopTaskv2_7");
        int friday = 5;
        int month = 31;
        int count = 0;

        for (int i = 0; i < month; i++) {
            count++;

            if (friday == 5) {
                if (count % 7 == 0) {
                    System.out.println("Сегодня пятница, " + count + " -е число. Необходимо подготовить отчет");
                }
            }
        }
    }


}
