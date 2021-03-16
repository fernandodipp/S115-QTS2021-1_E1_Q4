package main;
import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;

public class ValidaTaxaTest {
	@Test
	public void ValidaTaxaTest1() {
		ValidaTaxa objExerc = new ValidaTaxa();		
		int entradaUser = 4;
		boolean resultadoesperado = false;
		boolean resultadoPrograma = objExerc.validaTaxa(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaTaxaTest2() {
		ValidaTaxa objExerc = new ValidaTaxa();		
		int entradaUser = 5;
		boolean resultadoesperado = true;
		boolean resultadoPrograma = objExerc.validaTaxa(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaTaxaTest3() {
		ValidaTaxa objExerc = new ValidaTaxa();		
		int entradaUser = 20;
		boolean resultadoesperado = true;
		boolean resultadoPrograma = objExerc.validaTaxa(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}
	@Test
	public void ValidaTaxaTest4() {
		ValidaTaxa objExerc = new ValidaTaxa();		
		int entradaUser = 21;
		boolean resultadoesperado = false;
		boolean resultadoPrograma = objExerc.validaTaxa(entradaUser);
		Assert.assertEquals(resultadoesperado, resultadoPrograma);
	}

}
