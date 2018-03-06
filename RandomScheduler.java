
import java.util.Random;

/**
 * Clasa RandomScheduler extinde clasa abstracta Scheduler si implementeaza 
 * metoda scheduler a acesteia pentru un planificator ce selecteaza, aleator,
 * un proces pentru rulare din procesele existente in sistem.
 * 
 * @author Maria Predescu
 *
 */
public class RandomScheduler extends Scheduler {
	
	/**
	 * Metoda selecteaza, aleator, un proces pentru rulare cu ajutorul clasei
	 * Random care genereaza un numar aleator intre 0 si numarul de procese 
	 * existente in sistem. Fiecarui proces ii corespunde unul dintre numerele
	 * respective, astfel ca pentru fiecare numar ce trebuie procesat este generat
	 * un numar aleator caruia ii este asociat un proces. Datele procesate sunt
	 * scrise in fisierul de output ref.
	 * 
	 */
	@Override
	void scheduler(int NumberOfEvents, ProcessStructure[] processes, 
			int numberOfNumbers, int[] numbersToBeProcessed, String ref) {
		
		Procese proc = new Procese();
		HomeworkWriter write = new HomeworkWriter(ref);
		
		//este parcurs vectorul de numere ce trebuie procesate
		for(int i = 0; i < numberOfNumbers; i++) {

			Random r = new Random();
			
			//se genereaza numarul aleator ce este asociat unui proces din sistem
			int k = r.nextInt(NumberOfEvents);
			
			if(processes[k].getType().equals("CheckPrime")) 
				write.println(numbersToBeProcessed[i] + " CheckPrime " + 
					proc.CheckPrime(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("NextPrime")) 
				write.println(numbersToBeProcessed[i] + " NextPrime " +
					proc.NextPrime(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("Fibonacci"))
				write.println(numbersToBeProcessed[i] + " Fibonacci " +
					proc.Fibonacci(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("Sqrt"))
				write.println(numbersToBeProcessed[i] + " Sqrt " +
					proc.Sqrt(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("Square"))
				write.println(numbersToBeProcessed[i] + " Square " +
					proc.Square(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("Cube"))
				write.println(numbersToBeProcessed[i] + " Cube " +
					proc.Cube(numbersToBeProcessed[i]) + " Computed");
			
			if(processes[k].getType().equals("Factorial"))
				write.println(numbersToBeProcessed[i] + " Factorial " +
					proc.Factorial(numbersToBeProcessed[i]) + " Computed");
		}
	write.close();
	}
}
