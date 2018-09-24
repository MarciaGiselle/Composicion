package unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompTaxi {

	@Test
	public void testCrearTaxisYChoferes() {
		//contructor solo taxi
		Taxi miTaxi = new Taxi("Ford", "fiesta", "AB456");
		assertNotNull(miTaxi.getChofer());		
		
		//construcor chofer
		Chofer Pepe = new Chofer("Pepe", "Mujica");
		miTaxi.setChofer(Pepe);
		
		//comparo variables
		assertEquals(Pepe.getNombre(),miTaxi.getChofer().getNombre());
		
		//comparo posiciones de memoria, objetos
		assertEquals (Pepe,miTaxi.getChofer());
		//System.out.println(miTaxi.getChofer()+ "--"+ Pepe);
		
		
		//constructor completo
		Taxi otroTaxi = new Taxi("VW", "1500", "afd456", "Cristina", "Aguilera");
		
		assertEquals("Cristina", otroTaxi.getChofer().getNombre());
		//que nombre tiene el objeto Chofer? 
		
		
		
	}

}
