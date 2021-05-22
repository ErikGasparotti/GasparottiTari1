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
   
  public String elencoTARIOrdinateCittadino() throws EccezionePosizioneNonValida
  {
      TARI[] elencoTari=new TARI[NUMTARI];
      TARI tari;
      int c=0;
      int numtari=0;
      
      for(int i=0;i<NUMTARI;i++)
      {
              tari=getTARI(i);
              if (tari!=null && tari.getdataPagamento()==null)
              {
                  elencoTari[c]=tari;
                  c++;
              }
      }
      
      
      for(int i=0;i<elencoTari.length;i++)
          if(elencoTari[i]!=null)
              numtari++;
      if(numtari==0)
      {
          return "Non ci sono Tari non ancora pagate";  
      }
      else
      {
          elencoTari=Ordinatore.selectionSortTari(elencoTari);
      
          String dati="";
          for(int i=0;i<elencoTari.length;i++)
            {
                dati=dati+elencoTari[i].toString()+"\n";
            }
            return dati;  
      }
      
          
    }
      
    //Salva le tari e le posizioni su file CSV
  public void esportaTARICSV(String percorsoFile) throws IOException, EccezionePosizioneNonValida, FileException
  {
      TARI tari;
      String stringaTari;
      TextFile f1= new TextFile(percorsoFile, 'W');
      for (int i=0;i<NUM_TARI_MAX;i++)
      {
              tari=getTARI(i);
              if (tari.getnomeCliente()!=null)
              {
                  stringaTari=tari.toCSV();
                  f1.toFile(stringaTari);
              }
          
      }
      f1.close(); 
  }
   
   public void salvaTassazione(String nomeFile) throws IOException
  {   
      FileOutputStream f1=new FileOutputStream(nomeFile);
      ObjectOutputStream writer=new ObjectOutputStream(f1);
      writer.writeObject(this);
      writer.flush();
      writer.close();   
  }
  
  public Tasse caricaTassazione(String nomeFile) throws IOException, FileException
  {
      Tasse s;
      FileInputStream f1=new FileInputStream(nomeFile);
      ObjectInputStream reader=new ObjectInputStream(f1);
      
       try 
       {
           s=(Tasse)reader.readObject();
           numTassePresentiTotalmente(s);
           reader.close();
           return s;
       } 
       catch (ClassNotFoundException ex) 
       {
           reader.close();
           throw new FileException("Errore di lettura");
       }   
  }

    private int numTassePresentiTotalmente(Tasse s) 
    {
        try
        {
            for(int i=0;i<NUM_TARI_MAX;i++)
            {
                if(s.getTARI(i).getnomeCliente()!=null)
                    NUMTARI++;
            } 
            
        }
        catch (EccezionePosizioneNonValida e1)
                        {
                            System.out.println(e1.toString());
                        }
        return NUMTARI;
    }
    
      
          
    }
  
   
  
    
  
}
        
