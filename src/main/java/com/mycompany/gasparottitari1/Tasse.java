/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

import eccezioni.EccezionePosizioneNonValida;
import eccezioni.FileException;
import file.TextFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author egasp
 */
public class Tasse implements Serializable
{
    
    private TARI[] tari;
    private static final int NUM_TARI_MAX=100;
    private static int NUMTARI;
    
     public Tasse()
   {
       tari=new TARI[NUM_TARI_MAX];
       
       for (int i=0;i<NUM_TARI_MAX;i++)
       {
           tari[i]=new TARI();
       }
       
       NUMTARI=0;
   }
     
   public TARI getTARI(int tariT) throws EccezionePosizioneNonValida
   {
       TARI a;
       try
       {
            a=tari[tariT];
            return a;
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(tariT,0);
       }
  
   }

   public void setTARI(TARI tariT) throws EccezionePosizioneNonValida
   {
       try
       {
            tari[NUMTARI]=tariT;
            NUMTARI++;
            System.out.println(NUMTARI);
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(NUMTARI,0);
       }
  
   }
   
  
   public void eliminaTARI(int tariT) throws EccezionePosizioneNonValida
   {
       try
       {
            for(int i=tariT;i<NUM_TARI_MAX;i++)
            {
                if(i==NUM_TARI_MAX-1)
                {
                    tari[i]=new TARI();
                }
                else
                    tari[i]=tari[i+1];
            }
            NUMTARI--;
       }
       catch(ArrayIndexOutOfBoundsException e1)
       {
           throw new EccezionePosizioneNonValida(NUMTARI,0);
       }
  
   }
        
}