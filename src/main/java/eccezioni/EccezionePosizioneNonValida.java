/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eccezioni;

/**
 *
 * @author egasp
 */

    public class EccezionePosizioneNonValida extends Exception
{
    private int tassa;
    private int posizione;
    
    public EccezionePosizioneNonValida(int tassa, int posizione)
    {
        this.tassa=tassa;
        this.posizione=posizione;
    }

    public int getTassa() {
        return tassa;
    }

    public int getPosizione() {
        return posizione;
    }
    
    public String toString()
    {
        String s="";
        s+="La tassa: "+getTassa()+" posizione: "+getPosizione()+" non è valida.";
        return s;
    }
}
