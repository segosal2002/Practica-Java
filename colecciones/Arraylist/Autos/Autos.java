//package colecciones.Arraylist.Autos;
//
//import java.util.ArrayList;
//import java.util.ListIterator;
//import java.util.Scanner;
//
//public class Autos{
//    public static void main(String[] args) {
//        ArrayList <Auto> lista = new ArrayList<>();
//        ListIterator <Auto> it = lista.listIterator();
//        Scanner sc = new Scanner(System.in);
//        double sumaPrecioVenta = 0.0;
//        int contadorAutos = 0;
//        while(true){
//            System.out.println("Ingrese la marca del auto: ");
//            String marca = sc.nextLine();
//            if (marca.equals(" ")){
//                break;
//            }
//            System.out.println("Ingrese el modelo del auto: ");
//            String modelo = sc.nextLine();
//
//            System.out.println("Ingrese el año del auto: ");
//            Integer anio = sc.nextInt();
//
//            System.out.println("Ingrese el precio de venta del auto: ");
//            double precioVenta = sc.nextDouble();
//            sumaPrecioVenta = sumaPrecioVenta + precioVenta;
//
//            Auto auto = new Auto(marca,modelo,anio,precioVenta);
//            lista.add(auto);
//            contadorAutos++;
//
//        }
//
//        while(it.hasNext()){
//            Auto auto = it.next();
//            System.out.println(auto);
//        }
//
//        System.out.println("Promedio de precio de venta de autos: " +(sumaPrecioVenta/contadorAutos));
//
//        System.out.println("Ingrese el modelo a buscar: ");
//        String modeloBuscado = sc.nextLine();
//        public static boolean buscarAutoPorModelo(ArrayList<Auto> auto, String modeloBuscado) {
//            for (Auto auto : auto) {
//                if (auto.getModelo().equals(modeloBuscado)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//
//
//    }
//}
