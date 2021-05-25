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
 * La classe rappresenta un'array di oggetti di classe TARI.
 * I suoi suoi attributi sono:<br>
 * tari<br>
 * NUM_TARI_MAX<br>
 * NUMTARI<br>
 * @author egasp
 * @version 1.0
 */
public class Tasse implements Serializable
{
    
    private TARI[] tari;
    private static final int NUM_TARI_MAX=100;
    private static int NUMTARI;
    
        /**
    * Costruttore della classe Tasse.<br>
    * Consente di instanziare un nuovo array di Tari.
    */
     public Tasse()
   {
       tari=new TARI[NUM_TARI_MAX];
       
       for (int i=0;i<NUM_TARI_MAX;i++)
       {
           tari[i]=new TARI();
       }
       
       NUMTARI=0;
   }
     /**
    * Metodo che restituisce una Tari in base al codice(posizione)<br>
    * @param tariT codice Tari<br>
    * @return a, Tari restituita<br>
    * @throws EccezionePosizioneNonValida viene lanciata quando si tenta di assegnare al reference a il valore dell'array in posizione tariT
    */
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

   /**
    *Metodo che permette di inserire una nuova richiesta di pagamento della tassa comunale<br>
    *@param tariT reference di tipo TARI<br>
    *@throws EccezionePosizioneNonValida viene lanciata quando si tenta di assegnare all'array in posizione tariT il valore dell'oggetto passato come parametro
    */
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
   
  /**
    *Metodo che consente l'eliminazione di una Tari in base al codice<br>
    *@param tariT codice della tassa da eliminare<br>
    *@throws EccezionePosizioneNonValida viene lanciata quando si tenta di eliminare una TARI in una data posizione(codice)
    * 
    */
   
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
   //metodo che permette di visulizzare la tari non pagate di un cittadino in ordine alfabetico
    
  /**
    *Metodo che permette di visualizzare la tari non pagate di un cittadino in ordine alfabetico<br>
    *@return dati Stringa che contiene le tari non pagate dal cittadino ordinate in ordine alfabetico<br>
    *@throws EccezionePosizioneNonValida viene lanciata quando si cerca di assegnare al reference tari un oggetto TARI in posizione i
    */
   
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
      
   /**
    * Salva una TARI su file CSV
    * @param nomeFile nome del file CSV sul quale viene esportato l'oggetto di classe TARI
    * @throws IOException viene sollevata quando tento di istanziare un oggetto di classe TextFile
    * @throws EccezionePosizioneNonValida viene sollevata quando
    * @throws FileException viene sollevata quando si tenta di scrivere la stringa sul file
    */
  public void esportaTARICSV(String nomeFile) throws IOException, EccezionePosizioneNonValida, FileException
  {
      TARI tari;
      String stringaTari;
      TextFile f1= new TextFile(nomeFile, 'W');
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
   /**
    * Metodo che consente il salvataggio della tassazione sul file
    * @param nomeFile nome del file su cui viene salvata la tassa
    * @throws IOException viene sollevata quando si cerca di istanziare un oggetto di classe FileOutputStream
    */
   public void salvaTassazione(String nomeFile) throws IOException
  {   
      FileOutputStream f1=new FileOutputStream(nomeFile);
      ObjectOutputStream writer=new ObjectOutputStream(f1);
      writer.writeObject(this);
      writer.flush();
      writer.close();   
  }
  /**
    * Metodo che permette di carica la tassazione sul file
    * @param nomeFile nome del file sul quale viene caricata la tassazione
    * @throws IOException viene sollevata quando si tenta di istanziare un oggetto di classe FileinputStream
    * @throws FileExcpetion viene sollevata quando si tenta di leggere sul file
    */
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

  /**
    *Metodo che restituisce il numero totale di Tari presenti
    *@param s reference di classe Tasse
    *@return NUMTARI, intero che conta il numero di tari presenti a livello totale
    */
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
  
   
  
    
  

        
