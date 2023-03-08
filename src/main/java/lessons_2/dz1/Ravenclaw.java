package lessons_2.dz1;

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(int magic, int transgress, String name, String middleName, int smart, int wise, int witty, int creativity) {
        super(magic, transgress, name, middleName);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Слизерине : " + " ум - " + getSmart()
                                + ", мудрость -" + getWise()
                                + ", остроумие - " + getWitty()
                                + ", творчество - " + getCreativity()

                );
        System.out.println();
    }
}
