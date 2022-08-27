package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV (Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		TV.numTV++;
	}
	
	public void setMarca (Marca marca) {
		this.marca = marca;
	}
	
	public Marca getMarca () {
		return marca;
	}
	
	public void setControl (Control control) {
		this.control = control;
	}
	
	public Control getControl () {
		return control;
	}
	
	public void setPrecio (int precio) {
		this.precio = precio;
	}
	
	public int getPrecio () {
		return precio;
	}
	
	public void setVolumen (int volumen) {
		if (volumen >= 1 && volumen <=7 && estado) {
			this.volumen = volumen;
		}
	}
	
	public int getVolumen () {
		return volumen;
	}
	
	public void setCanal (int canal) {
		if (canal>= 1 && canal<= 120 && estado) {
			this.canal = canal;
		}
	}
	
	public int getCanal () {
		return canal;
	}
	
	public static void setNumTV (int numTV) {
		TV.numTV = numTV;
	}
	
	public static int getNumTV () {
		return numTV;
	}
	
	public void turnOn () {
		this.estado = true;
	}
	
	public void turnOff () {
		this.estado = false;
	}
	
	public boolean getEstado () {
		return estado;
	}
	
	public void canalUp () {
		if (canal < 120 && canal>=1 && estado) {
			canal++;
		}
	}
	
	public void canalDown () {
		if (canal <= 120 && canal>1 && estado) {
			canal--;
		}
	}
	
	public void volumenUp () {
		if (volumen>=0 && volumen<7 && estado) {
			volumen++;
		}
	}
	
	public void volumenDown () {
		if (volumen>0 && volumen<=7 && estado) {
			volumen--;
		}
	}	
	
}
