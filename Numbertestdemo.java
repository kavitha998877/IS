import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class Numbertestdemo {
		
	void factorialtest() {
		int exp=120;
		int act=Numberfunction.getfactorial(5);
		assertEquals(exp,act);
	}
}