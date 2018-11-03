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

    public static String portafoli = null, educacioFisica = null, emprenedoria = null;
    public static List<ProfessorAccions> profs = new ArrayList<>();
    
    public static void LlistarProfessors() {
        
        String jordiBosch_Assignatures[] = {"Català", "Llatí", "Castellà", };
        ProfessorAccions Jordi_Bosch = new ProfessorAccions("Jordi Bosch", jordiBosch_Assignatures, false, 0);//(nom, assignatures, volServei)
        profs.add(Jordi_Bosch);

        String davidHugas_Assignatures[] = {"Informàtica i Tecnologia", "Física i Química"};
        ProfessorAccions David_Hugas = new ProfessorAccions("David Hugas", davidHugas_Assignatures, true, 5);
        profs.add (David_Hugas);

        String annaMartinez_Assignatures[] = {"Anglès", "Emprenedoria", "Socials"};
        ProfessorAccions Anna_Martinez = new ProfessorAccions("Anna Martínez", annaMartinez_Assignatures, true, 15);
        profs.add (Anna_Martinez);
        
        String ramon_Assignatures[] = {"Tutoria", "Educació Física"};
        ProfessorAccions ramon = new ProfessorAccions("Ramón", ramon_Assignatures, true, 10);
        profs.add (ramon);
        
        String estefania_Assignatures[] = {"Mates"};
        ProfessorAccions estefania = new ProfessorAccions("Estefania", estefania_Assignatures, false, 0);
        profs.add (estefania);
        
    }
    
    public static void EstablirHorari(){
        
        LlistaAssignatures.EstablirHorari(
                /*Dilluns*/
                "Català", "Castellà", /*Pati*/portafoli, "Tutoria", /*Pati*/"Mates", "Socials", 
                
                /*Dimarts*/
                "Mates", "Informàtica i Tecnologia", /*Pati*/"Llatí", "Francès", /*Pati*/"Anglès", "Castellà", 
                
                /*Dimecres*/
                "Socials", educacioFisica, /*Pati*/"Anglès", "Mates", /*Pati*/"Català", "Llatí", 
                
                /*Dijous*/
                emprenedoria, "Francès", /*Pati*/"Català", "Informàtica i Tecnologia", /*Pati*/"Castellà", "Socials", 
                
                /*Divendres*/
                "Llatí", "Mates", /*Pati*/"Francès", "Anglès", /*Pati*/educacioFisica, "Informàtica i Tecnologia");
        
    }

}
