package lessons_2.dz1;


public class Hogwarts {
    private int magic;
    private int transgress;
    private String name;
    private String middleName;

    public Hogwarts(int magic, int transgress, String name, String middleName) {
        this.magic = magic;
        this.transgress = transgress;
        this.name = name;
        this.middleName = middleName;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                );
    }


}
