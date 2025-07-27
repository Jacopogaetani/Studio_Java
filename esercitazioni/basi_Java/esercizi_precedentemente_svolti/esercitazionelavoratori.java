import java.util.InputMismatchException;
import java.util.Scanner;
//Tre persone eseguono un lavoro. Ognuna di esse è impiegata per un certo numero, anche differente, di ore.
// Conoscendo il compenso complessivo per il lavoro dividerlo in modo proporzionale (in base al n. di ore) fra i tre lavoratori.
//Prima di scrivee il programma, individuare gli input e gli output da restituire
public class esercitazionelavoratori{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            int ore_totali = 0;

            System.out.print("Qual è il compenso totale? ");
            int compenso_totale = scanner.nextInt();

            //Ore lavoratori
            System.out.println("Inserisci le ore di lavoro di tutti gli operai");

            //Persona 1
            System.out.print("Persona 1: ");
            int ore1 = scanner.nextInt();
            ore_totali+=ore1;

            //Persona2
            System.out.print("Persona 2: ");
            int ore2 = scanner.nextInt();
            ore_totali+=ore2;

            //Persona3
            System.out.print("Persona 3: ");
            int ore3 = scanner.nextInt();
            ore_totali+=ore3;

            //Compensi individuali
            int compenso_orario = compenso_totale/ore_totali;

            System.out.println("Compenso persona 1: " + ore1 * compenso_orario);
            System.out.println("Compenso persona 2: " + ore2 * compenso_orario);
            System.out.println("Compenso persona 3: " + ore3 * compenso_orario);
        }

        catch(InputMismatchException e){
            System.out.println("Inserisci esclusivamente numeri");
            return;
        }
    }

}
