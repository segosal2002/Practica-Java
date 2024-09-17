package empresa;

public class productoRefrigerado extends productoFresco{
    private String codSupervision;
    private double tempRecomendada;
    
    public productoRefrigerado(){
        
    }

    public productoRefrigerado(String fechaEnvasado, String codSupervision, double tempRecomendada){
        super(fechaEnvasado);
        this.codSupervision = codSupervision;
        this.tempRecomendada = tempRecomendada;
    }
    
}
