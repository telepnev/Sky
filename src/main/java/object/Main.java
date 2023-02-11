package object;

public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author mihailBulgakov = new Author("Михаил", "Булгаков");

        Book warAndPeace = new Book("Война и мир", levTolstoi, 2001);
        Book masterMargarita = new Book("Мастер и Маргарита", mihailBulgakov, 1999);

        warAndPeace.setYearPublication(2023);
        masterMargarita.setYearPublication(2023);

        System.out.println(warAndPeace.getBook() + " - " + warAndPeace.getAuthor() + " - " + warAndPeace.getYearPublication());
        System.out.println(masterMargarita.getBook() + " - " + masterMargarita.getAuthor() + " - " + masterMargarita.getYearPublication());
    }
}
