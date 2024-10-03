package colecciones.Arraylist.pruebaArraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList<>();

        Automovil auto1 = new Automovil("ojasfojas","asdasd");
        Persona persona1 = new Persona("aofka","kfaofkew");

        lista.add(auto1);
        lista.add(persona1); 
    }
}
