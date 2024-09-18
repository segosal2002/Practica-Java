public class Auto{
    private String Marca;
    private String Modelo;
    private int Anio;
    private double precioVenta;

    public Auto(){

    }

    public Auto(String Marca, String Modelo, int Anio, double precioVenta){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Anio = Anio;
        this.precioVenta = precioVenta;
    }

    public String getMarca(){
        return this.Marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public int getAnio(){
        return this.Anio;
    }
    public double getPrecioVenta(){
        return this.precioVenta;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public void setAnio(int Anio){
        this.Anio = Anio;
    }
    public void setPrecioVenta(double precioVenta){
        this.precioVenta = precioVenta;
    }

    public String toString(){
        return "Auto( " + " Marca = " + this.Marca + " Modelo = " + this.Modelo + " Año = " + this.Anio + " Precio de venta: " + this.precioVenta; 
    }
}