/**
 * Clase que crea un círculo con sus características básicas
 * 
 * @author Carles
 * @version JDK 1.8 Versión del 12/12/2022
 * @since JDK 1.6 Versión del 06/06/2012
 * @see Para más información sobre la clase entrar en el siguiente enlace: https://.....
 * 
 */

public class Circulo {
	
	//Variables de la classe
	private double centroX ;
	private double centroY ;
	private double radio ;
	
	/**
	 * Constructor de la class Círculo
	 *  
	 * @param cx coordenada x del círculo
	 * @param cy coordenada y del cícculo
	 * @param r radio del círculo
	 */
	public Circulo ( double cx , double cy , double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}
	
	/**
	 * Método que devuelve el atributo centroX
	 * 
	 * @return Devuelve la coordenada x del círculo 
	 */
	public double getCentroX () {
		return centroX ;
	}
	
	/**
	 * Método que devuelve el resultado de la operación de conseguir el perímetro del círculo
	 * 
	 * @return Devuelve el perímetro del círculo
	 */
	public double getCircunferencia () {
		return 2 * Math .PI * radio ;
	}
	
	/**
	 * Método que desplaza el círculo
	 *  
	 * @param deltaX Desplazamiento de la coordenada x
	 * @param deltaY Desplazamiento de la coordenada y
	 */
	public void mueve ( double deltaX , double deltaY ) {
		centroX = centroX + deltaX ;
		centroY = centroY + deltaY ;
	}
	
	/**
	 * @deprecated
	 * @param s Determina el valor de la escala final que se va a emplear
	 */
	public void escala ( double s) {
		radio = radio * s;
	}
	
	/**
	 * 
	 * @param s
	 * @throws NullPointerException 
	 */
	public void test ( double s) throws NullPointerException {
		radio = radio * s;
	}
}
