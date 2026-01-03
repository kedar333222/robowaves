package mavenpractice;

import org.testng.annotations.Test;

public class RuntimeParameterTest {
@Test
public void  runtimeParameterTest() {
	System.out.println("hii github ");
	String data = System.getProperty("Beatifull");
	System.out.println(data);
}
}
