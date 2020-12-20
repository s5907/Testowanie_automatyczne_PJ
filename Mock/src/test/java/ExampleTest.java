import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;
import org.junit.*;



public class ExampleTest {
	private int funkcja2, funkcja1;
	private int AddTo;
	private  String name;
	private  String Addname;
	//private int  rp;
	
	
	@Test
	public void example() {
		Example example = new Example();
		funkcja1 = example.funkcja1();
		assertEquals(0, funkcja1);
	}
	
	@Test
	public void example2() {
		Example example = mock(Example.class);
		funkcja2 = example.funkcja2();
		assertEquals(0, funkcja2);
	}
	
	@Test
	public void example3() {
		Example example = mock(Example.class);
		when(example.funkcja2()).thenReturn(2);
		funkcja2 = example.funkcja2();
		assertEquals(2, funkcja2);
	}
	
	@Test
	public void example4() {
		Example example = mock(Example.class);
		given(example.funkcja2()).willReturn(1);
		funkcja2 = example.funkcja2();
		assertEquals(1, funkcja2);
	}

	@Test
	public void example5() {
		Example example = mock(Example.class);
		given(example.AddTo(2)).willReturn(4);
		AddTo = example.AddTo(2);
		assertEquals(4, AddTo);
	}

	@Test
	public void example6() {
		Example example = mock(Example.class);
		given(example.name()).willReturn("jarek");
		name = example.name();
		assertEquals("jarek", name);
	}


	@Test
	public void example7() {
		Example example = mock(Example.class);
		given(example.Addname("artur")).willReturn("artur");
		Addname = example.Addname("artur");
		assertEquals("artur", Addname);
	}

	//@Test
	//gdy wynik wiekszy od rekordu swiata test metody
//	public void ExampleTest5() {
//	Example example = mock(Example.class);
//	given(example.rp()).willReturn(10, 20);

//	rp = example.rp();
//		int result = rp.ResultPoints(10, 20);
	
//	assertEquals(50,result);
		
	//	System.out.println("Test 1");
		
//	}

}