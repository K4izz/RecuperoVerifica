/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperoverifica;

/**
 *
 * @author ospite
 */
public class VittoriaPari {
    
    // Inizio : Dichiarazione degli attributi e la generazione del numero casuale da 1 a 100.
    private double NumerocCasualeDouble = Math.random();
    private int casuale = (int)(Math.random()* 100 + 1); 
    // Fine : Dichiarazione degli attributi e la generazione del numero casuale da 1 a 100.
    
    // Inizio : Stampa dell'estrazione.
    public void estrazione(){
        System.out.print("\nil numero estratto e : " + casuale);
    }
    // Fine : Stampa dell'estrazione.
    
    // Inizio : Creazione del metodo per il controllo della vittoria.
    public void WinCheck(){
        if(casuale%2==0){
            System.out.print("\nHai vinto");
        } else {
            System.out.print("\nHai Perso");
        }
    }
    // Fine : Creazione del metodo per il controllo della vittoria.
}
