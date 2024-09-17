package empresa;

public class productoFresco extends producto {
    private String fechaEnvasado;

    public productoFresco(String fechaVencimiento, int numeroLote,String fechaEnvasado){
        super(fechaVencimiento,numeroLote);
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getFechaEnvasado(){
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado){
        this.fechaEnvasado = fechaEnvasado;
    }
    
    

}
