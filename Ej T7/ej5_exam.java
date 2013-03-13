class Ciudad {
    static final int TAM = 10;
    String Ciudad[] =  new String[TAM];
    
    public Ciudad() {
        String Ciudad[] =  new String[TAM];
    }
    
    public void cargar() {
        for(int i = 0; i < TAM; i++) {
            System.out.print("Introduce una ciudad: ");
            Ciudad[i] = System.console().readLine();
        }
    }
    
    public void mostrar() {
        for(int i = 0; i < TAM; i++)
            System.out.print(Ciudad[i] + " ");
        System.out.println();
    }
    
    public void ordenar() {
        String aux;
        boolean ordenado = false;
        
        for(int i = Ciudad.length; (i > 0) && (ordenado == false); i--) {
            ordenado = true;
            for(int j = 0; j < TAM - 1; j++) {
                if(Ciudad[j].compareTo(Ciudad[j+1]) > 0) {
                    aux = Ciudad[j];
                    Ciudad[j] = Ciudad[j+1];
                    Ciudad[j+1] = aux;
                    ordenado = false;
                }
            }
        }
    }
    
    public void mostrarNum(int num) {
        System.out.println(Ciudad[num - 1]);
    }
}

public class ej5_exam {
    public static void main(String[] args) {
        Ciudad c = new Ciudad();
        
        c.cargar();
        System.out.println();
        c.mostrar();
        c.ordenar();
        System.out.println();
        c.mostrar();
        System.out.println();
        System.out.print("Introduce el numero de la ciudad: ");
        int num = Integer.parseInt(System.console().readLine());
        c.mostrarNum(num);
    }
}
