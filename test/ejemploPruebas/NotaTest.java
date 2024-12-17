package ejemploPruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NotaTest {

	@Test
	  public void MuyDeficienteTest() {
	    Nota nota = new Nota("matematicas",2);
	    assertEquals("MuyDeficiente",nota.getCalificacion());
	  }
	
	@Test
	  public void InsuficienteTest() {
	    Nota nota = new Nota("matematicas",4);
	    String calificacion= nota.getCalificacion();
	    assertEquals("Insuficiente",calificacion);
	  }

	@Test
	  public void SuficienteTest() {
	    Nota nota = new Nota("matematicas",5);
	    String calificacion= nota.getCalificacion();
	    assertEquals("Suficiente",calificacion);
	  }
	
	@Test
	  public void BienTest() {
	    Nota nota = new Nota("matematicas",6);
	    assertEquals("Bien",nota.getCalificacion());
	  }
	
	@Test
	  public void NotableTest() {
	    Nota nota = new Nota("matematicas",8);
	    String calificacion= nota.getCalificacion();
	    assertEquals("Notable",calificacion);
	  }
	
	@Test
	  public void SobresalienteTest() {
	    Nota nota = new Nota("matematicas",8);
	    String calificacion= nota.getCalificacion();
	    assertEquals("Sobresaliente",calificacion);
	  }
	
	@Test
	  public void NotaInvalidaTest() {
	    Exception ex= assertThrows(Exception.class, () ->{ new Nota("matematicas",11);});
	    assertEquals("valor de nota no valido",ex.getMessage());
	  }
}
