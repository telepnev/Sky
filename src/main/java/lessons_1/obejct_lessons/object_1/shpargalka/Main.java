package lessons_1.obejct_lessons.object_1.shpargalka;

import lessons_1.obejct_lessons.object_2.shpargalka.NumberUtility;

public class Main {
    public static void main(String[] args) {
        String phoneNumber1 = "8(916)-111-11-11";

        System.out.println(NumberUtility.removeSymbols(phoneNumber1));
        System.out.println(NumberUtility.validateCountry(phoneNumber1));

    }
}
