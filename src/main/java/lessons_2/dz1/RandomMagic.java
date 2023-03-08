package lessons_2.dz1;

import java.util.Random;

public class RandomMagic {
    final Random r = new Random();
    private int randomMagic = r.nextInt(0, 100);
    private int randomTransgress = r.nextInt(0, 100);
    private int randomNobility = r.nextInt(0, 100);
    private int randomHonor = r.nextInt(0, 100);
    private int randomBravery = r.nextInt(0, 100);
    private int randomHardworking = r.nextInt(0, 100);
    private int randomLoyal = r.nextInt(0, 100);
    private int randomHonest = r.nextInt(0, 100);
    private int randomSmart = r.nextInt(0, 100);
    private int randomWise = r.nextInt(0, 100);
    private int randomWitty = r.nextInt(0, 100);
    private int randomCreativity = r.nextInt(0, 100);

    public int getRandomSmart() {
        return randomSmart;
    }

    public int getRandomWise() {
        return randomWise;
    }

    public int getRandomWitty() {
        return randomWitty;
    }

    public int getRandomCreativity() {
        return randomCreativity;
    }

    public int getRandomHardworking() {
        return randomHardworking;
    }

    public int getRandomLoyal() {
        return randomLoyal;
    }

    public int getRandomHonest() {
        return randomHonest;
    }

    public int getRandomMagic() {
        return randomMagic;
    }

    public int getRandomTransgress() {
        return randomTransgress;
    }

    public int getRandomNobility() {
        return randomNobility;
    }

    public int getRandomHonor() {
        return randomHonor;
    }

    public int getRandomBravery() {
        return randomBravery;
    }
}
