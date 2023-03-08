package lessons_2.dz1;

public class Gryffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(int magic, int transgress, String name, String middleName, int nobility, int honor, int bravery) {
        super(magic, transgress, name, middleName);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void printWizard() {
        System.out.println
                (
                        "Ученик Хогвартс: " + getName() + " " + getMiddleName()
                                + ", магия - " + getMagic() + ", расстояние трансгресии - " + getTransgress()
                                + "\n факультет Гриффиндор : " + " благородство, - " + getNobility()
                                + ", честь -" + getHonor()
                                + ", храбрость - " + getBravery()

                );
        System.out.println();
    }


}
