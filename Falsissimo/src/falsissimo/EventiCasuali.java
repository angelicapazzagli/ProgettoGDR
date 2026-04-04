/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.util.Random;

/**
 *
 * @author pazzagli.angelica
 */
public class EventiCasuali {
    public static String perquisizione(FabrizioCorona fabrizio) {
        Random random = new Random();
        fabrizio.soldi -= random.nextInt(fabrizio.getSoldi());
        fabrizio.checkSoldi();
        return "Perquisizione andata male. (soldi -*)";
    }
    
    public static String sabotaggio(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() < 7) {
            fabrizio.soldi -= 5000;
            fabrizio.checkSoldi();
            return "Tentativo di sabotaggio, astuzia insufficiente. (soldi -5.000)";
        }
        fabrizio.astuzia++;
        fabrizio.checkAstuzia();
        return "Tentativo di sabotaggio evitato. (astuzia +1)";
    }
    
    public static String ricatto(FabrizioCorona fabrizio) {
        Random random = new Random();
        int perc = random.nextInt(10);
        if(fabrizio.getAstuzia() > 8) {
            if(perc > 8) {
                fabrizio.soldi += fabrizio.getSoldi() / 2;
                return "Hai ricattato un VIP, i tuoi soldi aumentano di 1/2 del tuo conto. (soldi +*)";
            }
            fabrizio.soldi += fabrizio.getSoldi() / 6;
            return "Hai ricattato un VIP, i tuoi soldi aumentano di 1/6 del tuo conto. (soldi +*)";
        }
        fabrizio.soldi -= 7000;
        fabrizio.checkSoldi();
        return "Hai provato a ricattare un VIP ma non è andata a buon fine. (soldi -7.000)";
    }
    
    public static String vociNegative(FabrizioCorona fabrizio) {
        fabrizio.fama -= 1;
        fabrizio.checkFama();
        return "Voci false diffuse sul tuo conto. (fama -2)";
    }
    
    public static String truffa(FabrizioCorona fabrizio) {
        fabrizio.soldi -= 10000;
        fabrizio.checkSoldi();
        fabrizio.astuzia -= 1;
        fabrizio.checkAstuzia();
        return "Sei stato truffato. (soldi -25.000) (astuzia -2)";
    }
    
    public static String intervistaBelve(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 8) {
            fabrizio.astuzia++;
            fabrizio.checkAstuzia();
            return "Francesca Fagnani ti fa una domanda scomoda, riesci a cavartela grazie alla tua astuzia. (astuzia +1)";
        }
        fabrizio.fama -= 2;
        fabrizio.getFama();
        return "Francesca Fagnani ti fa una domanda scomoda dalla quale non riesci a scappare. (fama -2)";
    }
    
    public static String incontroBelen(FabrizioCorona fabrizio) {
        if(fabrizio.getFama() >=9) {
            fabrizio.soldi += 15000;
            fabrizio.fama = 10;
            return "Sei riuscito ad incontrare Belen e ti ci hanno paparazzato. (soldi +15.000) (fama +1)";
        }
        fabrizio.fama--;
        fabrizio.checkFama();
        return "Hai incontrato Belen ma hai fatto una brutta figura. (fama -1)";
    }
    
    public static String litigioIlary(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 6) {
            fabrizio.fama += 2;
            fabrizio.checkFama();
            return "Litigata in diretta con Ilary, riesci a sfruttare il momento. (fama +2)";
        }
        fabrizio.fama -= 2;
        fabrizio.checkFama();
        return "Litigata in diretta con Ilary, perdi consensi. (fama -2)";
    }
    
    public static String paparazzata(FabrizioCorona fabrizio) {
        Random random = new Random();
        int guadagno = random.nextInt(10000) + 1000;
        fabrizio.soldi += guadagno;
        fabrizio.astuzia++;
        fabrizio.checkAstuzia();
        return "Hai organizzato una paparazzata appositamente. (soldi +*) (astuzia +1)";
    }

    public static String causaLegale(FabrizioCorona fabrizio) {
        if(fabrizio.getSoldi() > 10000) {
            fabrizio.soldi -= 10000;
            return "Hai abbastanza soldi per evitare la causa. (soldi -10.000)";
        }
        fabrizio.fama -= 1;
        fabrizio.getFama();
        return "Immagine intaccata. (fama -1)";
    }

    public static String scoopEsclusivo(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 7) {
            fabrizio.soldi += 20000;
            fabrizio.fama += 2;
            fabrizio.checkFama();
            return "Grazie alla tua astuzia hai ottenuto uno scoop esclusivo. (soldi +20000)(fama +2)";
        }
        fabrizio.fama -= 1;
        fabrizio.checkFama();
        return "Astuzia insufficiente per scoprire gossip importanti, i tuoi contatti diminuiscono. (fama -1)";
    }
    
    public static String arrestoDefinitivo(FabrizioCorona fabrizio) {
        fabrizio.soldi = 0;
        fabrizio.fama = 0;
        fabrizio.astuzia = 0;
        return "Sei stato incastrato in situazioni pericolose. Fine della carriera. (GAME OVER)";
    }
    
    public static String estraiEvento(FabrizioCorona fabrizio) {
        Random random = new Random();
        if(random.nextInt(100) == 0) {
            return arrestoDefinitivo(fabrizio);
        }
        int ev = random.nextInt(11);
        switch(ev) {
            case 0:
                return perquisizione(fabrizio);
            case 1:
                return sabotaggio(fabrizio);
            case 2:
                return ricatto(fabrizio);
            case 3:
                return intervistaBelve(fabrizio);
            case 4:
                return incontroBelen(fabrizio);
            case 5:
                return litigioIlary(fabrizio);
            case 6:
                return paparazzata(fabrizio);
            case 7:
                return causaLegale(fabrizio);
            case 8:
                return scoopEsclusivo(fabrizio);
            case 9:
                return vociNegative(fabrizio);
            case 10:
                return truffa(fabrizio);
        }
        return "Nessun evento";
    }
}
