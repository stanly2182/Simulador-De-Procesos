package main;

import complements.List;
import complements.Process;
import java.util.Random;

public class ProcessSimulator {
	
	List newProcess = new List();
	List ready = new List();
	List locked = new List();
	List running = new List();
	List outgoing = new List();
	
	public ProcessSimulator() {}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Process processManager() {
		Process process = null;
		int idProcess [] = new int[4];
		int stateProcess;
		int priority1;
		int numberInstructions;
		int blockInstruction;
		int eventNeeded;
		
		
		
		return process;
	}
	public void newProcessManager() {
		if ((newProcess.getSize()+ready.getSize())+locked.getSize()+running.getSize() <= 10) {
			//newProcess.addEnd();
		}
	}

}
