import java.io.*;

public class EjemploFlujos {
	public static void main(String[] args) {
		String s = new String("En un lugar de la mancha de cuyo nombre no quiero acordarme, ");
		s = s + "no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero, ";
		s = s + "adarga antigua, rocín flaco y galgo corredor...";
		char[] arr = new char[s.length()];
		int car = 0;
		StringReader flujoInput = new StringReader(s);
		CharArrayWriter flujoOutput = new CharArrayWriter();
		try {
			while((car = flujoInput.read()) != -1) {
				flujoOutput.write(car);
			}
			arr = flujoOutput.toCharArray();
			System.out.println(arr);
		} catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			flujoInput.close();
			flujoOutput.close();
		}
	}
}