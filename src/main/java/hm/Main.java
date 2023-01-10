package hm;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
    }

    public static void task_1() {
        System.out.println("task - 1");
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " вы не достигли совершеннолетия, нужно немного подождать");
        }
    }

    public static void task_2() {
        System.out.println("task - 2");
        int temper = 6;
        if (temper <= 5) {
            System.out.println("На улице " + temper + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        }
    }

    public static void task_3() {
        System.out.println("task - 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }
    }

    public static void task_4() {
        System.out.println("task - 4");
        int age = 100;
        boolean isNeedKindergarten = age>=2 && age<=6;
        boolean isGotoSchool = age>=7 && age<18;
        boolean isUniversity = age>18 && age<24;
        boolean isGotoWork = age>=24 && age <= 65;



        if(isNeedKindergarten) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в детский сад.");
        }
        if(isGotoSchool) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в ходить в школу.");
        }
        if(isUniversity) {
            System.out.println("Если возраст человека равен "+age+" , то его место в университете.");
        }
        if(isGotoWork) {
            System.out.println("Если возраст человека равен "+age+" , то ему пора ходить на работу.");
        }
    }
}
