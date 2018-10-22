package app;

import main.main;
import other.ProfessorAccions;
import other.RecorrerLLista;

/**
 *
 * @author mblan
 */
public class app {

    public static void main(String[] args) {
        
        main.LlistarProfessors();
        RecorrerLLista.avaluarProfessorsAmbServei();
        ProfessorAccions.veure();
        
    }
    
}
