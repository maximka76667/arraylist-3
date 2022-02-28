package ej01_empresa;

public class Main {

	public static void main(String[] args) {

		// Productos frescos
		Producto_fresco fresco1 = new Producto_fresco("25.03.2022", 1, "25.02.2022", "España");
		Producto_fresco fresco2 = new Producto_fresco("30.05.2022", 2, "30.03.2022", "Rusia");

		// Productos refrigerados
		Producto_refrigerado refrigerado1 = new Producto_refrigerado("30.04.2022", 2, 1, -5, "30.03.2022", "Portugal");
		Producto_refrigerado refrigerado2 = new Producto_refrigerado("29.04.2022", 3, 5, 0, "29.04.2022", "Alemania");
		Producto_refrigerado refrigerado3 = new Producto_refrigerado("28.02.2022", 4, 16, 10, "28.03.2022", "Mexico");

		// Productos congelados
		Producto_congelado congelado1 = new Producto_congelado_por_agua("28.02.2022", 3, 10, "28.01.2022",
				"Ustados Unidos", 0.5);
		Producto_congelado congelado2 = new Producto_congelado_por_agua("28.02.2022", 3, 10, "28.01.2022",
				"Ustados Unidos", 0.8);

		Producto_congelado congelado3 = new Producto_congelado_por_aire("30.05.2022", 14, 4.4, "28.04.2022", "Ucrania",
				60, 30, 5, 5);
		Producto_congelado congelado4 = new Producto_congelado_por_aire("30.05.2022", 14, 4.4, "28.04.2022", "Ucrania",
				55, 30, 7.5, 7.5);

		Producto_congelado congelado5 = new Producto_congelado_por_nitrogeno("30.06.2022", 20, 2, "28.05.2022",
				"Belorusia", "criogénica", 60);

	}

}
