package conceptosAvanzados;

import java.util.ArrayList;

public class CalcularSesiones 
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

	public void setValores(double[] valores)
	{
    	this.valores = llenar(valores);		
	}
	

	private ArrayList<Double> llenar(double[] temporal)
	{
		ArrayList<Double> valores = new ArrayList<Double>();
		
		for(double valor : temporal)
		{
			valores.add(valor);
		}
		
		return valores;
	}
		
	 public void CalcularSisones()
	 {
		 calcularAVG();
		 calcularOs();
		 calularCoeficientes();
	 }
	 
	 
	private void calularCoeficientes() {
		VS = Math.exp(AVG - 2*O);
		S = Math.exp(AVG - O);
		M = Math.exp(AVG);
		L = Math.exp(AVG + O);
		VL = Math.exp(AVG + 2*O);
		
	}

	private void calcularOs() {
		O2 = Operaciones.calcularLnAVG(valores,AVG)/(valores.size()-1);
		O = Math.sqrt(O2);
	}

	private void calcularAVG() {
		AVG = Operaciones.calcularLn(valores)/valores.size();	
	}

	@Override
    public String toString() {
    	return "VS: " + VS + " - S: " + S + " - M: " + M + " - L: " + L + " - VL: " + VL;    	
    };
}
