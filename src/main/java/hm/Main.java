package hm;

public class Main {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
        task_7();
    }

    public static void task_1() {
        System.out.println("task - 1");
        int age = 10;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " вы не достигли совершеннолетия, нужно немного подождать");
        }
        System.out.println("------------------------------------");
    }

    public static void task_2() {
        System.out.println("task - 2");
        int temper = 6;
        if (temper <= 5) {
            System.out.println("На улице " + temper + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        }
        System.out.println("------------------------------------");
    }

    public static void task_3() {
        System.out.println("task - 3");
        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " , можно ездить спокойно");
        }
        System.out.println("------------------------------------");
    }

    public static void task_4() {
        System.out.println("task - 4");
        int age = 30;
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
        System.out.println("------------------------------------");
    }
    public static void task_5() {
        System.out.println("task - 5");
        int kidsAge = 11;

        if(kidsAge<5) {
            System.out.println("Если возраст ребенка равен " +kidsAge+ " , то ему нельзя кататься на аттракционе");
        } if (kidsAge > 5 && kidsAge < 14) {
            System.out.println("Если возраст ребенка равен " +kidsAge+ " , то ему можно кататься на аттракционе в сопровождении");
        } if (kidsAge > 14) {
            System.out.println("Если возраст ребенка равен " +kidsAge+ " , то он может кататься без сопровождения взрослого.");
        }
        System.out.println("------------------------------------");
    }

    public static void task_6() {
        System.out.println("task - 6");
        int passengers = 100;
        int oneVagon = 102;
        boolean isSittingPlace = passengers <=60;
        boolean isStandingPlace = passengers > 60 && passengers < oneVagon;

        if(isSittingPlace) {
            System.out.println("В вагоне есть сидячие места !");
        } else if(isStandingPlace) {
            System.out.println("В вагоне остались только стоячие места !");
        } else {
            System.out.println("В вагоне нет мест !!!");
        }
    }

//    Здесь не поянл что нужно делать....
    public static void task_7() {
        System.out.println("task - 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one < two) {
            System.out.println("Один меньше двух");
        } else if (two < three) {
            System.out.println("Два меньше трех");
        } else {
            System.out.println("Три больше двух и одного");
        }



    }

}
