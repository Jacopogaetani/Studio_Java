
public class codice_iniziale { //Dichiarazione di una classe publica, questa è la classe principale
   /*INDICATORI PUBLIC/PROTECTED/PRIVATE
   *
   * Public: I membri dichiarati "public" sono accessibili sia all'interno che all'esterno della classe
   *         e delle classi derivate da esse
   * Protected: I membri dichiarati "protected" sono accessibili dall'interno della classe e delle classi derivate
   *            ma non dall'interno
   * Private:I membri dichiarati "private" possono essere utlizzate esclusivamente all'interno della classe stessa*/
    public static void main(String[] args){
        /*Dichiarazione di un metodo pubblico, statico, di tipo void e di nome main
        *
        * Metodo: blocco di codice che contiene un insieme di istruzioni eseguibili
        *
        * Metodo statico: metodo non asociato ad un oggetto ma solo ad una classe
        *
        * Metodo non statico: metodo che operano su un oggetto specifico di una classe
        *
        * Void: tipo di variabile senza valore di ritorno (Void = vuoto)
        *
        * String[] args: permette di ricevere argomenti da riga di comando
        *                String[]: Array di stringhe
        *                args: nome di un array (Argomenti o parametri)
        *
        * Parametri:  */
        System.out.println("Hello WOrld!");
    }
}
