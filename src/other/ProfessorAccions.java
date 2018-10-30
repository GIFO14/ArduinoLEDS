package other;

import afegirMinuts.afegirMinuts;
import java.util.concurrent.TimeUnit;
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
    
    public void recorrerArray(){
        
        for(short i = 0; i<assignatures.length; i++){
            
            short n = 0, m = 25;
            
            if(i != 0 && i % 2 == 0){
            
                if(n == 1){
                    
                    m = 20;
                    
                }
                
                try{
                    
                    TimeUnit.MINUTES.sleep(m);
                    n++;
                    
                }catch(Exception e){
                    
                    System.out.println(e);
                    
                }
            
            } else if (assignatures[i].equalsIgnoreCase(LlistaAssignatures.horari[LlistaAssignatures.n])){//Si és la mateixa assignatura que toca ara
                
                if(volServei){
                
                    //S'activi temporitzador
                    
                }
                
            }
              
        }

    }
    
}
