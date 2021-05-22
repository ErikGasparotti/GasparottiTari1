/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gasparottitari1;

import eccezioni.*;
import java.io.IOException;
import java.util.*;


/**
 *
 * @author egasp
 */
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner tastiera=new Scanner(System.in);
        
        String[] vociMenu=new String[8];
        int sceltaUtente=-1;
        
      
        TARI tari;
        
        String nomeFileTesto="tari.txt";
        String nomeFileBinario="tari.bin";
        
        Tasse t=new Tasse();
        
        vociMenu[0]="Esci";  
        vociMenu[1]="Aggiungi TARI(richiesta per un cittadino di pagamento)";
        vociMenu[2]="Elimina TARI";
        vociMenu[3]="Paga TARI";
        vociMenu[4]="Vedi TARI non pagate(In ordine alfabetico di cittadino)";
        vociMenu[5]="Mostra tari di un cittadino";
        vociMenu[6]="Esporta in formato CSV";
        vociMenu[7]="Salva";          
        
        
         try 
        {
            t=(Tasse) t.caricaTassazione(nomeFileBinario);
            System.out.println("Dati caricati correttamente");
        } 
        catch (IOException ex) 
        {
            System.out.println("Impossibile accedere al file in lettura. I dati non sono stati caricati");
        } 
        catch (FileException ex) 
        {
            System.out.println(ex.toString());
        }
        
        Menu menu= new Menu(vociMenu);
        
        do
        {
            
            
        }while(sceltaUtente!=0);
        
        
        
    }   
    
}
