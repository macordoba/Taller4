package conceptosAvanzados.Taller4;

import conceptosAvanzados.CalcularSeccion;
import junit.framework.TestCase;

/*
@author Alvaro Cordoba.
@version V 1.0
@since 08/05/2016.
*/

/*
Clase que prueba la clase calcularSeccion
*/

public class AppTest extends TestCase {


	/*
		Metodo que prueba el correcto funcionamiento del programa
	*/
	
    public void testApp()
    {
    	double[] valores = {60000, 60000, 83333, 103333, 123333, 164000, 205000, 217500, 222500, 230000, 283333, 290000, 558000};
		
		CalcularSeccion objetoPruebas = new CalcularSeccion();
		objetoPruebas.setValores(valores);
				
		objetoPruebas.CalcularSisones();

		assertEquals(43953D, objetoPruebas.getVS(), 1D);
		assertEquals(85081D, objetoPruebas.getS(), 1D);
		assertEquals(164696D, objetoPruebas.getM(), 1D);
		assertEquals(318811D, objetoPruebas.getL(), 1D);
		assertEquals(617137D, objetoPruebas.getVL(), 1D);   	
    	
    }
}
