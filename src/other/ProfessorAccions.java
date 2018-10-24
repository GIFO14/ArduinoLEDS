package other;

import afegirMinuts.afegirMinuts;
import objects.Professor;

/**
 *
 * @author mblan
 */
public class ProfessorAccions extends Professor{
    
    public ProfessorAccions(String nom, String[] assignatures, boolean volServei, int minuts){
        
        this.nom = nom;
        this.assignatures = assignatures;
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
    
    public void recorrerArray(){
        
        for(int i = 0; i<assignatures.length; i++){
            
            if(assignatures[i].equalsIgnoreCase(LlistaAssignatures.horari[LlistaAssignatures.n])){//Si és la mateixa assignatura que toca ara
                
                if(volServei){
                
                    //S'activi temporitzador
                    
                }
                
            }
            
        }

    }
    
}
