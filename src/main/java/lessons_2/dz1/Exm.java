package lessons_2.dz1;

import java.util.Random;

public class Exm {

    public static void main(String[] args) {

        Gryffindor garryPotter = new Gryffindor(
                1, 1, "Гарри", "Поттер",
                1, 1,1);
        Gryffindor germionaGredge = new Gryffindor(
                1, 1, "Гермиона", "Грейнджер",
                1, 1,1);
        Gryffindor ronUzle = new Gryffindor(
                1, 1, "Рон", "Уизли",
                1, 1,1);


        Slytherin dracoMalfoy = new Slytherin(4, 4, "Драко", "Малфой",
                4, 4, 4, 4, 4);
        Slytherin grehomMontegu = new Slytherin(4, 4, "Грэхэм", "Монтегю",
                4, 4, 4, 4, 4);
        Slytherin gregoryGoil = new Slytherin(4, 4, "Грегори", "Гойл",
                4, 4, 4, 4, 4);


        Hufflepuff zahariaSmit = new Hufflepuff(2, 2, "Захария", "Смит",
                2, 2, 2);
        Hufflepuff sederikDegory = new Hufflepuff(2, 2, "Седрик", "Диггори",
                2, 2, 2);
        Hufflepuff gastinFinch = new Hufflepuff(2, 2, "Джастин", "Финч-Флетчли",
                2, 2, 2);


        Ravenclaw dgouChang = new Ravenclaw(3, 3, "Чжоу", "Чанг",
                3,3, 3, 3);
        Ravenclaw padmaPlati = new Ravenclaw(3, 3, "Падма", "Патил",
                3,3, 3, 3);
        Ravenclaw markusBelbi = new Ravenclaw(3, 3, "Маркус", "Белби",
                3,3, 3, 3);


        gregoryGoil.printWizard();
        garryPotter.printWizard();


    }
}
