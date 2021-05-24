/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author egasp
 */
public class TasseTest {
    
    public TasseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTARI method, of class Tasse.
     */
    @Test
    public void testGetTARI() throws Exception {
        System.out.println("getTARI");
        int tariT = 0;
        Tasse instance = new Tasse();
        TARI expResult = null;
        TARI result = instance.getTARI(tariT);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTARI method, of class Tasse.
     */
    @Test
    public void testSetTARI() throws Exception {
        System.out.println("setTARI");
        TARI tariT = null;
        Tasse instance = new Tasse();
        instance.setTARI(tariT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminaTARI method, of class Tasse.
     */
    @Test
    public void testEliminaTARI() throws Exception {
        System.out.println("eliminaTARI");
        int tariT = 0;
        Tasse instance = new Tasse();
        instance.eliminaTARI(tariT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of elencoTARIOrdinateCittadino method, of class Tasse.
     */
    @Test
    public void testElencoTARIOrdinateCittadino() throws Exception {
        System.out.println("elencoTARIOrdinateCittadino");
        Tasse instance = new Tasse();
        String expResult = "";
        String result = instance.elencoTARIOrdinateCittadino();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esportaTARICSV method, of class Tasse.
     */
    @Test
    public void testEsportaTARICSV() throws Exception {
        System.out.println("esportaTARICSV");
        String percorsoFile = "";
        Tasse instance = new Tasse();
        instance.esportaTARICSV(percorsoFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvaTassazione method, of class Tasse.
     */
    @Test
    public void testSalvaTassazione() throws Exception {
        System.out.println("salvaTassazione");
        String nomeFile = "";
        Tasse instance = new Tasse();
        instance.salvaTassazione(nomeFile);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of caricaTassazione method, of class Tasse.
     */
    @Test
    public void testCaricaTassazione() throws Exception {
        System.out.println("caricaTassazione");
        String nomeFile = "";
        Tasse instance = new Tasse();
        Tasse expResult = null;
        Tasse result = instance.caricaTassazione(nomeFile);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
