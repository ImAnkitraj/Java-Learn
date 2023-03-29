public class Movie {
    protected String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + "is a " + instanceType + " file");
    }

    public static Movie getMovie(String type, String title){
        switch(type.toUpperCase().charAt(0)) {
            case 'A': return new Adventure(title);
            case 'C': return new Comedy(title);
            default: {
                return new Movie(title);
            }
        }
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " file");
    }

    public void watchAdventure() {
        System.out.println("Watching adventure movie");
    }
}
class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " file");
        System.out.printf("...%s\n".repeat(3), "Hello", "hi", "bye");
    }

    public void watchComedy() {
        System.out.println("Watching comedy movie");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        System.out.println(title + " is a " + this.getClass().getSimpleName() + " file");
    }

    public void watchScienceFiction() {
        System.out.println("Watching science fiction movie");
    }
}