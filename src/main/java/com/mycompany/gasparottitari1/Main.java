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
            t=t.caricaTassazione(nomeFileBinario);
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
            try
            {
                sceltaUtente=menu.sceltaMenu();
                
                switch(sceltaUtente)
                {
                    case 0:
                    {
                        System.out.println("L'applicazione verrà terminata");
                        break;
                    }
                    case 1:
                    {
                        tari=new TARI();
                        System.out.println("Anno ri riferimento-->");
                        tari.setAnno(tastiera.nextInt());
                        tastiera.nextLine();
                        
                        System.out.println("Nome-->");
                        tari.setnomeCliente(tastiera.nextLine());
                        
                        System.out.println("Cognome-->");
                        tari.setcognomeCliente(tastiera.nextLine());
                        
                         System.out.println("Indirizzo-->");
                        tari.setIndirizzo(tastiera.nextLine());
                        
                         System.out.println("Dimensioni in mq-->");
                         int dimensioni=tastiera.nextInt();
                        tari.setDimensioni(dimensioni);
                        tastiera.nextLine();
                        
                        tari.setPrezzoTassa(dimensioni);
                        
                      
                        tari.setdataPagamento(null);
                        
                        try
                        {
                            t.setTARI(tari);
                            System.out.println("Ok inserimento eseguito correttamente");
                        }
                        catch(EccezionePosizioneNonValida e1)
                        {
                            System.out.println(e1.toString());
                        }
                        System.out.println("Premi un pulsante per continuare");
                        tastiera.nextLine();
                        break;
                    }
                    case 2:
                    {
                        try
                        {
                            int numTari=0;
                            for(int i=0;i<100;i++)
                            {
                                if(t.getTARI(i).getnomeCliente()!=null)
                                {
                                    numTari++;
                                    tari=t.getTARI(i);
                                    System.out.println(i+")"+tari.toString());
                                }
                            }
                            if(numTari==0)
                            {
                                System.out.println("Non ci sono TARI da eliminare");
                            }
                            else
                            {
                                 int codice=-1;
                                while(codice<0||codice>numTari-1)
                                {
                                    System.out.println("Inserisci codice della TARI da eliminare-->");
                                    codice =tastiera.nextInt();
                                    tastiera.nextLine();
                                    t.eliminaTARI(codice);
                                }
                                 
                            }
                        }
                        catch (EccezionePosizioneNonValida e1)
                        {
                            System.out.println(e1.toString());
                        }
                        
                        System.out.println("Premi un pulsante per continuare");
                        tastiera.nextLine();
                        
                        break;
                    }
                    case 3:
                    {
                           try
                        {
                            int numTariDaPagare=0;
                            for(int i=0;i<100;i++)
                            {
                                if(t.getTARI(i).getnomeCliente()!=null)
                                {
                                    tari=t.getTARI(i);
                                    if (tari.getdataPagamento()==null)
                                    {
                                        numTariDaPagare++;
                                          System.out.println(i+")"+tari.toString());
                                    }
                                       
                                }
                            }
                            
                            if(numTariDaPagare==0)
                            {
                                System.out.println("Non ci sono TARI da pagare");
                            }
                            else
                            {
                                int codice=-1;
                                while(codice<0||codice>numTariDaPagare-1)
                                {
                                    System.out.println("Inserisci codice della TARI da pagare-->");
                                    codice =tastiera.nextInt();
                                    tastiera.nextLine();
                                };
                            
                           System.out.println("Data pagamento-->");
                            t.getTARI(codice).setdataPagamento(tastiera.nextLine());
                            }
                        }
                        catch (EccezionePosizioneNonValida e1)
                        {
                            System.out.println(e1.toString());
                        }   
                        
                         

                        System.out.println("Premi un pulsante per continuare");
                        tastiera.nextLine();
                        
                        break;
                        
                    }
                    case 4:
                    {
                              try {
                                  System.out.println(t.elencoTARIOrdinateCittadino());
                              } 
                              catch (EccezionePosizioneNonValida ex) 
                                {
                                System.out.println(ex.toString());
                                }
                        break;
                        
                    }
                    case 5:
                    {
                          System.out.println("Nome cittadino-->");
                         String nome= tastiera.nextLine();
                            
                       try
                        {
                            for(int i=0;i<100;i++)
                            {
                                if(t.getTARI(i).getnomeCliente()!=null)
                                    if (t.getTARI(i).getnomeCliente().equals(nome))
                                         System.out.println(t.getTARI(i).toString());
                                
                            }
                           
                        }
                        catch (EccezionePosizioneNonValida e1)
                        {
                            System.out.println(e1.toString());
                        }

                        System.out.println("Premi un pulsante per continuare");
                        tastiera.nextLine();
                        break;
                       
                    }
                   
                    case 6:
                    {
                        try
                        {
                            t.esportaTARICSV(nomeFileTesto);
                            System.out.println("TARI esportate correttamente");
                        }
                        catch(IOException e1)
                        {
                            System.out.println("Impossibile accedere al file");
                        }
                        catch(FileException e2)
                        {
                            System.out.println(e2.toString());
                        }
                        catch(EccezionePosizioneNonValida e3)
                        {
                            System.out.println(e3.toString());
                        }
                        break;
                    }
                    case 7:
                    {
                        try 
                        {
                            t.salvaTassazione(nomeFileBinario);
                            System.out.println("Dati salvati correttamente");
                        } catch (IOException ex) 
                        {
                            System.out.println("Impossibile accedere al file in scrittura");
                        }

                     }

                }
                
            }
            catch (InputMismatchException | NumberFormatException e1 )
            {
                tastiera.nextLine();
                System.out.println("Input non corretto");
            }
            
            
            
        }while (sceltaUtente!=0);
        
    }   
    
}
