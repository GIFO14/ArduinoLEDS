package other;

import main.main;

/**
 *
 * @author mblan
 */
public class RecorrerLLista {
    
    public static void avaluarProfessorsAmbServei(){
        
        main.profs.forEach(x -> x.volServei());
        
    }
    
}
