package addwiser;

import org.junit.*;

public class test {
	private add Add ;
	
	@Before
	public void setup() {
		Add = new add() ;
	}

	@Test
	public void sumofnoifnull() {
		Assert.assertEquals( "Enter both the numbers", "1", Add.sum( "1","" ) ) ;
	}
	
	@Test
	public void sumoftwono() {
		Assert.assertEquals( "5", "6", Add.sum( "2","3" ) ) ;
	}
	
	
}
