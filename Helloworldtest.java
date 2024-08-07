import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Helloworldtest {
	@Test
	void print() {
		System.out.println("hello");
	}
@RepeatedTest(2) 
void show() {
	System.out.println("hi");	
}
@Disabled
void demo() {
	System.out.println("welcome");
}
}
