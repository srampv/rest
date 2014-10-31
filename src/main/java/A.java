import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class A  {
	
	
	@Test
	public void testException(){
		try{
			int p=1/0;
			Assert.fail("should have thrown exception Divide By Zero");
		}catch(Exception e){
			Assert.assertTrue(true);
		}
		
	}

}
