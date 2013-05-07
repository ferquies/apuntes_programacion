import java.io.*;
import java.util.Scanner;

class Film
{
	private static final int maxString=100;
	private static final int tamFilm = 2*(maxString+1)+2*Integer.SIZE/8;
	private int cod;
	private String title;
	private int year;
	private String director;

	public Film(int c, String t, int y, String d)
	{
		cod=c;year=y; 
		if (t.length() > maxString)
			title=t.substring(0,maxString);
		else
			title=t;
		if (d.length() > maxString)
			director=d.substring(0,maxString);
		else
			director=d;
	}

 	public void show()
	{
		if(cod != 0)
			System.out.printf("---------------------------\n%d\t%s\n\t%d\tDirector: %s\n---------------------------\n",cod,title,year,director);
		else
			System.out.printf("Esa pelicula no existe.\n");
	}

	public void writeFile(RandomAccessFile raf)
	{
		try
		{
			// sitúo la marca de posición donde corresponda según el código de la película
			raf.seek((cod-1)*tamFilm);
			// ahora escribo los datos de la película a fichero
			raf.writeInt(cod);
			raf.writeBytes(title + '\n');
			raf.writeInt(year);
			raf.writeBytes(director + '\n');
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void readFile(RandomAccessFile raf)
	{
		try
		{
			// sitúo la marca de posición donde corresponda según el código de la película
			raf.seek((cod-1)*tamFilm);
			// ahora leo los datos de la película
			cod=raf.readInt();
			title=raf.readLine();
			year=raf.readInt();
			director=raf.readLine();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}

public class films
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		int salir = 0;
		while(salir == 0) {
			Scanner ent=new Scanner(System.in);
			RandomAccessFile raf=new RandomAccessFile("films.dat","rw");
			System.out.printf("GESTIÓN VIDEOTECA\n============\n\t1. Introducir película\n\t2. Consultar película\n\t0. Salir\nEscoge opción:\n");
			int opc=ent.nextInt();
			int c; Film f;
			switch (opc)
			{
				case 0:
					salir = 1;
					break;
				case 1: System.out.printf("Introduce código:");
					c=ent.nextInt();
					// problema del buffer del teclado
					ent.nextLine();
					System.out.printf("Introduce título:");
					String t=ent.nextLine();
					System.out.printf("Introduce año:");
					int y=ent.nextInt();
					// problema del buffer del teclado
					ent.nextLine();
					System.out.printf("Introduce director:");
					String d=ent.nextLine();
					f=new Film(c,t,y,d);
					f.writeFile(raf);
					break;
				case 2: System.out.printf("Introduce código:");
					c=ent.nextInt();
					f=new Film(c,"",0,"");
					f.readFile(raf);
					f.show();
					break;
				default: if (raf != null) raf.close();System.out.printf("Opción no valida.\n");
			};
		}
	}
}
