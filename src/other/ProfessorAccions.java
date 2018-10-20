package other;

import afegirMinuts.afegirMinuts;
import objects.Professor;

/**
 *
 * @author mblan
 */
public class ProfessorAccions extends Professor{
    
    public ProfessorAccions(String nom, String[] assignatura, boolean volServei, int minuts){
        
        this.nom = nom;
        this.assignatura = assignatura;
        this.volServei = volServei;
        this.minutsPreAvis = minuts;
        
    }
    
    public void volServei() {
        
        if(volServei){
            
            afegirMinuts.volServei(minutsPreAvis, this);
            
        }
        
    }
    
    public static void veure(){
        
        LlistaProfessorsAmbServei.profsAmbServei.forEach(x -> System.out.println(x.nom));
        
    } 
    
}
