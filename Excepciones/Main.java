package Excepciones;
import java.lang.Exception;
public class Main {
    public static void main(String[] args) {
        try{
            throw new Exception("Mensaje de error");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Mensaje que se imprime igual");
        }
    }
}

