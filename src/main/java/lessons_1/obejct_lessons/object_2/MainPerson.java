package lessons_1.obejct_lessons.object_2;

public class MainPerson {
    public static void main(String[] args) {
        PersonService ps = new PersonService();
        Person evgeny = new Person("Evgeny", 17);

        System.out.println(evgeny);

        if (ps.isAdult(evgeny)) {
            System.out.println(" Go to bar !");
        } else {
            System.out.println("Go to school !");
        }
    }
}
