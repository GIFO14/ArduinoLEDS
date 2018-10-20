package other;

/**
 *
 * @author mblan
 */
public class RecorrerLLista {
    
    public static void avaluarProfessorsAmbServei(){
        
        LlistaProfessors.profs.forEach(x -> x.volServei());
        
    }
    
}
