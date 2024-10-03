package colecciones.Arraylist.pruebaArraylist;

public class Automovil {
    private static int cantidadRuedas = 4;
    private String marca;
    private String modelo;

    public Automovil() {
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public static int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public static void setCantidadRuedas(int cantidadRuedas) {
        Automovil.cantidadRuedas = cantidadRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
