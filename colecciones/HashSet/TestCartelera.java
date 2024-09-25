import java.util.HashSet;
public class TestCartelera {
    public static void main(String[] args) {

        Pelicula p1 = new Pelicula(534123, "Reyes de las Olas", 12.32, "Comedia");
        Pelicula p1 = new Pelicula(867426, "Zoolander", 52.23, "Comedia");
        Pelicula p1 = new Pelicula(592365, "Yo, Robot", 64.54, "Acción");
        Pelicula p1 = new Pelicula(855369, "Shrek", 234.52, "Comedia");
        Pelicula p1 = new Pelicula(672974, "La La Land", 85.75, "Musical");

        HashSet<Pelicula> peliculas = new HashSet<>();

        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p4);
        peliculas.add(p5);

    }
}
