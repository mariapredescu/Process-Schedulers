
/**
 * Clasa abstracta ce contine o metoda ce planifica procese ce va fi ulterior
 * implementata in clasele ce extind clasa Scheduler in functie de fiecare 
 * planificator ce se cere a fi implementat.
 * 
 * @author Maria Predescu
 *
 */
abstract class Scheduler {
	
	/**
	 * Metoda va fi implementata in clasele ce extind clasa abstracta Scheduler
	 * in functie de tipul de planificator ce se cere a fi implementat.
	 * 
	 * @param NumberOfEvents numarul de procese din fisierul dat
	 * @param processes structura de procese ce contine numele procesului si cota
	 * acestuia
	 * @param numberOfNumbers numarul de numere carora trebuie sa li se atribuie un proces
	 * @param numbersToBeProcessed numerele asupra carora se efectueaza operatiile
	 * @param ref fisierul de iesire in care se scriu rezultatele dupa aplicarea 
	 * proceselor pe fiecare numar din fisierul de intrare
	 * 
	 */
	abstract void scheduler(int NumberOfEvents, ProcessStructure[] processes,
			int numberOfNumbers, int[] numbersToBeProcessed, String ref);
}
