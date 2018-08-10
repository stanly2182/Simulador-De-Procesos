package Main;

import java.util.Random;

import Complementos.Lista;
import Complementos.Proceso;
//import java.util.Random;

public class ProcesoSimulador {
	
	Lista nuevoProceso = new Lista();
	Lista listo = new Lista();
	Lista bloqueado = new Lista();
	Lista ejecutando = new Lista();
	Lista saliente = new Lista();
	
	public ProcesoSimulador() {
		int i[] = new int[4];
		int j[] = new int[4];
		i[0]=1;
		i[1]=1;
		i[2]=1;
		i[3]=1;
		nuevoProceso.añadirFinal(new Proceso(i, 3, 3, 3, 3, 3));
		j[0]=0;
		j[1]=1;
		j[2]=0;
		j[3]=0;
		nuevoProceso.añadirFinal(new Proceso(j, 3, 2, 3, 3, 3));
		System.out.println(nuevoProceso.getValor(0).toString());
		System.out.println(nuevoProceso.getValor(1).toString());
		nuevoProceso.borrarLista();
	}
	
	public Proceso gestorProcesos() {
		Proceso proceso = null;
		/*int idProceso [] = new int[4];
		int estadoProceso;
		int prioridad;
		int numInstruccion;
		int instruccionBloqueada;
		int eventoNecesario;
		*/
		return proceso;
	}
	public void nuevoGestorProcesos() {
		
		
	}
	
	public static int generaID()
	{
		Random r = new Random();
		int id;
		id = r.nextInt(16);
		return id;
	}

	public static String idBinario()
	{
		int idProceso = generaID();
		String idBinario = "";
		int modulo;
		
		while (idProceso > 0)
		{
			modulo = idProceso % 2;
			idBinario = modulo + idBinario; 
			idProceso = idProceso/2; 		
		}
		
		if (Integer.parseInt(idBinario) <= 1)
		{
			idBinario = "000" + idBinario;						
		}
		else 
			if((Integer.parseInt(idBinario) >= 1 ) && Integer.parseInt(idBinario)<=11)
			{
				idBinario = "00" + idBinario;
			}
			else 
				if((Integer.parseInt(idBinario) >= 11 ) && Integer.parseInt(idBinario)<=111) 
				{
				idBinario = "0" + idBinario;
				}
				else idBinario = "" + idBinario;
		guardarID(idBinario);
		cantidadInstrucciones(idBinario);
		return idBinario;
	}
	
	public static int i = 0;
	public static int tam = 16;
	
	public static void guardarID(String idBinario){
		String arrayID[] = new String[tam];
		if(verificarID(arrayID,idBinario) == true)
		{
			arrayID[i] = idBinario;
		}
		else idBinario();
	i = i + 1;
	}
	
	public static boolean verificarID(String arrayID[],String idBinario) {
		boolean existe = false;	
		for(int j = 0 ; j <= tam; j++)
		{
			if(arrayID[j] == idBinario) {
				existe = true;  
			}
			else
				existe = false;
		}
		return existe;
	}
	
	public static int asignarEstado() {
		int estado;
		Random r = new Random();
		estado = r.nextInt(5);
		return estado;
	}
	
	public static int asignarPrioridad(String idBinario) {
		int prioridad;
		Random r = new Random();
		prioridad = r.nextInt(4);
		return prioridad;
	}
	
	public static int cantidadInstrucciones(String idBinario) {
		int numInstrucciones;
		Random r = new Random();
		numInstrucciones = r.nextInt(500);
		return numInstrucciones;
	}
	
	public static int instruccionBloqueo(String arrayID[], int numInstrucciones) {
		int instruccionBloqueo;
		Random r = new Random();
		
		instruccionBloqueo = r.nextInt(numInstrucciones + 1);
		return instruccionBloqueo;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ProcesoSimulador();
	}
	
	
	
}
