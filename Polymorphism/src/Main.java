public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Movie m = Movie.getMovie("Adventure", "One Piece");
        Movie c = new Comedy("One Piece");
        c.watchMovie();
        m.watchMovie();
    }
}