/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

import java.io.Serializable;
import eccezioni.FileException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * La classe rappresenta una TARI.
 * I suoi suoi attributi sono:<br>
 * anno <br>
 * nomeCliente <br>
 * cognomeCliente <br>
 * indirizzo <br>
 * dimensioni <br>
 * prezzoTassa <br>
 * dataPagamento <br>
 * 
 * @author egasp
 * @version 1.0
 */

public class TARI implements Serializable
{

        //attributi
        private int anno;
	private String nomeCliente;
	private String cognomeCliente;
        private String indirizzo;
        private int dimensioni;
        private int prezzoTassa;
	private String dataPagamento;

        
        //metodi
        /**
    * Costruttore della classe TARI. Consente di instanziare un nuova nuova tassa.
    * @param anno anno di riferimento della tassa
    * @param nomeCliente nome del cliente che deve pagare la tassa
    * @param cognomecliente cognome del cliente
    * @param indirizzo indirizzo del richiedente
    * @param dimensioni dimensioni abitazione del cliente
    * @param prezzoTassa prezzo della tassa da pagare
    * @param dataPagamento data del pagamento della tassa
    */
        
        public TARI(int anno,String nomeCliente,String cognomeCliente,String indirizzo,int dimensioni,int prezzoTassa,String dataPagamento)
        {
            this.anno=anno;
            this.nomeCliente=nomeCliente;
            this.cognomeCliente=cognomeCliente;
            this.indirizzo=indirizzo;
            this.dimensioni=dimensioni;
            this.prezzoTassa=prezzoTassa;
            this.dataPagamento=dataPagamento;
                
        }
        
        /**
    * Costruttore di copia della classe libro
    * @param TARI t, di cui viene creata una copia
    */
        
        public TARI(TARI t)
        {
            this.anno=t.getAnno();
            this.nomeCliente=t.getnomeCliente();
            this.cognomeCliente=t.getcognomeCliente();
            this.indirizzo=t.getIndirizzo();
            this.dimensioni=t.getDimensioni();
            this.prezzoTassa=t.getPrezzoTassa();
            this.dataPagamento=t.getdataPagamento();
                
        }
        
        /**
    * Costruttore di default della classe TARI. <br>
    * Assegna ad ogni parametro un valore di default:<br>
    * alle stringe, una stringa vuota, agli interi 0.
    */
        
        public TARI()
        {
            anno=0;
            nomeCliente="";
            cognomeCliente="";
            indirizzo="";
            dimensioni=0;
            prezzoTassa=0;
            dataPagamento="";
                
        }
        
        /**
    * Getter dell'attributo anno, metodo che restituisce il valore del suddetto attributo
    * @return anno
    */
        public int getAnno() 
        {
		return anno;
	}
          /**
    * Setter dell'attributo anno, metodo che modifica il valore del suddetto attributo
    * @param anno
    */  
	public void setAnno(int anno) 
        {
		this.anno = anno;
	}
              /**
    * Getter dell'attributo nomeCliente, metodo che restituisce il valore del suddetto attributo
    * @return nomeCliente
    */            
        public String getnomeCliente() 
        {
		return nomeCliente;
	}
      /**
    * Setter dell'attributo nomeCliente, metodo che modifica il valore del suddetto attributo
    * @param nomeCliente
    */ 
	public void setnomeCliente(String nomeCliente) 
        {
		this.nomeCliente = nomeCliente;
	}
               /**
    * Getter dell'attributo cognomeCliente, metodo che restituisce il valore del suddetto attributo
    * @return cognomeCliente
    */           
        public String getcognomeCliente() 
        {
		return cognomeCliente;
	}
      /**
    * Setter dell'attributo cognomeCliente, metodo che modifica il valore del suddetto attributo
    * @param cognomeCliente
    */ 
	public void setcognomeCliente(String cognomeCliente) 
        {
		this.cognomeCliente = cognomeCliente;
	}
  /**
    * Getter dell'attributo indirizzo, metodo che restituisce il valore del suddetto attributo
    * @return indirizzo
    */

	public String getIndirizzo() 
        {
		return indirizzo;
	}
      /**
    * Setter dell'attributo indirizzo, metodo che modifica il valore del suddetto attributo
    * @param indirizzo
    */ 
	public void setIndirizzo(String indirizzo) 
        {
		this.indirizzo = indirizzo;
	}
  /**
    * Getter dell'attributo dimensioni, metodo che restituisce il valore del suddetto attributo
    * @return dimensioni
    */
	public int getDimensioni()
        {
		return dimensioni;
	}
      /**
    * Setter dell'attributo dimensioni, metodo che modifica il valore del suddetto attributo
    * @param dimensioni
    */ 
	public void setDimensioni(int dimensioni)
        {
		this.dimensioni = dimensioni;
	}
  /**
    * Getter dell'attributo prezzoTassa, metodo che restituisce il valore del suddetto attributo
    * @return prezzoTassa
    */
	public int getPrezzoTassa()
        {
		return prezzoTassa;
	}
      /**
    * Setter dell'attributo prezzoTassa, metodo che modifica il valore del suddetto attributo
    * @param prezzoTassa
    */ 
	public void setPrezzoTassa(int prezzoTassa) 
        {
	        this.prezzoTassa = prezzoTassa;
	}
                       /**
    * Getter dell'attributo dataPagamento, metodo che restituisce il valore del suddetto attributo
    * @return dataPagamento
    */   
        public String getdataPagamento() 
        {
		return dataPagamento;
	}
      /**
    * Setter dell'attributo dataPagamento, metodo che modifica il valore del suddetto attributo
    * @param dataPagamento
    */ 
	public void setdataPagamento(String dataPagamento) 
        {
		this.dataPagamento = dataPagamento;
	}


	 /**
        * Restituisce una stringa che rappresenta la TARI
        * @param s Stringa sulla quale vengono copiati gli attributi della classe
        * @return stringa s
        */
	public String toString() 
        {
          String s;
          s=getAnno()+getnomeCliente()+getcognomeCliente()+getIndirizzo()+getDimensioni()+getPrezzoTassa()+getdataPagamento();
          return s;
	}

	 /**
        * Metodo per la rappresentazione degli attributi in formato file CSV
        * @param s Stringa con la descrizione
        * @return s
        */
	public String toCSV() 
	{
                String s;
		s=anno + ",\""+ indirizzo + "\",\"" + nomeCliente + "\",\"" +cognomeCliente + "\",\""  + dimensioni + "\"," + prezzoTassa  + "\"," + dataPagamento +  "\n";
                return s;
                        
	}

}
 

