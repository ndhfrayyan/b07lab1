import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;


public class Driver {
public static void main(String [] args) {
		// test constructor
		Polynomial P1 = new Polynomial();
		System.out.println(P1.pc.length == 0);
		double f[] ={-1.0, -2.0, 3.0, 4.0, 5.0};
		int g[] = {5, 2, 4, 3, 1};
		Polynomial P2 = new Polynomial(f, g);
		double h[] ={-5.0, -4.0, -3.0, 2.0, 1.0}; 
		int i[] = {1, 3, 4, 2, 5};
		Polynomial P3 = new Polynomial(h, i);
		// test add
		Polynomial P5 = P2.add(P3);
		System.out.println(P5.pc.length == 0);
		// test multiply
		Polynomial P4 = new Polynomial(h, g);
		Polynomial P6 = P4.multiply(P3);
		for(int j = 0; j < P6.pc.length; j++){
			System.out.println(P6.pc[j] + "x" + P6.pw[j]);
		}
		// test evaluate
		System.out.println(P6.evaluate(1));
		// test hasRoot
		System.out.println(P6.hasRoot(0));
		// test saveToFile
		String s = "test.txt";
		P6.saveToFile(s);
	}
}