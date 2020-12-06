package zad1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExampleTest {
	
	
	private Example rp;

	@Before
	public void setUp() {

		rp = new Example();
	//	System.out.println("Before");
	}
	
	@After
	public void tearDown() {
		
		rp=null;
	//	System.out.println("After");
	}

	
	@Test
	//gdy wynik wiekszy od rekordu swiata test metody
	public void ExampleTest2() {
		int result = rp.ResultPoints(10, 20);
		assertEquals(50,result);
		
	//	System.out.println("Test 1");
		
	}
	@Test
	//gdy wynik równy rekordowi swiata test metody
	public void ExampleTest3() {
		int result = rp.ResultPoints(4, 4);
		assertEquals(100,result);
//		System.out.println("Test 2"+ result);
		
	}
	
	@Test
	//gdy wynik wiekszy od rekordu swiata test parametrów
	public void ExampleTest4() {
		
		rp.wr= 3;
		rp.result= 4;
		int wr = rp.wr;
		int results = rp.result;
		assertTrue("rekord swiata wiekszy od wyniku ",wr < results);
		
	//	System.out.println("Test 3");
		
	}
	@Test
	//gdy wynik mniejszy od rekordu swiata test parametrów
	public void ExampleTest5() {
		
		rp.wr= 4;
		rp.result= 3;
		int wr = rp.wr;
		int results = rp.result;
		assertTrue("rekord swiata mniejszy od wyniku",wr > results);
//		System.out.println("Test 4");
		
	}
	@Test
	//gdy wynik równy rekordowi swiata test parametrów
	public void ExampleTest6() {
		
		rp.wr= 4;
		rp.result= 3;
		int wr = rp.wr;
		int results = rp.result;
		assertFalse("rekord swiata ró¿ny od wyniku",wr == results);
//		System.out.println("Test 5");
		
	}
	@Test
public void ExampleTest7() {
		//test wartosci null wyniku metdy wymaga wy³aczenia IllegalArgumentException
		int result = rp.ResultPoints(1, 1);
		assertNotNull("punkty maja wartosæ null",result );
//		System.out.println("Test 6"+ result);
		
	}
//	@Test
//public void ExampleTest8() {
		//test wartosci null wyniku metdy wymaga wy³aczenia IllegalArgumentException
//	int result = rp.ResultPoints(0, 0);
//	assertNull("punkty maja wartosæ null",result );
//	System.out.println("Test 7"+ result);
	
//}
}
