
/**
 * Clasa RoundRobinScheduler extinde clasa abstracta Scheduler si implementeaza 
 * metoda scheduler a acesteia pentru un planificator ce selecteaza un proces
 * astfel incat, in orice moment de timp, sa existe o diferenta de maximum o unitate
 * intre numarul de rulari ale oricaror doua procese. 
 * 
 * @author Maria Predescu
 *
 */
public class RoundRobinScheduler extends Scheduler {
	
	/**
	 * Metoda ruleaza la rand procesele din sistem pana cand se termina toate numerele
	 * de procesat. In acest fel, mereu va exista cel mult o unitate diferenta intre
	 * numarul de rulari ale oricaror doua procese. Datele procesate sunt scrise in 
	 * fisierul de output ref.
	 * 
	 */
	@Override
	void scheduler(int NumberOfEvents, ProcessStructure[] processes,
			int numberOfNumbers, int[] numbersToBeProcessed, String ref) {
		
		Procese proc = new Procese();
		HomeworkWriter write = new HomeworkWriter(ref);
		int i = 0;
		
		/*
		 * cat timp exista numere de procesat in fisierul de intrare se exectuta pe 
		 * rand procesele existente in sistem
		 * 
		 */
		while(i < numberOfNumbers) { 
			
			//se executa procesele existente in sistem la rand
			for(int j = 0; j < NumberOfEvents; j++) {

				if(processes[j].getType().equals("CheckPrime")) 
					write.println(numbersToBeProcessed[i] + " CheckPrime " +
						proc.CheckPrime(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("NextPrime")) 
					write.println(numbersToBeProcessed[i] + " NextPrime " +
						proc.NextPrime(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("Fibonacci"))
					write.println(numbersToBeProcessed[i] + " Fibonacci " +
						proc.Fibonacci(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("Sqrt"))
					write.println(numbersToBeProcessed[i] + " Sqrt " +
						proc.Sqrt(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("Square"))
					write.println(numbersToBeProcessed[i] + " Square " +
						proc.Square(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("Cube"))
					write.println(numbersToBeProcessed[i] + " Cube " +
						proc.Cube(numbersToBeProcessed[i]) + " Computed");
				
				if(processes[j].getType().equals("Factorial"))
					write.println(numbersToBeProcessed[i] + " Factorial " +
						proc.Factorial(numbersToBeProcessed[i]) + " Computed");
				i++;
				
				//daca nu mai exista numere in fisierul de intrare se iese din bucla
				if(i >= numberOfNumbers)
					break;
			}
			
		}
	write.close();
	}
}
