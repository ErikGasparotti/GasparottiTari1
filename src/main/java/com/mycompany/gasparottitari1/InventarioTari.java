/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;
import java.time.*;

/**
 *
 * @author egasp
 */
public class InventarioTari 
{
    //attributi
    private Tari[] elencoTari;
    private static int N_MAX_TARI=100;
    private int nTariPresenti;
    //costruttore
    
    public InventarioTari ()
     {
       elencoTari=new Tari[N_MAX_TARI];
       
     }
    //costruttore di copia
     
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
    
    
    public void aggiungiTari(Tari t,int p)//aggiunge una nuova richiesta di pagamento tari
    {
        if(elencoTari[p]==null)
        {
            elencoTari[p]=t;
            nTariPresenti++;
        }
    }
    
    public  void pagaTari(Tari t,boolean tariPagata)
    {
        t.setDataPagamento(LocalDate.now());
        if(tariPagata==false)
        {
            tariPagata=true;
            t.setTariPagata(tariPagata);
        }
    }
}
