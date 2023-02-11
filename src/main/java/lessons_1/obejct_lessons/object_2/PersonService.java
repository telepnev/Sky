package lessons_1.obejct_lessons.object_2;

public class PersonService {
    public boolean isAdult(Person person) {
        return person.getAge() > 18;
    }
}
