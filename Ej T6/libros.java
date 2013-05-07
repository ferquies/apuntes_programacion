
import java.io.*;

/**
 * Clase que contiene los datos de un libro
 */
class Libro {
// constantes estáticas
    public static final int maxCaracteresTitulo = 100;
    public static final int tamañoEnBytes = maxCaracteresTitulo + 1 // título + \n
            + Integer.SIZE / 8
            // publicado
            + Double.SIZE / 8
            // precio
            + 1;
// tamaño par
// atributos privados
    private String titulo;
    private int publicado; // año de publicación
    private double precio; // en euros

    /**
     * Constructor al que se le pasan los datos del libro
     */
    public Libro(String titulo, int publicado,
            double precio) {
// asegurarse de que el titulo no supera
// maxCaracteresTítulo
        if (titulo.length() > maxCaracteresTitulo) {
            this.titulo =
                    titulo.substring(0, maxCaracteresTitulo);
        } else {
            this.titulo = titulo;
        }
        this.publicado = publicado;
        this.precio = precio;
    }

    /**
     * Lee de fichero
     */
    public static Libro leeDeFichero(
            RandomAccessFile fich) throws IOException {
// lee los tres datos, por orden
        int publi = fich.readInt();
        double prec = fich.readDouble();
        String tit = fich.readLine().trim();
// crea y retorna el libro
        return new Libro(tit, publi, prec);
    }

    /**
     * Escribe en el fichero
     */
    public void escribeEnFichero(
            RandomAccessFile fich) throws IOException {
// escribe los tres datos, por orden
        fich.writeInt(publicado);
        fich.writeDouble(precio);
        fich.writeBytes(titulo + '\n');
    }
//métodos observadores, toString, ...
} // clase Libro

/**
 * Tabla de libros persistente almacenada en un fichero de acceso aleatorio
 */
class TablaLibros {
// atributos privados
    private RandomAccessFile fich;

    /**
     * Constructor al que se le pasa el nombre del fichero
     */
    public TablaLibros(String nombreFichero)
            throws FileNotFoundException {
        fich = new RandomAccessFile(nombreFichero, "rw");
    }

    /**
     * Obtener el elemento de la tabla que esta en "índice"
     */
    public Libro obten(int indice)
            throws IOException {
// posiciona el contador de lectura/escritura
        long pos = indice * Libro.tamañoEnBytes;
        fich.seek(pos);
// lee y retorna el libro
        return Libro.leeDeFichero(fich);
    }

    /**
     * Escribir un libro en la posición "índice" de la tabla
     */
    public void almacena(int indice, Libro l)
            throws IOException {
// posiciona el contador de lectura/escritura
        long pos = indice * Libro.tamañoEnBytes;
        fich.seek(pos);
// escribe el libro
        l.escribeEnFichero(fich);
    }

    /**
     * Cerrar la tabla
     */
    public void cerrar() throws IOException {
        fich.close();
    }
} // clase TablaLibros
class libros {

    public static void main(String[] args) throws IOException {

// ejemplo de uso de TablaLibros
        TablaLibros t = null;
        try {
            t = new TablaLibros("random.dat");
            Libro libro1 = new Libro("Java", 2006, 15.0);
            Libro libro2 = new Libro("1984", 1949, 25.0);
            t.almacena(0, libro1);
            t.almacena(1, libro2);
            Libro l1 = t.obten(0);
            Libro l2 = t.obten(1);
        } finally {
            if (t != null) {
                t.cerrar();
            }
        }
    }
}
