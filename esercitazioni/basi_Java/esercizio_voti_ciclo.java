package javafiles.esercitazioni;
import java.util.InputMismatchException;
import java.util.Scanner;

public class esercizio_voti_ciclo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++){
            System.out.print("Inserisci il voto n. " + i  +" : ") ;
            try{
               int voto = scanner.nextInt();
               if (voto >= 6){
                   System.out.println("Voto sufficiente");
               }
               else{
                   System.out.println("Voto insufficiente");
               }
            }
            catch(InputMismatchException e){
                System.out.println("Non hai inserito un numero");
                return;
            }

            scanner.close();
        }
    }
}
