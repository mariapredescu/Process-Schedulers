
/**
 * Clasa in care care este implementata metoda main
 * 
 * @author Maria Predescu
 *
 */
public class MainClass {
	
	/**
	 * Metoda in care se determina ce tip de planificator este cerut
	 * 
	 * @param args fisierele de input si output
	 */
	public static void main(String[] args) {
    	
		//fisierul de input
		String input = args[0];
		
		//fisierul de output
		String ref = args[1];
		
		HomeworkReader hr = new HomeworkReader(input);
		
		ProblemData pd = hr.readData();
		
		//se creeaza trei obiecte noi, cate unul pentru fiecare tip de planificator
		Scheduler random = new RandomScheduler();
		Scheduler robin = new RoundRobinScheduler();
		Scheduler weight = new WeightedScheduler();
		
		/*
		 * daca comanda este RandomScheduler se va apela metoda scheduler folosind
		 * obiectul random
		 * 
		 */
		if(pd.getSchedulerType().equals("RandomScheduler"))
			random.scheduler(pd.getNumberOfEvents(), pd.getProcesses(),
					pd.getNumberOfNumbers(), pd.getNumbersToBeProcessed(), ref);
		
		/*
		 * daca comanda este RoundRobinScheduler se va apela metoda scheduler folosind
		 * obiectul robin
		 * 
		 */
		if(pd.getSchedulerType().equals("RoundRobinScheduler"))
			robin.scheduler(pd.getNumberOfEvents(), pd.getProcesses(),
					pd.getNumberOfNumbers(), pd.getNumbersToBeProcessed(), ref);
		
		/*
		 * daca comanda este WeightedScheduler se va apela metoda scheduler folosind
		 * obiectul weight
		 * 
		 */
		if(pd.getSchedulerType().equals("WeightedScheduler"))
			weight.scheduler(pd.getNumberOfEvents(), pd.getProcesses(),
					pd.getNumberOfNumbers(), pd.getNumbersToBeProcessed(), ref);
		
		hr.close();
	}

}
