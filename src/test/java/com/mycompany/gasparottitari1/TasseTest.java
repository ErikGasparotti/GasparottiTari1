/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author egasp
 */
public class TasseTest {
    
    public Tasse t;
    public TARI tari;
    
    public TasseTest() 
    {
        
    }
    
     @Before
    public void inizializzazione()
    {
        t=new Tasse();
        tari=new TARI();
        tari.setAnno(2021);
        tari.setnomeCliente("Erik");
        tari.setcognomeCliente("Gasparotti");
        tari.setIndirizzo("Via Grano 8");
        tari.setDimensioni(111);
        tari.setPrezzoTassa(111);
        tari.setdataPagamento(null);
    }
    
   /**
     * Test of getTari method, of class Tasse.
     */
    @Test
    public void testGetTARI() throws Exception 
    {
        System.out.println("getTari");
        int tariT= 0;
        TARI expResult = tari;
        t.setTARI(tari);
        TARI result = t.getTARI(tariT);
        assertEquals(expResult, result);
    }

    /**
     * Test of setTARI method, of class Tasse.
     */
    @Test
    public void testSetTARI() throws Exception 
    {
        System.out.println("setTARI");
        TARI tarit = tari;
        t.setTARI(tari);
    }

    /**
     * Test of eliminaTARI method, of class TARI.
     */
    @Test
    public void testEliminaTARI() throws Exception 
    {
        System.out.println("eliminaTARI");
        int tariT = 0;
        t.setTARI(tari);
        t.eliminaTARI(tariT);
    }

    /**
     * Test of elencoTARIOrdinateTarghe method, of class TARI.
     */
    @Test
    public void testElencoTARIOrdinateCittadino() throws Exception 
    {
        System.out.println("elencoTARIOrdinateCittadino");
        String nomeCittadino = "Erik";
        t.setTARI(tari);
String expResult = "Tari [\n" +
"anno=2021\n" +
"nomeCliente=Erik\n" +
"cognomeCliente=Gasparotti\n" +
"indirizzo=Via Grano 8\n" +
"dimensioni=111\n" +
"prezzoTassa=111\n" +
"dataPagamento=null\n" +
"]\n" +
"\n" +
"" ;
        String result = t.elencoTARIOrdinateCittadino();
        assertEquals(expResult, result);
    }
    
   
}
