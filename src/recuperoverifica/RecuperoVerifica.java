/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperoverifica;

/**
 *
 * Wang Jimmy 4infD
 * Recupero della verifica : Un’urna contiene 20 palline numerate da 1 a 20. Crea un programma che simuli    un’ estrazione casuale dall’urna e che consideri come vittoria l’estrazione di un numero pari
 */
public class RecuperoVerifica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VittoriaPari myWin = new VittoriaPari(); // Istanzazione dell'oggetto per il richiamo.
        
        // Inizio : Richiamo del metodo tramite l'oggetto myWin.
        myWin.estrazione();
        myWin.WinCheck();
        // Fine : Richiamo del metodo tramite l'oggetto myWin.
    }
    
}
