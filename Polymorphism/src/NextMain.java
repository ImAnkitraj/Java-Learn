public class NextMain  {
    public static void main(String[] args) {
        Adventure adv = (Adventure) Movie.getMovie("Ad", "Pirates of Carribean");
        adv.watchMovie();;

        Object comedy = Movie.getMovie("C", "DHamaal");
        Comedy comedyMovie = (Comedy)comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("A", "Airplane");
        airplane.watchMovie();

        Object unknownObj = Movie.getMovie("A ", "Dhoom");

        if(unknownObj.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObj;
            c.watchComedy();
        }
        else if(unknownObj instanceof  Adventure) {
            ((Adventure)unknownObj).watchAdventure();
        }

//        Not supported in java 11
//        else if(unknownObj instanceof  ScienceFiction scifi) {
//            scifi.watchScienceFiction();
//        }
    }
}
