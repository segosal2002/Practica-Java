package colecciones.HashSet.peliculas;

import java.util.HashSet;
import java.util.Set;

public class TestCartelera {
    public static void main(String[] args) {
        Set <Peliculas> lista = new HashSet<>();
        Peliculas p1 = new Peliculas (194738,"Zoolander",32243,"Comedia");
        Peliculas p2 = new Peliculas (953278,"Reyes de las Olas",59305,"Comedia");
        Peliculas p3 = new Peliculas (583967,"Shrek",29847,"Comedia");
        Peliculas p4 = new Peliculas (568208,"Monstruos vs Aliens",25948,"Comedia");
        Peliculas p5 = new Peliculas (869306,"Wall-E",68450,"Comedia");
        Peliculas p6 = p5;
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        for (Peliculas peliculas : lista){
            System.out.println(peliculas.getTitulo() + " "+ peliculas.getCodigo());
        }

    }
}
