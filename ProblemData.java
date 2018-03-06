/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package tema;

/**
 *
 * @author alexm
 */
public class ProblemData {

    private String cacheType;
    private int cacheCapacity;
    private String schedulerType;
    private int numberOfEvents;
    private ProcessStructure[] processes;
    private int numberOfNumbers;
    private int[] numbersToBeProcessed;
    
    public ProblemData(String cacheType, int cacheCapacity, String schedulerType,
    		int numberOfEvents, ProcessStructure[] processes, int numberOfNumbers, 
    		int[] numbersToBeProcessed) {
        this.cacheType = cacheType;
        this.cacheCapacity = cacheCapacity;
        this.schedulerType = schedulerType;
        this.numberOfEvents = numberOfEvents;
        this.processes = processes;
        this.numberOfNumbers = numberOfNumbers;
        this.numbersToBeProcessed = numbersToBeProcessed;
    }
    
    public int getNumberOfEvents() {
		return numberOfEvents;
	}

	public int getNumberOfNumbers() {
		return numberOfNumbers;
	}

	/**
     * @return the cacheType
     */
    public String getCacheType() {
        return cacheType;
    }

    /**
     * @return the cacheCapacity
     */
    public int getCacheCapacity() {
        return cacheCapacity;
    }

    /**
     * @return the schedulerType
     */
    public String getSchedulerType() {
        return schedulerType;
    }

    /**
     * @return the processes
     */
    public ProcessStructure[] getProcesses() {
        return processes;
    }

    /**
     * @return the numbersToBeProcessed
     */
    public int[] getNumbersToBeProcessed() {
        return numbersToBeProcessed;
    }    
}
