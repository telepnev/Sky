package lessons_1.loop;

public class LoopHW_1 {
    public void loopTaskv1_1() {
        System.out.println("loopTaskv1_1");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Числа от 1 до 10 - " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_2() {
        System.out.println("loopTaskv1_2");
        for (int i = 10; i >= 1; i--) {
            System.out.println("Числа от 10 до 1 - " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_3() {
        System.out.println("loopTaskv1_3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четные числа от 0 до 17 - " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_4() {
        System.out.println("loopTaskv1_4");
        for (int i = 10; i >= -10; i--) {
            System.out.println("Все числа от 10 до −10 - " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_5() {
        System.out.println("loopTaskv1_5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " - год является високосным");
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_6() {
        System.out.println("loopTaskv1_6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println("Последовательность чисел: " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_7() {
        System.out.println("loopTaskv1_7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("Последовательность чисел: " + i);
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_8() {
        System.out.println("loopTaskv1_8");
        int year = 12;
        int willPostpone = 29_000;

        for (int i = 1; i <= year; i++) {
            int sum = i * willPostpone;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_9() {
        System.out.println("loopTaskv1_9");
        int year = 12;
        int procentPerYear = 12;
        int willPostpone = 29_000;

        for (int i = 1; i <= year; i++) {
            double sum = ((i * willPostpone) * procentPerYear / 100) + (willPostpone * i);
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum + " рублей");
        }
        System.out.println("----------------------");
    }

    public void loopTaskv1_10() {
        System.out.println("loopTaskv1_10");
        int num = 2;
        for (int i = 1; i <= 9; i++) {
            int sum = num * i;
            System.out.println(num + " * " + i + " = " + sum);
            System.out.println("----------------------");
        }
    }
}
