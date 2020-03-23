package babita.com;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
   // extends Test
{
	App obj;
	

	@BeforeEach
	void setUp(){
		obj=new App();
	}
	@Test
	void test1(){
		assertEquals("BCD",obj.Rem("ABCD"));
	}
	@Test
	void test2(){
		assertEquals("BCD",obj.Rem("BACD"));
	}
	@Test
	void test3(){
		assertEquals("BBAA",obj.Rem("BBAA"));
	}
	@Test
	void test4(){
		assertEquals("BAA",obj.Rem("AABAA"));
	}
	
		
}
