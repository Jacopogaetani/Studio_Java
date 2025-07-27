//Un'eccezione è una situazione anomala che si verifica durante l'esecuzione del programma (Come una divisione per 0)
//Alcuni tipi di eccezioni:
//-ArithmeticExcpetion: errori artimetici
//-NullPointerException: per un errore a un riferimento che possiede valore null
//-IndexOutOfBoundException: per un errore nell'indice di un array
//-IOException: per un errore generico di Input/output

//SE UN'ECCEZIONE NON VIENE GESTITA IL PROGRAMMA VIENE INTERROTTO 

class eccezioni{


	public static void main (String []args)
	{
		//Il costrutto try-catch è necessaria per gestire le eccezioni
		//try
		//{
		//	istruzione da controllare
		//}
		//
		//catch(eccezione 1)
		//{
		//	da eseguire in caso di eccezione
		//}
		try {
			int a = 10 / 0;
		}
		catch(ArithmeticException e){
			System.out.println("impossibile per dividere per 0");
		}


		
	 }
}
