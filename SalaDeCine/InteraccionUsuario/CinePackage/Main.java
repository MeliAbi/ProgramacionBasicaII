package CinePackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int filas=0,columnas=0,opcion=0;
	final int CONSULTAR_BUTACAS_OCUPADAS=1, OCUPAR_BUTACA=2, CONSULTAR_OCUPADAS=3, CONSULTAR_POR_GRUPO=4, SALIR=9;
	////////////////////////
	System.out.println("Ingrese la cantidad de filas del cine: ");
	filas=teclado.nextInt();
	System.out.println("Ingrese la cantidad de columnas del cine:");
	columnas=teclado.nextInt();
	Sala nuevaSala=new Sala (filas, columnas);
	nuevaSala.inicializarSala();
	////////////////////////
	do {
		menuOpciones();
		opcion=teclado.nextInt();
		switch (opcion) {
		case CONSULTAR_BUTACAS_OCUPADAS:
			int fila=0;
			int columna=0;
			System.out.println("Ingrese la fila");
			fila=teclado.nextInt();
			System.out.println("Ingrese la columna");
			columna=teclado.nextInt();
			if (nuevaSala.estaOcupada(fila, columna)==true) {
				System.out.println("Este asiento esta ocupado.");
			}else {
				System.out.println("Esta libre");
			}
			break;
		case OCUPAR_BUTACA:
			System.out.println("Ingrese la fila");
			fila=teclado.nextInt();
			System.out.println("Ingrese la columna");
			columna=teclado.nextInt();
			if (nuevaSala.ocuparButacaLibre(fila, columna)==true) {
				System.out.println("Se ocupo butaca");
			}else {
				System.out.println("Butaca previamente ocupada");
			}
			break;
		case CONSULTAR_OCUPADAS:
			System.out.println(nuevaSala.contarButacasOcupadas());
			break;
		case CONSULTAR_POR_GRUPO:
			int personas=0;
			System.out.println("Ingrese cuantas personas van a sentarse juntos:");
			personas=teclado.nextInt();
			if (nuevaSala.hayEspacioPara(personas)==true) {
				System.out.println("Hay espacio xd");
			}else {
				System.out.println("Nao nao");
			}
			break;
		case SALIR:
			System.out.println("Fin del programa");
			break;
		default:
			System.out.println("Opcion incorrecta.");
			break;
		}

	}while (opcion!=SALIR);
		
	
	}

	private static void menuOpciones() {
		System.out.println("Menu de opciones:");
		System.out.println("1- Consultar si la butaca esta ocupada");
		System.out.println("2- Ocupar butaca determinada");
		System.out.println("3- Consultar la cantidad total de butacas ocupadas");
		System.out.println("4- Consultar grupo de personas");
		System.out.println("9- Salir ");
	}

}
