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
public class Ordinatore 
{
    public static void  scambia(TARI v[],int posizione1, int posizione2)
    {
        TARI c;
        c=v[posizione1];
        v[posizione1]=v[posizione2];
        v[posizione2]=c;
    }
    
    
     
    public static void  scambia(String v[],int posizione1, int posizione2)
    {
        String c;
        c=v[posizione1];
        v[posizione1]=v[posizione2];
        v[posizione2]=c;
    }
    
    public static void  scambia(int v[],int posizione1, int posizione2)
    {
        int c;
        c=v[posizione1];
        v[posizione1]=v[posizione2];
        v[posizione2]=c;
    }
    
    public static TARI[] selectionSortTari(TARI[] a)
    {
        TARI[] ordinato=new TARI[a.length];
        
        for (int i=0;i<ordinato.length;i++)
            ordinato[i]=a[i];
    
        System.out.println(a.length);
        for (int i=0;i<ordinato.length-1;i++)
            for(int j=i+1;i<ordinato.length-1;j++)
            {
                 if(ordinato[j].getnomeCliente().compareToIgnoreCase(ordinato[i].getnomeCliente())<0)
                    scambia(ordinato,i,j);
            }
        
        TARI[] ordinatoCorretto=new TARI[a.length];
        for(int i=0;i<a.length;i++)
        {
            ordinatoCorretto[i]=ordinato[i];
        }
        return ordinatoCorretto;
    }
       
}
