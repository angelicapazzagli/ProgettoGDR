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
    
    public void checkSoldi() {
        if(soldi < 0) {
            soldi = 0;
        }
    }
    
    public void checkFama() {
        if(fama > 10) {
            fama = 10;
        }
        else if(fama < 0) {
            fama = 0;
        }
    }
    
    public void checkAstuzia() {
        if(astuzia > 10) {
            astuzia = 10;
        }
        else if(astuzia < 0) {
            astuzia = 0;
        }
    }
    
    public abstract String usaAbilità();
}
