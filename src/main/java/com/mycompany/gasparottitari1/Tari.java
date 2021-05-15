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
public class Tari 
{
    private String codiceId;
    private int annoTari;
    private String nome;
    private String cognome;
    private String indirizzo;//indirizzo cittadino
    private float dimensioneAbitazione;
    private String dataPagamento;
    private final int costoFisso=1;

    //costruttore
    public Tari(String codiceId, int annotari, String nome, String cognome, String indirizzo, float dimensioneAbitazione, String dataPagamento)
    {
        this.codiceId = codiceId;
        this.annoTari = annotari;
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.dimensioneAbitazione = dimensioneAbitazione;
        this.dataPagamento = dataPagamento;
    }
    //costruttore di copia
    public Tari(Tari t)
    {
        this.codiceId = t.getCodiceId();
        this.annoTari = t.getAnnoTari();
        this.nome = t.getNome();
        this.cognome = t.getCognome();
        this.indirizzo = t.getIndirizzo();
        this.dimensioneAbitazione = t.getDimensioneAbitazione();
        this.dataPagamento = t.getDataPagamento();
    }
    //costruttore di default
    public Tari()
    {
        codiceId =" ";
        annoTari =0;
        nome =" ";
        cognome =" ";
        indirizzo =" ";
        dimensioneAbitazione =0;
        dataPagamento =" ";
    }

    public String getCodiceId() 
    {
        return codiceId;
    }

    public int getAnnoTari() 
    {
        return annoTari;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getCognome() 
    {
        return cognome;
    }

    public String getIndirizzo() 
    {
        return indirizzo;
    }

    public float getDimensioneAbitazione() 
    {
        return dimensioneAbitazione;
        
            
    }

    public String getDataPagamento() 
    {
        return dataPagamento;
    }

    public void setCodiceId(String codiceId) 
    {
        this.codiceId = codiceId;
    }

    public void setAnnotari(int annotari) 
    {
        this.annoTari = annotari;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public void setIndirizzo(String indirizzo) 
    {
        this.indirizzo = indirizzo;
    }

    public void setDimensioneAbitazione(float dimensioneAbitazione) 
    {
        this.dimensioneAbitazione = dimensioneAbitazione;
    }

    public void setDataPagamento(String dataPagamento) 
    {
        this.dataPagamento = dataPagamento;
    }
    
    public String toString()
    {
       String s;
       s=getCodiceId()+getAnnoTari()+getNome()+getCognome()+getIndirizzo()+getDimensioneAbitazione()+getDataPagamento();
       return s;
    }
    
    public float costoTari()
    {
        float c;
        c=costoFisso*dimensioneAbitazione;
        return c;
    }
    
}
