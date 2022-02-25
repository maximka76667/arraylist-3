package ej01_empresa;

public class Producto {

	String fecha_caducidad;
	int num_lote;

	public Producto(String fecha_caducidad, int num_lote) {
		this.fecha_caducidad = fecha_caducidad;
		this.num_lote = num_lote;
	}

	public String getFecha_caducidad() {
		return fecha_caducidad;
	}

	public void setFecha_caducidad(String fecha_caducidad) {
		this.fecha_caducidad = fecha_caducidad;
	}

	public int getNum_lote() {
		return num_lote;
	}

	public void setNum_lote(int num_lote) {
		this.num_lote = num_lote;
	}
}
