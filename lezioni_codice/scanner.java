//Accettare input dall'utente
import java.util.Scanner;
//È necessario importare l'utility per usare lo scanner

public class scanner
{
	public static void main(String[] args)
	{
		//Creazione dell'ogetto scanner che riesce a leggere input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Scrivi il tuo nome: ");

		//Si assegna alla variabile di tipo stringa il nome che si inserisce 
		String nome = scanner.nextLine();
		System.out.println("Ciao " + nome);

		//Per avere tutto sulla stessa riga si usa print al posto di println (print line)
		try{
			System.out.print("Inserisci un numero: ");
			int numero = scanner.nextInt();
		}
		catch(Exception e){
			System.out.println("Non hai inserito un numero");
		}
	

		//È buona norma chiudere lo scanner
	 	scanner.close();
	}
}
