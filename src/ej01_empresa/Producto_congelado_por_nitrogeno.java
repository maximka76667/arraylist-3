package ej01_empresa;

public class Producto_congelado_por_nitrogeno extends Producto_congelado {

	String metodo_congelacion;
	double tiempo_exposicion;

	public Producto_congelado_por_nitrogeno(String fecha_caducidad, int num_lote,
			double temperatura_mantenamiento_recomendada, String fecha_envasado, String pais_origen,
			String metodo_congelacion, double tiempo_exposicion) {
		super(fecha_caducidad, num_lote, temperatura_mantenamiento_recomendada, fecha_envasado, pais_origen);
		this.metodo_congelacion = metodo_congelacion;
		this.tiempo_exposicion = tiempo_exposicion;
	}

	public String getMetodo_congelacion() {
		return metodo_congelacion;
	}

	public void setMetodo_congelacion(String metodo_congelacion) {
		this.metodo_congelacion = metodo_congelacion;
	}

	public double getTiempo_exposicion() {
		return tiempo_exposicion;
	}

	public void setTiempo_exposicion(double tiempo_exposicion) {
		this.tiempo_exposicion = tiempo_exposicion;
	}

}
