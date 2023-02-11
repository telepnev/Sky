package lessons_1.obejct_lessons.object_2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isAdult() {
        return age > 18;
    }

    public int getAge() {
        return age;
    }

    public void increaseAge(int increase) {
        if (increase < 0) {
            throw new IllegalArgumentException("Инкримет не может быть отрицательным");
        }
        this.age += increase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}
