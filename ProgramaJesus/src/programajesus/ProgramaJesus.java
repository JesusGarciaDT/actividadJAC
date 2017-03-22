package programajesus;

public class ProgramaJesus {
    
    public static void porcentaje(double numerobarça, double numeroalumnos){
        
        double resultado;
        
        resultado=numerobarça*100/numeroalumnos;
        
        System.out.println("El porcentaje de alumnos que quiere que gane el barça es: "+resultado);
    }

    public static void main(String[] args) {
        
        porcentaje(12,30);
        
    }
    
}