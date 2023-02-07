package object;

public class Main {
    public static void main(String[] args) {
        Author levTolstoi = new Author("Лев", "Толстой");
        Author mihailBulgakov = new Author("Михаил", "Булгаков");

        Book warAndPeace = new Book("Война и мир", levTolstoi, 2023);
        Book masterMargarita = new Book("Мастер и Маргарита", mihailBulgakov, 2023);

        warAndPeace.setYearPublication(1868);
        masterMargarita.setYearPublication(1940);

        System.out.println(warAndPeace.getBook() + " - " + warAndPeace.getAuthor() + " - " + warAndPeace.getYearPublication());
        System.out.println(masterMargarita.getBook() + " - " + masterMargarita.getAuthor() + " - " + masterMargarita.getYearPublication());
    }
}
