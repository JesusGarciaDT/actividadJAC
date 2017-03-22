package programajesus;

public class ProgramaJesus {
    
    public static double porcentajeBarca(double numerobarça, double numeroalumnos){
        
        double resultado;
        
        resultado=numerobarça*100/numeroalumnos;
        
        return resultado;
    }
    
    public static double porcentajeMadrid(double numeromadrid, double numeroalumnos){
        
        double resultado;
        
        resultado=numeromadrid*100/numeroalumnos;
        
        return resultado;
    }
    
    public static int diferencia(int numerobarça,int numeromadrid){
        
        int x=numerobarça-numeromadrid;
        
        return x;
    }
   
    public static void main(String[] args) {
        
        double encuestabarca=porcentajeBarca(13,30);
        double encuestamadrid=porcentajeMadrid(7,30);
        
        if(encuestabarca==encuestamadrid){
            System.out.println("¿De verdad no queremos un partido de la Champions Barça-Real Madrid?");
        }else{
            System.out.println("Menos mal que hay "+diferencia(13,7)+" sensat@s");
        }
        
        
    }
    
}