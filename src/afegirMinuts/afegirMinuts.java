package afegirMinuts;

import objects.Professor;
import other.LlistaProfessorsAmbServei;
import other.ProfessorAccions;

/**
 *
 * @author mblan
 */
public class afegirMinuts{
    
    public static void volServei(int minuts, ProfessorAccions prof){
        
        avisar(prof, minuts);
        afegirALlistaProfsAmbServei(prof);
        
    }
    
    public static void avisar(ProfessorAccions prof, int minuts){
        
        prof.minutsPreAvis = minuts;
        
    }
    
    public static void afegirALlistaProfsAmbServei(ProfessorAccions prof){
        
        LlistaProfessorsAmbServei.profsAmbServei.add(prof);
        
    }
    
}
