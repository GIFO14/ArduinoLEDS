package main;

import java.util.ArrayList;
import java.util.List;
import other.LlistaAssignatures;
import other.ProfessorAccions;

/**
 *
 * @author mblan
 */
public class Main {

    public static List<ProfessorAccions> profs = new ArrayList<>();
    
    public static void LlistarProfessors() {
        
        String jordiBosch_Assignatures[] = {"Català", "Llatí", "Castellà", };
        ProfessorAccions Jordi_Bosch = new ProfessorAccions("Jordi Bosch", jordiBosch_Assignatures, false, 0);//(nom, assignatures, volServei)
        profs.add(Jordi_Bosch);

        String davidHugas_Assignatures[] = {"Informàtica i Tecnologia", "Física i Química"};
        ProfessorAccions David_Hugas = new ProfessorAccions("David Hugas", davidHugas_Assignatures, true, 5);
        profs.add (David_Hugas);

        String annaMartinez_Assignatures[] = {"Anglès", "Emprenedoria", "Socials"};
        ProfessorAccions Maria_Rojo = new ProfessorAccions("María Rojo", annaMartinez_Assignatures, true, 15);
        profs.add (Maria_Rojo);
        
    }
    
    public static void EstablirHorari(){
        
        LlistaAssignatures.EstablirHorari("Català", "Castellà", "Portafoli", "Tutoria", "Mates", "Socials", "Mates", "Informàtica i Tecnologia", "Física i Química", "Cinema i Escena", "Anglès", "Castellà", "Socials", a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24, a25, a26, a27, a28, a29, a30);
        
    }

}
