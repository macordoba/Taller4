package conceptosAvanzados;

import java.util.ArrayList;

/*
@author Alvaro Cordoba.
@version V 1.0
@since 08/05/2016.
*/

/*
Clase que calcula las sección de un rango 
*/

public class CalcularSeccion
{
	private double VS;
	private double S;
	private double M;
	private double L;
	private double VL;
	private ArrayList<Double> valores;
	private double O2;
	private double O;
	private double AVG;
		
	public double getVS() {
		return VS;
	}

	public double getS() {
		return S;
	}

	public double getM() {
		return M;
	}

	public double getL() {
		return L;
	}

	public double getVL() {
		return VL;
	}

	public double getAVG() {
		return AVG;
	}

	 /*
    Metodo que mapea las variables que se envian desde afuera de la clase
    @param temporal es un arreglo int
    @return variable de tipo ArrayList<Double>.
	  */
	
	public void setValores(double[] valores)
	{
    	this.valores = llenar(valores);		
	}
	
	 /*
		Metodo que mapea las variables que se envian desde afuera de la clase
		@param temporal es un arreglo double
		@return variable de tipo ArrayList<Double>.
	  */
	
	private ArrayList<Double> llenar(double[] temporal)
	{
		ArrayList<Double> valores = new ArrayList<Double>();
		
		for(double valor : temporal)
		{
			valores.add(valor);
		}
		
		return valores;
	}
  
	/*
		Metodo Coordina el calculo de todas las secciones
	*/
	
	 public void CalcularSisones()
	 {
		 calcularAVG();
		 calcularOs();
		 calularCoeficientes();
	 }
	 
	 /*
		Metodo que calcula la secciones
	  */
	 	 
	private void calularCoeficientes() {
		VS = Math.exp(AVG - 2*O);
		S = Math.exp(AVG - O);
		M = Math.exp(AVG);
		L = Math.exp(AVG + O);
		VL = Math.exp(AVG + 2*O);
		
	}

	/*
		Metodo que calcula la sigma cuadrado
	 */
		
	private void calcularOs() {
		O2 = Operaciones.calcularLnAVG(valores,AVG)/(valores.size()-1);
		O = Math.sqrt(O2);
	}

	/*
		Metodo que calcula AVG
   */
	
	private void calcularAVG() {
		AVG = Operaciones.calcularLn(valores)/valores.size();	
	}

	@Override
    public String toString() {
    	return "VS: " + VS + " - S: " + S + " - M: " + M + " - L: " + L + " - VL: " + VL;    	
    };
}
