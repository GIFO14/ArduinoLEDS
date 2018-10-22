package other;

import java.util.concurrent.TimeUnit;


/**
 *
 * @author mblan
 */
public class EscollirAssignatura {

    public static String assignatura;
    
    public static void EscollirAssignatura(int i, String[] strArray) {

        try {
            
            for (int j = 0; j < LlistaAssignatures.horari.length; j++) {

                if (strArray[i].equalsIgnoreCase(LlistaAssignatures.horari[j])) {

                    j = 0;
                    
                    assignatura = strArray[i];
                    
                    try {
                    
                        TimeUnit.HOURS.sleep(1);
                    
                    } catch (Exception e) {
                    }

                }

            }
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }

    }

}
