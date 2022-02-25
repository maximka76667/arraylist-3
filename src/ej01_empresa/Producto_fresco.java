package ej01_empresa;

public class Producto_fresco extends Producto {

	String fecha_envasado;
	String pais_origen;

	public Producto_fresco(String fecha_caducidad, int num_lote, String fecha_envasado, String pais_origen) {
		super(fecha_caducidad, num_lote);
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
	}

	public String getFecha_envasado() {
		return fecha_envasado;
	}

	public void setFecha_envasado(String fecha_envasado) {
		this.fecha_envasado = fecha_envasado;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}
}
