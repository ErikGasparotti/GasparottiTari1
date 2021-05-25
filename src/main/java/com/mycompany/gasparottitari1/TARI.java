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
import java.io.Serializable;

/**
 * La classe rappresenta una tassa comunale.
 * I suoi suoi attributi sono:<br>
 * anno <br>
 * nomeCliente <br>
 * cognomeCliente <br>
 * indirizzo <br>
 * dimensioni <br>
 * prezzoTassa <br>
 * dataPagamento <br>
 * @author egasp
 * @version 1.0
 */

public class TARI implements Serializable
{
    private int anno;
    private String nomeCliente;
    private String cognomeCliente;
    private String indirizzo;
    private int dimensioni;
    private int prezzoTassa;
    private String dataPagamento;
    
    /**
    * Costruttore della classe libro. Consente di instanziare un nuovo libro.
    * @param anno anno di riferimento della tassa
    * @param nomeCliente nome del richiedente della tassa
    * @param cognomeCliente del richiedente
    * @param indirizzo indirizzo del richiedente
    * @param dimensioni dimensioni dell'abitazione del cittadino
    * @param prezzoTassa prezzo della tassa da pagare, equivale alla dimensione dell'abitazione
    * @param dataPagamento data in cui viene pagata la tassa dal cittadino richiedente
    
    */
    public TARI(final int anno, final String nomeCliente, final String cognomeCliente, final String indirizzo, final int dimensioni, final int prezzoTassa, final String dataPagamento) {
        this.anno = anno;
        this.nomeCliente = nomeCliente;
        this.cognomeCliente = cognomeCliente;
        this.indirizzo = indirizzo;
        this.dimensioni = dimensioni;
        this.prezzoTassa = prezzoTassa;
        this.dataPagamento = dataPagamento;
    }
    /**
    * Costruttore di copia della classe TARI
    * @param t libro t, di cui viene creata una copia
    */
    public TARI(final TARI t) {
        this.anno = t.getAnno();
        this.nomeCliente = t.getnomeCliente();
        this.cognomeCliente = t.getcognomeCliente();
        this.indirizzo = t.getIndirizzo();
        this.dimensioni = t.getDimensioni();
        this.prezzoTassa = t.getPrezzoTassa();
        this.dataPagamento = t.getdataPagamento();
    }
    /**
    * Costruttore di default della classe TARI. <br>
    * Assegna ad ogni parametro un valore di default:<br>
    * alle stringe, una stringa vuota, agli interi 0.
    */
    public TARI() {
        this.anno = 0;
        this.nomeCliente = "";
        this.cognomeCliente = "";
        this.indirizzo = "";
        this.dimensioni = 0;
        this.prezzoTassa = 0;
        this.dataPagamento = "";
    }
    /**
    * Getter dell'attributo anno. <br>
    * Restituisce il valore dell'attributo anno<br>
    * @return anno
    */
    public int getAnno() 
    {
        return anno;
    }
    /**
    * Setter dell'attributo anno. <br>
    * Modifica il valore dell'attributo anno<br>
    * @param anno
    */
    public void setAnno(int anno) 
    {
        this.anno = anno;
    }
    /**
    * Getter dell'attributo nomeCliente. <br>
    * Restituisce il valore dell'attributo nomeCliente<br>
    * @return nomeCliente
    */
    public String getnomeCliente() 
    {
        return nomeCliente;
    }
    /**
    * Setter dell'attributo nomeCliente. <br>
    * Modifica il valore dell'attributo gnomeCliente<br>
    * @param nomeCliente
    */
    public void setnomeCliente(final String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }
    /**
    * Getter dell'attributo cognomeCliente. <br>
    * Restituisce il valore dell'attributo cognomeCliente<br>
    * @return cognomeCliente
    */
    public String getcognomeCliente() 
    {
        return cognomeCliente;
    }
    /**
    * Setter dell'attributo cognomeCliente. <br>
    * Modifica il valore dell'attributo cognomeCliente<br>
    * @param cognomeCliente
    */
    public void setcognomeCliente(String cognomeCliente) 
    {
        this.cognomeCliente = cognomeCliente;
    }
    /**
    * Getter dell'attributo indirizzo. <br>
    * Restituisce il valore dell'attributo indirizzo<br>
    * @return indirizzo
    */
    public String getIndirizzo() 
    {
        return indirizzo;
    }
    /**
    * Setter dell'attributo indirizzo. <br>
    * Modifica il valore dell'attributo indirizzo<br>
    * @param indirizzo
    */
    public void setIndirizzo(final String indirizzo) 
    {
        this.indirizzo = indirizzo;
    }
    /**
    * Getter dell'attributo dimensioni. <br>
    * Restituisce il valore dell'attributo dimensioni<br>
    * @return dimensioni
    */
    public int getDimensioni() {
        return dimensioni;
    }
    /**
    * Setter dell'attributo dimensioni. <br>
    * Modifica il valore dell'attributo dimensioni<br>
    * @param dimensioni
    */
    public void setDimensioni(int dimensioni) 
    {
        this.dimensioni = dimensioni;
    }
    /**
    * Getter dell'attributo prezzotassa. <br>
    * Restituisce il valore dell'attributo prezzoTassa<br>
    * @return prezzoTassa
    */
    public int getPrezzoTassa() 
    {
        return prezzoTassa;
    }
    /**
    * Setter dell'attributo prezzoTassa. <br>
    * Modifica il valore dell'attributo prezzoTassa<br>
    * @param cognomeCliente
    */
    public void setPrezzoTassa(int prezzoTassa) 
    {
        this.prezzoTassa = prezzoTassa;
    }
    /**
    * Getter dell'attributo dataPagamento. <br>
    * Restituisce il valore dell'attributo dataPagamento<br>
    * @return dataPagamento
    */
    public String getdataPagamento() 
    {
        return dataPagamento;
    }
    /**
    * Setter dell'attributo dataPagamento. <br>
    * Modifica il valore dell'attributo dataPagamento<br>
    * @param dataPagamento
    */
    public void setdataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    /**
    * Metodo che restituisce la stringa che contiene i valori degli attributi della classe<br>
    * @return s
    */
    @Override
    public String toString() 
    {
        String s =getAnno()+getnomeCliente()+getcognomeCliente()+getIndirizzo()+getDimensioni()+getPrezzoTassa()+getdataPagamento();
        return s;
    }
   
    /**
    * Metodo per la rappresentazione dell'oggetto di classe TARI in formato CSV
    * @return s Stringa che contiene gli attributi dell'oggetto di classe TARI
    */
	public String toCSV() 
	{
            String s;
	    s=anno + ",\""+ indirizzo + "\",\"" + nomeCliente + "\",\"" +cognomeCliente + "\",\""  + dimensioni + "\"," + prezzoTassa  + "\"," + dataPagamento +  "\n";
            return s;
	}
    
        
    }