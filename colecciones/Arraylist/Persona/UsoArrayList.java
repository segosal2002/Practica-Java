package Persona;


import java.util.ArrayList;

public class UsoArrayList {

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona per1 = new Persona("823985456","Gomez","Sergio","11/12/2000");
        Persona per2 = new Persona("809468046","Gomez","José","28/07/1990");
        Persona per3 = new Persona("249856798","Gomez","Rafael","23/04/1971");
        Persona per4 = new Persona("928345632","Gomez","Raúl","11/12/1961");
        personas.add(per1);
        personas.add(per2);
        personas.add(per3);

        System.out.println(personas.size());
        System.out.println(personas.toString());
        personas.get(1).setApellido("Segovia");
        personas.set(2,per4);

        System.out.println(personas.toString());
        System.out.println(personas.get(1).getNombre());

        for(int contador = 0; contador<personas.size();contador++){
            System.out.println(personas.get(contador));
        }

    }
}
