/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package falsissimo;

import java.io.Serializable;

/**
 *
 * @author pazzagli.angelica
 */
public abstract class FabrizioCorona implements Serializable{
    private static final long serialversionUID = 1L;
    protected String nome;
    protected int soldi;
    protected int fama;
    protected int astuzia;
    protected Abilità abilità;
    
    public FabrizioCorona(String nome, int soldi, int fama, int astuzia, Abilità abilità) {
        this.nome = nome;
        this.soldi = soldi;
        this.fama = fama;
        this.astuzia = astuzia;
        this.abilità = abilità;
    }
    
    public int getSoldi() {
        return soldi;
    }
    
    public int getFama() {
        return fama;
    }
    
    public int getAstuzia() {
        return astuzia;
    }
    
    public int checkValore(int valore) {
        if(valore > 10) {
            valore = 10;
        }
        else if(valore < 0) {
            valore = 0;
        }
        return valore;
    }
    
    public abstract String usaAbilità();
}
