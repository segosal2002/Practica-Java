package colecciones.Arraylist.PeliculasPremiadas;

import java.util.ListIterator;
import java.util.ArrayList;

public class ListaPeliculasPremiadas {

        ArrayList<PeliculaPremiada> listaPeliculasPremiadas = new ArrayList<>();
        ListIterator<PeliculaPremiada> it = listaPeliculasPremiadas.listIterator();

        public void agregarPelicula(PeliculaPremiada pelicula){
            if (!listaPeliculasPremiadas.contains(pelicula)){
                listaPeliculasPremiadas.add(pelicula);
            }
        }


    }

