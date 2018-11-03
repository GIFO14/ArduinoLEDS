package other;

import java.util.concurrent.TimeUnit;
import main.Main;

/**
 *
 * @author mblan
 */
public class LlistaAssignatures {

    public static String[] horari = new String[30];

    public static short n, i = 0;

    public static void EstablirHorari(/*Dilluns*/String a1, String a2,/*Pati*/ String a3, String a4,/*Pati*/ String a5, String a6,
            /*Dimarts*/ String a7, String a8,/*Pati*/ String a9, String a10,/*Pati*/ String a11, String a12,
            /*Dimecres*/ String a13, String a14,/*Pati*/ String a15, String a16,/*Pati*/ String a17, String a18,
            /*Dijous*/ String a19, String a20,/*Pati*/ String a21, String a22,/*Pati*/ String a23, String a24,
            /*Divendres*/ String a25, String a26,/*Pati*/ String a27, String a28,/*Pati*/ String a29, String a30) {

        horari[0] = a1;
        horari[1] = a2;
        horari[2] = a3;
        horari[3] = a4;
        horari[4] = a5;
        horari[5] = a6;
        horari[6] = a7;
        horari[7] = a8;
        horari[8] = a9;
        horari[9] = a10;
        horari[10] = a11;
        horari[11] = a12;
        horari[12] = a13;
        horari[13] = a14;
        horari[14] = a15;
        horari[15] = a16;
        horari[16] = a17;
        horari[17] = a18;
        horari[18] = a19;
        horari[19] = a20;
        horari[20] = a21;
        horari[21] = a22;
        horari[22] = a23;
        horari[23] = a24;
        horari[24] = a25;
        horari[25] = a26;
        horari[26] = a27;
        horari[27] = a28;
        horari[28] = a29;
        horari[29] = a30;

    }

    public static void SaberProfessorAssignaturaActual() {

        Main.profs.forEach(x -> x.recorrerArray());
        n++;

    }

    public static void TimerPati() {

        short m = 25;

        if (n != 0 && n % 2 == 0) {

            if (i == 1) {

                m = 20;

            }

            try {

                TimeUnit.MINUTES.sleep(m);
                i++;

            } catch (Exception e) {

                System.out.println(e);

            }

        } else {

            System.out.println("No toca pati.");

        }

    }

    public static void TimerDescansTarda() {

        if ((n + 1) % 6 == 0) {

            try {

                TimeUnit.HOURS.sleep(17);
                TimeUnit.MINUTES.sleep(15);
                i = 0;

            } catch (Exception e) {

                System.out.println(e);

            }

        } else {

            System.out.println("No toca decans de tarda.");

        }

    }

    public static void TimerDecansCapDeSetmana() {

        if (n == 30) {
            
            try {

                TimeUnit.DAYS.sleep(2);
                TimeUnit.HOURS.sleep(17);
                TimeUnit.MINUTES.sleep(15);

            } catch (Exception e) {

                System.out.println(e);

            }
            
        } else {

            System.out.println("No toca cap de setmana.");

        }

    }

}
