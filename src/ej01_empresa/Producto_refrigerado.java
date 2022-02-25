package ej01_empresa;

public class Producto_refrigerado extends Producto {

	int codigo_organismo_supervision;
	double temperatura_mantenamiento_recomendada;
	String fecha_envasado;
	String pais_origen;

	public Producto_refrigerado(String fecha_caducidad, int num_lote, int codigo_organismo_supervision,
			double temperatura_mantenamiento_recomendada, String fecha_envasado, String pais_origen) {
		super(fecha_caducidad, num_lote);
		this.codigo_organismo_supervision = codigo_organismo_supervision;
		this.temperatura_mantenamiento_recomendada = temperatura_mantenamiento_recomendada;
		this.fecha_envasado = fecha_envasado;
		this.pais_origen = pais_origen;
	}

	public int getCodigo_organismo_supervision() {
		return codigo_organismo_supervision;
	}

	public void setCodigo_organismo_supervision(int codigo_organismo_supervision) {
		this.codigo_organismo_supervision = codigo_organismo_supervision;
	}

	public double getTemperatura_mantenamiento_recomendable() {
		return temperatura_mantenamiento_recomendada;
	}

	public void setTemperatura_mantenamiento_recomendable(double temperatura_mantenamiento_recomendada) {
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
