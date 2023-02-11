package kursovik.zadachiKurs;

public class PolindromString {

    public static void main(String[] args) {

        System.out.println(isPolindrom("Ann"));
    }

    public static boolean isPolindrom(String str){
        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}
