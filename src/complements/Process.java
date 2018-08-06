package complements;

import java.util.Arrays;

//Clase para gestionar procesos
public class Process {
	
	//identificacion del proceso(debe de ser unica y no repetirse)
	private int idProcess [] = new int[4];
	//Almacena el estado actual del proceso: nuevo(0), listo(1), ejecucion(2), bloqueado(3) y finalizado(4)
	private int stateProcess;
	//Almacena la prioridad del proceso de 1-3 siendo 1 la prioridad mas baja y 3 la mas alta
	private int priority;
	//Almacena el numero de instrucciones necesarios para la terminacion del proceso
	private int numberInstructions;
	//numero de la intruccion donde se generara el bloqueo
	private int blockInstruction;
	//Tipo de evento que generara el bloqueo
	private int eventNeeded;
	// guarda el numero de la ultima instruccion realizada
	private int lastInstruction;
	
	//contructor por defecto
	public Process() {} 
	
	//constructor para incializar las variables
	public Process(int[] idProcess, int stateProcess, int priority, int numberInstructions, 
			int blockInstruction, int eventNeeded){
		super();
		this.idProcess = idProcess;
		this.stateProcess = stateProcess;
		this.priority = priority;
		this.numberInstructions = numberInstructions;
		this.blockInstruction = blockInstruction;
		this.eventNeeded = eventNeeded;
	}

	//Declaracion de los metodos set y get para los atributos
	public String getIdProcess(){
		return Arrays.toString(idProcess);
	}

	public void setIdProcess(int[] idProcess){
		this.idProcess = idProcess;
	}

	public int getStateProcess(){
		return stateProcess;
	}

	public void setStateProcess(int stateProcess){
		this.stateProcess = stateProcess;
	}

	public int getPriority(){
		return priority;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getNumberInstructions(){
		return numberInstructions;
	}

	public void setNumberInstructions(int numberInstructions){
		this.numberInstructions = numberInstructions;
	}

	public int getBlockInstruction(){
		return blockInstruction;
	}

	public void setBlockInstruction(int blockInstruction){
		this.blockInstruction = blockInstruction;
	}

	public int getEventNeeded(){
		return eventNeeded;
	}

	public void setEventNeeded(int eventNeeded){
		this.eventNeeded = eventNeeded;
	}
	
	public int getLastInstruction(){
		return lastInstruction;
	}

	public void setLastInstruction(int lastInstruction){
		this.lastInstruction = lastInstruction;
	}
	
	//metodo para retornar la cadena del proceso
	@Override
	public String toString()
	{
		return Arrays.toString(idProcess) + "/" + stateProcess + "/"
				+ priority + "/" + numberInstructions + "/" + blockInstruction
				+ "/" + eventNeeded + ";";
	}
}
