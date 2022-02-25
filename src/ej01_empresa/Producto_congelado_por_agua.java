package ej01_empresa;

public class Producto_congelado_por_agua extends Producto_congelado {

	double salinidad;

	public Producto_congelado_por_agua(String fecha_caducidad, int num_lote,
			double temperatura_mantenamiento_recomendada, String fecha_envasado, String pais_origen, double salinidad) {
		super(fecha_caducidad, num_lote, temperatura_mantenamiento_recomendada, fecha_envasado, pais_origen);
		this.salinidad = salinidad;
	}

	public double getSalinidad() {
		return salinidad;
	}

	public void setSalinidad(double salinidad) {
		this.salinidad = salinidad;
	}

}
