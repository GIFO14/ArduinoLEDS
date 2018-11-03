package other;

import afegirMinuts.afegirMinuts;
import java.util.concurrent.TimeUnit;
import objects.Professor;

/**
 *
 * @author mblan
 */
public class ProfessorAccions extends Professor {

    public boolean checkVolServei;

    public ProfessorAccions(String nom, String[] assignatures, boolean volServei, int minuts) {

        this.nom = nom;
        this.assignatures = assignatures;
        this.volServei = volServei;
        this.minutsPreAvis = minuts;

    }

    public void volServei() {

        if (volServei) {

            afegirMinuts.volServei(minutsPreAvis, this);

        }

    }

    public void recorrerArray() {

        for (short i = 0; i < assignatures.length; i++) {

            if (i < assignatures.length && LlistaAssignatures.horari[LlistaAssignatures.n] != null && assignatures[i].equalsIgnoreCase(LlistaAssignatures.horari[LlistaAssignatures.n])) {//Si és la mateixa assignatura que toca ara

                if (volServei) {

                    System.out.println("Sóc " + nom + " i vull servei amb l'assignatura: " + assignatures[i]);

                    //S'activi temporitzador

                } else {

                    System.out.println("Sóc " + nom + " i no vull servei amb l'assignatura: " + assignatures[i]);

                    try {

                        TimeUnit.HOURS.sleep(1);

                    } catch (Exception e) {

                        System.out.println(e);

                    }
                    
                }
                
            } else if (LlistaAssignatures.horari[LlistaAssignatures.n] == null){
                
                System.out.println("Ara no toca cap assignatura...");
                
            }

        }

    }

}
