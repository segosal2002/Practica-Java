package empresa;

public class producto {
    private String fechaVencimiento;
    private int numeroLote;

    public producto(){

    }

    public producto(String fechaVencimiento, int numeroLote){
        this.fechaVencimiento = fechaVencimiento;
        this.numeroLote = numeroLote;
    }
    
    public String getFechaVencimiento(){
        return this.fechaVencimiento;
    }

    public int getNumeroLote(int numeroLote){
        return this.numeroLote;
    }

    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNumeroLote(int numeroLote){
        this.numeroLote = numeroLote;
    }

}
