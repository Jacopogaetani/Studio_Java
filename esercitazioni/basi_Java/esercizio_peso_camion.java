package javafiles.esercitazioni;
import java.util.InputMismatchException;
import java.util.Scanner;

//28/07/25, Sono contentissimo di questo programma.

public class esercizio_peso_camion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int peso_attuale = 0;
        int i = 0;

        System.out.println("Software per il packet management");
        System.out.print("Inserire il peso massimo caricabile sul vostro camion in kg: ");
        int peso_massimo = scanner.nextInt();
        System.out.println("Al momento dell'inserimento del peso dei pacchi, inserire 0 per terminare l'esecuzione del programma");

        while(peso_attuale < peso_massimo)
        {
            try{
                System.out.print("Inserisci il carico del pacco: ");
                int peso_pacco = scanner.nextInt();
                peso_attuale = peso_attuale + peso_pacco;
                i++;

                if (peso_attuale  > peso_massimo){
                    System.out.println("Impossibile caricare questo pacco, peso massimo consentito superato, il pacco è stato rimosso");
                    peso_attuale-=peso_pacco;
                    i--;
                }
                else if (peso_attuale == peso_massimo){
                    System.out.println("Peso totale di " + peso_massimo + " kg raggiunto, termine dell'esecuzione del programma con " + i + " pacchi caricati");
                    return;
                }
                else if(peso_pacco == 0){
                    i--;
                    System.out.println("Termine dell'esecuzione del programma, sono stati caricati " + i + " pacchi/pacco, per un peso complessivo di " + peso_attuale + "kg");
                }

                System.out.println("Peso complessivo attualmente: " + peso_attuale + " kg");


            }
            catch(InputMismatchException e){
                System.out.println("Non hai inserito un numero");
                return;

            }

            scanner.close();
        }
    }

}
