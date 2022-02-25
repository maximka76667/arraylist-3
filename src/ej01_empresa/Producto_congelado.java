package ej01_empresa;

public class Producto_congelado extends Producto {

	double temperatura_mantenamiento_recomendada;
	String fecha_envasado;
	String pais_origen;

	public Producto_congelado(String fecha_caducidad, int num_lote, double temperatura_mantenamiento_recomendada,
			String fecha_envasado, String pais_origen) {
		super(fecha_caducidad, num_lote);
		this.temperatura_mantenamiento_recomendada = temperatura_mantenamiento_recomendada;
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
	}

	public double getTemperatura_mantenamiento_recomendada() {
		return temperatura_mantenamiento_recomendada;
	}

	public void setTemperatura_mantenamiento_recomendada(double temperatura_mantenamiento_recomendada) {
		this.temperatura_mantenamiento_recomendada = temperatura_mantenamiento_recomendada;
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
