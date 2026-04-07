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
    public static Evento perquisizione(FabrizioCorona fabrizio) {
        Random random = new Random();
        fabrizio.soldi -= random.nextInt(fabrizio.getSoldi() / 2);
        fabrizio.checkSoldi();
        return new Evento("Perquisizione andata male. (soldi -*)", "/images/Perquisizione.png");
    }
    
    public static Evento sabotaggio(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() < 7) {
            fabrizio.soldi -= 5000;
            fabrizio.checkSoldi();
            return new Evento("Tentativo di sabotaggio, astuzia insufficiente. (soldi -5.000)", "/images/Sabotaggio.png");
        }
        fabrizio.astuzia++;
        fabrizio.checkAstuzia();
        return new Evento("Tentativo di sabotaggio evitato. (astuzia +1)", "/images/Sabotaggio.png");
    }
    
    public static Evento ricatto(FabrizioCorona fabrizio) {
        Random random = new Random();
        int perc = random.nextInt(10);
        if(fabrizio.getAstuzia() > 8) {
            if(perc > 8) {
                fabrizio.soldi += fabrizio.getSoldi() / 2;
                return new Evento("Hai ricattato un VIP, i tuoi soldi aumentano di 1/2 del tuo conto. (soldi +*)", "/images/Ricatto.png");
            }
            fabrizio.soldi += fabrizio.getSoldi() / 6;
            return new Evento("Hai ricattato un VIP, i tuoi soldi aumentano di 1/6 del tuo conto. (soldi +*)", "/images/Ricatto.png");
        }
        fabrizio.soldi -= 7000;
        fabrizio.checkSoldi();
        return new Evento("Hai provato a ricattare un VIP ma non è andata a buon fine. (soldi -7.000)", "/images/Ricatto.png");
    }
    
    public static Evento vociNegative(FabrizioCorona fabrizio) {
        fabrizio.fama -= 1;
        fabrizio.checkFama();
        return new Evento("Voci false diffuse sul tuo conto. (fama -2)", "/images/Pettegolezzi.png");
    }
    
    public static Evento truffa(FabrizioCorona fabrizio) {
        fabrizio.soldi -= 10000;
        fabrizio.checkSoldi();
        fabrizio.astuzia -= 1;
        fabrizio.checkAstuzia();
        return new Evento("Sei stato truffato. (soldi -25.000) (astuzia -2)", "/images/Truffa.png");
    }
    
    public static Evento intervistaBelve(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 8) {
            fabrizio.astuzia++;
            fabrizio.checkAstuzia();
            return new Evento("Francesca Fagnani ti fa una domanda scomoda, riesci a cavartela grazie alla tua astuzia. (astuzia +1)", "/images/FrancescaFagnani.png");
        }
        fabrizio.fama -= 2;
        fabrizio.checkFama();
        return new Evento("Francesca Fagnani ti fa una domanda scomoda dalla quale non riesci a scappare. (fama -2)", "/images/FrancescaFagnani.png");
    }
    
    public static Evento incontroBelen(FabrizioCorona fabrizio) {
        if(fabrizio.getFama() >=9) {
            fabrizio.soldi += 15000;
            fabrizio.fama = 10;
            return new Evento("Sei riuscito ad incontrare Belen e ti ci hanno paparazzato. (soldi +15.000) (fama +1)", "/images/BelenRodriguez.png");
        }
        fabrizio.fama--;
        fabrizio.checkFama();
        return new Evento("Hai incontrato Belen ma hai fatto una brutta figura. (fama -1)", "/images/BelenRodriguez.png");
    }
    
    public static Evento litigioIlary(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 6) {
            fabrizio.fama += 2;
            fabrizio.checkFama();
            return new Evento("Litigata in diretta con Ilary, riesci a sfruttare il momento. (fama +2)", "/images/IlaryBlasi.png");
        }
        fabrizio.fama -= 2;
        fabrizio.checkFama();
        return new Evento("Litigata in diretta con Ilary, perdi consensi. (fama -2)", "/images/IlaryBlasi.png");
    }
    
    public static Evento paparazzata(FabrizioCorona fabrizio) {
        Random random = new Random();
        int guadagno = random.nextInt(10000) + 1000;
        fabrizio.soldi += guadagno;
        fabrizio.astuzia++;
        fabrizio.checkAstuzia();
        return new Evento("Hai organizzato una paparazzata appositamente. (soldi +*) (astuzia +1)", "/images/Paparazzata.png");
    }

    public static Evento causaLegale(FabrizioCorona fabrizio) {
        if(fabrizio.getSoldi() > 10000) {
            fabrizio.soldi -= 10000;
            fabrizio.checkSoldi();
            return new Evento("Hai abbastanza soldi per evitare la causa. (soldi -10.000)", "/images/CausaLegale.png");
        }
        fabrizio.fama -= 1;
        fabrizio.checkFama();
        return new Evento("Immagine intaccata. (fama -1)", "/images/CausaLegale.png");
    }

    public static Evento scoopEsclusivo(FabrizioCorona fabrizio) {
        if(fabrizio.getAstuzia() > 7) {
            fabrizio.soldi += 20000;
            fabrizio.fama += 2;
            fabrizio.checkFama();
            return new Evento("Grazie alla tua astuzia hai ottenuto uno scoop esclusivo. (soldi +20000)(fama +2)", "/images/Scoop.png");
        }
        fabrizio.fama -= 1;
        fabrizio.checkFama();
        return new Evento("Astuzia insufficiente per scoprire gossip importanti, i tuoi contatti diminuiscono. (fama -1)", "/images/Scoop.png");
    }
    
    public static Evento arrestoDefinitivo(FabrizioCorona fabrizio) {
        fabrizio.soldi = 0;
        fabrizio.fama = 0;
        fabrizio.astuzia = 0;
        return new Evento("Sei stato incastrato in situazioni pericolose. Fine della carriera. (GAME OVER)", "/images/GameOver.png");
    }
    
    public static Evento estraiEvento(FabrizioCorona fabrizio) {
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
        return new Evento("Nessun evento", "");
    }
}
