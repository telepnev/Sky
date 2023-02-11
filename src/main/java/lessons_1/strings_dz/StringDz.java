package lessons_1.strings_dz;

public class StringDz {
    public static void main(String[] args) {
        taskString_01();
        taskString_02();
        taskString_03();
    }

    public static void taskString_01() {
        String firstName = " Evgeny";
        String middleName = " Sergeevich";
        String lastName = " Telepnev";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    }

    public static void taskString_02() {
        String fio = "Ivanov Ivan Ivanovich";
        String fullName = fio.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void taskString_03() {
        String fio = "Иванов Семён Семёнович";
        String fullName = fio.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
