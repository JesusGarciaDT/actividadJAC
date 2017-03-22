package programajesus;

public class ProgramaJesus {
    
    public static void porcentajeBarca(double numerobarça, double numeroalumnos){
        
        double resultado;
        
        resultado=numerobarça*100/numeroalumnos;
        
        System.out.println("El porcentaje de alumnos que quiere que gane el barça es: "+resultado);
    }
    
    
    public static void porcentajeMadrid(double numeromadrid, double numeroalumnos){
        
        double resultado;
        
        resultado=numeromadrid*100/numeroalumnos;
        
        System.out.println("El porcentaje de alumnos que quiere que no se clasefique el madrid es: "+resultado);
    }

    public static void main(String[] args) {
        
        porcentajeBarca(13,30);
        porcentajeMadrid(7,30);
        
    }
    
}