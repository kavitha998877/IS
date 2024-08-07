import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

public class Assumption {
	@Test
	void testonassumption() {
		int a=5,b=8;
		Assumptions.assumingThat(a==b,()->{System.out.println("testing a==b");});
		
	}

}
