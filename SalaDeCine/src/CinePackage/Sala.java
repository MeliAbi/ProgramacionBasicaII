package CinePackage;

public class Sala {
private boolean butacas [][];
private int filas=0;
private int columnas=0;

public Sala (int filas, int columnas) {
	this.filas=filas;
	this.columnas=columnas;
	butacas=new boolean [this.filas][this.columnas];
}

public void inicializarSala () {
	
	for (int i=0;i<butacas.length;i++) {
		for (int j=0;j<butacas[i].length;j++) {
			butacas[i][j]=false;
		}
	}
}
public boolean estaOcupada (int fila, int columna) {
	boolean butacaOcupada=false;
	if (butacas[fila][columna]==true) {
		butacaOcupada=true;
	}
	return butacaOcupada;
}
	
public boolean ocuparButacaLibre (int fila, int columna) {
	boolean seOcupo=false;
	if (butacas[fila][columna]==false&&seOcupo==false) {
		butacas[fila][columna]=true;
		seOcupo=true;
	}
	return seOcupo;
}
 public int contarButacasOcupadas () {
	 int contadorDeButacasOcupadas=0;
	 for (int i=0;i<butacas.length;i++) {
			for (int j=0;j<butacas[i].length;j++) {
				if (butacas[i][j]==true) {
					contadorDeButacasOcupadas++;
				}
			}
		}
	 return contadorDeButacasOcupadas;
 }
 
	public boolean hayEspacioPara(int cantidadDePersonas) {
		int contadorValidacion;

			for (int i = 0; i < butacas.length; i++) {
				contadorValidacion = 0;
				for (int j = 0; j < butacas[i].length; j++) {
					if (butacas[i][j] == false) {
						contadorValidacion++;
						if (contadorValidacion == cantidadDePersonas) {
							return true;
						}
					}
					
				}
			}
		return false;
	}
}
 



