/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

/**
 *
 * @author egasp
 */
public class InventarioTari 
{
    //attributi
    private Tari[] elencoTari;
    private static int N_MAX_TARI=100;
    //costruttore
    
    public InventarioTari ()
     {
       elencoTari=new Tari[N_MAX_TARI];
       
     }
    //costruttore di copia
    public InventarioTari (InventarioTari t)
    {
         elencoTari=new Tari[N_MAX_TARI];
         for(int i=0;i<getNMaxTari();i++)
         {
             elencoTari[i]=t.getTari(i);
         }
    }
    //metodi
    public static int getNMaxTari()
    {
        return N_MAX_TARI;
    }
    public int getNTari()
    {
        int c=0;
        for (int i=0;i<N_MAX_TARI;i++)
        {
            if(elencoTari[i]!=null)
                c++;
            
        }
        return c;
    }
    
    public Tari getTari (int posizione)
    {
        try
        {
            return new Tari(elencoTari[posizione]);
        }
       
        catch(NullPointerException posizioneVuota)
        {
            return null;
        }
              
    }
}
