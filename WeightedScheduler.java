
/**
 * Clasa WeightedScheduler extinde clasa abstracta Scheduler si implementeaza 
 * metoda scheduler a acesteia pentru un planificator ce selecteaza un proces
 * astfel incat, la momente de timp multiplu de t, sa asigure respectarea 
 * cotelor impuse de catre administrator.
 *
 * t = suma(cote) / cmmdc(cote) 
 *
 * @author Maria Predescu
 *
 */

public class WeightedScheduler extends Scheduler {
	
	/**
	 * Metoda determina cel mai mare divizor comun a doua numere.
	 * 
	 * @param a primul numar
	 * @param b al doilea numar
	 * @return cel mai mare divizor comun al numerelor a si b
	 */
	public int cmmdc2(int a, int b) {
			if(b == 0) return a;
			else return cmmdc2(b, a % b);
	}
	/**
	 * Metoda determina cel mai mare divizor comun a mai multor numere.
	 * 
	 * @param a un vector de numere
	 * @return cmmdc a numerelor din vectorul a
	 * 
	 */
	public int cmmdcn(int[] a) {
		
		int cmmdc = a[0];
		for(int i = 0; i < a.length; i++) {
			cmmdc = cmmdc2(cmmdc, a[i]);
		}
		return cmmdc;
	}
	
	/**
	 * Metoda pune cotele proceselor din sistem intr-un vector
	 * 
	 * @param numberOfEvents numarul proceselor din sistem
	 * @param processes vectorul de structuri de procese 
	 * @return vectorul de cote al proceselor din sistem
	 */
	public int[] weight(int numberOfEvents, ProcessStructure[] processes) {
		int[] weight = new int[numberOfEvents];
		for(int i = 0; i < numberOfEvents; i++) {
			weight[i] = processes[i].getWeight();
		}
		return weight;
	}
	
	/**
	 * Metoda ruleaza la rand procesele de atatea ori cat arata numarul de cota
	 * impartit la cmmdc dintre cotele proceselor din sistem. Astfel, la fiecare
	 * moment multiplu de t se asigura respectarea cotele impuse de administrator.
	 * Datele procesate sunt scrise in fisierul de output ref.
	 */
	@Override
	void scheduler(int NumberOfEvents, ProcessStructure[] processes,
			int numberOfNumbers, int[] numbersToBeProcessed, String ref) {
		
		Procese proc = new Procese();
		HomeworkWriter write = new HomeworkWriter(ref);
		
		int[] w = weight(NumberOfEvents, processes); 
		int cmmdc = cmmdcn(w);
		int i = 0;
		
		/*
		 * cat timp exista numere de procesat in fisierul de intrare se exectuta
		 * procesele existente in sistem in functie de cota asociata fiecaruia
		 * 
		 */
		while(i < numberOfNumbers) {
			
			/*
			 * se executa procesele existente in sisitem de atatea ori cat arata 
			 * numarul de cota al procesului impartit la cmmdc
			 *
			 */
			for(int j = 0; j < NumberOfEvents; j++) {
				
				if(processes[j].getType().equals("CheckPrime")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " CheckPrime " +
							proc.CheckPrime(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
				if(processes[j].getType().equals("NextPrime")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " NextPrime " +
							proc.NextPrime(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
				if(processes[j].getType().equals("Sqrt")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " Sqrt " +
							proc.Sqrt(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
				if(processes[j].getType().equals("Square")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " Square " +
							proc.Square(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
				if(processes[j].getType().equals("Fibonacci")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " Fibonacci " +
							proc.Fibonacci(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
				if(processes[j].getType().equals("Cube")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " Cube " +
								proc.Cube(numbersToBeProcessed[i]) + " Computed");
						i++;	
					}
				}
				if(processes[j].getType().equals("Factorial")){
					for(int k = 0; k < processes[j].getWeight() / cmmdc; k++) {
						//daca nu mai exista numere de procesat se iese din bucla
						if(i >= numberOfNumbers)
							break;
						write.println(numbersToBeProcessed[i] + " Factorial " +
							proc.Factorial(numbersToBeProcessed[i]) + " Computed");
						i++;
					}
				}
			}
		}
		write.close();
	}
}
