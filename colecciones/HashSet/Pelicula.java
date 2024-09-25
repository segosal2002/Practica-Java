public class Pelicula {
    private int codigo;
    private String titulo;
    private float precio;
    private String tipo;

    public Pelicula(int codigo, String titulo, float precio, String tipo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.tipo = tipo;


    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
