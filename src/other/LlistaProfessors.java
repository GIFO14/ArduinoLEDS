package other;

import java.util.ArrayList;
import java.util.List;
import objects.Professor;

/**
 *
 * @author mblan
 */
public class LlistaProfessors {

    public static List<ProfessorAccions> profs = new ArrayList<>();
    
    public static void LlistarProfessors() {
        
        String jordiBosch_Assignatures[] = {"Català", "Llatí", "Castellà"};
        ProfessorAccions Jordi_Bosch = new ProfessorAccions("Jordi Bosch", jordiBosch_Assignatures, true, 15);//(nom, assignatures, volServei)
        profs.add(Jordi_Bosch);

        String davidHugas_Assignatures[] = {"Informàtica i Tecno", "Física i Química"};
        ProfessorAccions David_Hugas = new ProfessorAccions("David Hugas", davidHugas_Assignatures, true, 5);
        profs.add (David_Hugas);

        String mariaRojo_Assignatures[] = {"Castellà"};
        ProfessorAccions Maria_Rojo = new ProfessorAccions("María Rojo", mariaRojo_Assignatures, false, 0);
        profs.add (Maria_Rojo);
        
    }

}
