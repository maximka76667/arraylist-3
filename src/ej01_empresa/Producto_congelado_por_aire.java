package ej01_empresa;

public class Producto_congelado_por_aire extends Producto_congelado {

	double porcentaje_nitrogeno, porcentaje_oxigeno, porcentaje_dioxido_carbono, porcentaje_vapor_agua;

	public Producto_congelado_por_aire(String fecha_caducidad, int num_lote,
			double temperatura_mantenamiento_recomendada, String fecha_envasado, String pais_origen,
			double porcentaje_nitrogeno, double porcentaje_oxigeno, double porcentaje_dioxido_carbono,
			double porcentaje_vapor_agua) {
		super(fecha_caducidad, num_lote, temperatura_mantenamiento_recomendada, fecha_envasado, pais_origen);
		this.porcentaje_nitrogeno = porcentaje_nitrogeno;
		this.porcentaje_oxigeno = porcentaje_oxigeno;
		this.porcentaje_dioxido_carbono = porcentaje_dioxido_carbono;
		this.porcentaje_vapor_agua = porcentaje_vapor_agua;
	}

	public double getPorcentaje_nitrogeno() {
		return porcentaje_nitrogeno;
	}

	public void setPorcentaje_nitrogeno(double porcentaje_nitrogeno) {
		this.porcentaje_nitrogeno = porcentaje_nitrogeno;
	}

	public double getPorcentaje_oxigeno() {
		return porcentaje_oxigeno;
	}

	public void setPorcentaje_oxigeno(double porcentaje_oxigeno) {
		this.porcentaje_oxigeno = porcentaje_oxigeno;
	}

	public double getPorcentaje_dioxido_carbono() {
		return porcentaje_dioxido_carbono;
	}

	public void setPorcentaje_dioxido_carbono(double porcentaje_dioxido_carbono) {
		this.porcentaje_dioxido_carbono = porcentaje_dioxido_carbono;
	}

	public double getPorcentaje_vapor_agua() {
		return porcentaje_vapor_agua;
	}

	public void setPorcentaje_vapor_agua(double porcentaje_vapor_agua) {
		this.porcentaje_vapor_agua = porcentaje_vapor_agua;
	}

}
