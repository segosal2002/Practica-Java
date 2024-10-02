package colecciones.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListaEmpleado {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        Empleado e1 = new Empleado("Juan", "Gomez", 23123, 1989,4,12);
        Empleado e2 = new Empleado("Jose", "Gomez", 28123, 1989,4,12);
        Empleado e3 = new Empleado("Juana", "Gomez", 43123, 1970,6,25);
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);

        Collections.sort(lista);

        ListIterator<Empleado> it = lista.listIterator();

        while (it.hasNext()){
            Empleado empleado = it.next();
            System.out.println(empleado);
        }


    }


}
