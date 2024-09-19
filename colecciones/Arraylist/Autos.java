import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Autos {
public static void main (String [] args) {
    String Marca;
    String Modelo;
    int Anio;
    double precioVenta;

    List<Auto> Vehiculos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    do{
        System.out.println("Ingrese la marca: ");
        Marca =sc.nextLine();
        if(Marca.isEmpty()){
            break;
        }
        System.out.println("Ingrese el modelo: ");
        Modelo = sc.nextLine();
        System.out.println("Ingrese el Año: ");
        Anio = sc.nextInt();
        System.out.println("Ingrese el precio: ");
        precioVenta = sc.nextDouble();

        Auto auto = new Auto(Marca,Modelo,Anio,precioVenta);
        Vehiculos.add(auto);
    }while(true);
    System.out.println(Vehiculos.size());


}
}
