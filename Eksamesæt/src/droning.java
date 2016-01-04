import java.awt.Point;
import java.util.Arrays;

public class droning {
	

			 public static void main(String[] args) {
			String a = "konge";
			 String b = "toer";
			 String c = "dronning";
			  String to = "femmer";
			 
			 saetning(a, b, c);
			 saetning("b", c, c);
			 saetning(to, "toer", a);
			 saetning(c, a, b);
			 saetning(to, "dronning", b);
			 }
			 
			 public static void saetning(String b, String c, String a) {
			 System.out.println("en " + c + " og en " + a + " sl˚ar en " + b);
			 }
			 }

//en toer og en konge slår en droning.
//en dronning og en dronning slår en b.
//en toer og en konge slår en femmer.
//en konge og en toer slår en droning.
//en dronning og en toer slår en femmer.