/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

/**
 *
 * @author 39333
 */
public class Evento {
    private String messaggio;
    private String immagine;
    
    public Evento(String messaggio, String immagine) {
        this.messaggio = messaggio;
        this.immagine = immagine;
    }
    
    public String getMessaggio() {
        return messaggio;
    }
    
    public String getImmagine() {
        return immagine;
    }
}
