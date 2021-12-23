package Exercise3_TheoreticalWork2.Exercise_3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

public class CertificationTest {
	
	@Test
	public void test1() throws InvalidException {
		Program p = new Program();
		p.setComp(0);
		p.setCorr(0);
		p.setAppr(10);
		p.setModularity(0);
		p.setReusability(0);
		p.setAnalyzability(0);
		p.setModifiability(10);
		p.setTestability(0);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test2() throws InvalidException {
		Program p = new Program();
		p.setComp(10);
		p.setCorr(35);
		p.setAppr(50);
		p.setModularity(10);
		p.setReusability(10);
		p.setAnalyzability(35);
		p.setModifiability(10);
		p.setTestability(10);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test3() throws InvalidException {
		Program p = new Program();
		p.setComp(35);
		p.setCorr(50);
		p.setAppr(70);
		p.setModularity(35);
		p.setReusability(35);
		p.setAnalyzability(50);
		p.setModifiability(35);
		p.setTestability(50);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test4() throws InvalidException {
		Program p = new Program();
		p.setComp(70);
		p.setCorr(70);
		p.setAppr(90);
		p.setModularity(70);
		p.setReusability(70);
		p.setAnalyzability(90);
		p.setModifiability(50);
		p.setTestability(90);
		assertSame(true, p.isCertificable());
	}
	
	@Test
	public void test5() throws InvalidException {
		Program p = new Program();
		p.setComp(90);
		p.setCorr(90);
		p.setAppr(70);
		p.setModularity(90);
		p.setReusability(90);
		p.setAnalyzability(90);
		p.setModifiability(70);
		p.setTestability(70);
		assertSame(true, p.isCertificable());
	}
	
	@Test
	public void test6() throws InvalidException {
		Program p = new Program();
		p.setComp(-10);
		p.setCorr(10);
		p.setAppr(35);
		p.setModularity(50);
		p.setReusability(50);
		p.setAnalyzability(70);
		p.setModifiability(90);
		p.setTestability(35);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test7() throws InvalidException {
		Program p = new Program();
		
		InvalidException thrown = Assertions.assertThrows(InvalidException.class, () -> {
			p.setComp(10);
			p.setCorr(101);
			p.setAppr(35);
			p.setModularity(50);
			p.setReusability(50);
			p.setAnalyzability(70);
			p.setModifiability(90);
			p.setTestability(35);
			throw new InvalidException();
		});
		
		Assertions.assertEquals("EXCEPTION: You put a value outside the intervals!!", thrown.getMessage());
		assertSame(false, p.isCertificable());
	}

	/*@Test
	public void test11() throws InvalidException {
		Program p = new Program();
		p.setComp(0);
		p.setCorr(90);
		p.setAppr(90);
		p.setModularity(90);
		p.setReusability(90);
		p.setAnalyzability(90);
		p.setModifiability(90);
		p.setTestability(90);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test8() {
		Program p = new Program();
		p.setComp(90);
		p.setCorr(100);
		p.setAppr(90);
		p.setModularity(70);
		p.setReusability(70);
		p.setAnalyzability(70);
		p.setModifiability(90);
		p.setTestability(70);
		assertSame(true, p.isCertificable());
	}
	
	@Test
	public void test9() {
		Program p = new Program();
		p.setComp(0);
		p.setCorr(0);
		p.setAppr(0);
		p.setModularity(0);
		p.setReusability(0);
		p.setAnalyzability(0);
		p.setModifiability(0);
		p.setTestability(0);
		assertSame(false, p.isCertificable());
	}
	
	@Test
	public void test10() {
		Program p = new Program();
		p.setComp(101);
		p.setCorr(101);
		p.setAppr(101);
		p.setModularity(101);
		p.setReusability(101);
		p.setAnalyzability(101);
		p.setModifiability(101);
		p.setTestability(101);
		assertSame(false, p.isCertificable());
	}*/
}
	
	