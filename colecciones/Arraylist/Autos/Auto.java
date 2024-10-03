package colecciones.Arraylist.Autos;

public class Auto{
    private String Marca;
    private String Modelo;
    private Integer Anio;
    private Double PrecioVenta;

    public Auto() {
    }

    public Auto(String marca, String modelo, Integer anio, Double precioVenta) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Anio = anio;
        this.PrecioVenta = precioVenta;
    }

    public String getMarca() {
        return this.Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public Integer getAnio() {
        return this.Anio;
    }

    public void setAnio(Integer anio) {
        this.Anio = anio;
    }

    public Double getPrecioVenta() {
        return this.PrecioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.PrecioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Anio='" + Anio + '\'' +
                ", PrecioVenta=" + PrecioVenta +
                '}';
    }



}