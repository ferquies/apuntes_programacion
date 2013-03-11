class figura {
    protected String color;
    protected double grosorLinea;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getGrosorLinea() {
        return grosorLinea;
    }

    public void setGrosorLinea(double grosorLinea) {
        this.grosorLinea = grosorLinea;
    }
}


class rectangulo extends figura{
    private double lado1, lado2;
    
    public rectangulo(double lado1, double lado2, String color, double grosorLinea) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.color = color;
        this.grosorLinea = grosorLinea;
    }

    public rectangulo() {
        this.lado1 = 1;
        this.lado2 = 3;
        this.color = "Black";
        this.grosorLinea = 0.5;
    }
    
    public rectangulo(rectangulo r) {
        this.lado1 = r.lado1;
        this.lado2 = r.lado2;
        this.color = r.color;
        this.grosorLinea = r.grosorLinea;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    public double area() {
        return lado1*lado2;
    }
}

class cuadrado extends figura{
    private double lado;
    
    public cuadrado(double lado, String color, double grosorLinea) {
        this.lado = lado;
        this.color = color;
        this.grosorLinea = grosorLinea;
    }

    public cuadrado() {
        this.lado = 5;
        this.color = "Black";
        this.grosorLinea = 0.5;
    }
    
    public cuadrado(cuadrado c) {
        this.lado = c.lado;
        this.color = c.color;
        this.grosorLinea = c.grosorLinea;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double area() {
        return lado*lado;
    }
}

class circulo extends figura{
    private double radio;
    
    public circulo(double radio, String color, double grosorLinea) {
        this.radio = radio;
        this.color = color;
        this.grosorLinea = grosorLinea;
    }

    public circulo() {
        this.radio = 3;
        this.color = "Black";
        this.grosorLinea = 0.5;
    }
    
    public circulo(circulo c) {
        this.radio = c.radio;
        this.color = c.color;
        this.grosorLinea = c.grosorLinea;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double area() {
        return (radio*3.14)*(radio*3.14);
    }
}

public class ejfigura {
    public static void main(String[] args) {
        rectangulo r1 = new rectangulo(3.2, 5.4, "Blue", 2);
        rectangulo r2 = new rectangulo();
        cuadrado cu1 = new cuadrado(4.2, "Red", 2.2);
        cuadrado cu2 = new cuadrado();
        circulo ci1 = new circulo(5.1, "Yellow", 1.2);
        circulo ci2 = new circulo();

        System.out.println("r1 lado 1 = " + r1.getLado1());
        System.out.println("r1 lado 2 = " + r1.getLado2());
        r1.setLado2(6.3);
        System.out.println("Ahora r1 lado 2 = " + r1.getLado2());
        System.out.println("r1 color = " + r1.getColor());
        System.out.println("r1 grosor de linea = " + r1.getGrosorLinea());
        System.out.println("r1 area = " + r1.area());
        System.out.println("");
        System.out.println("r2 lado 1 = " + r2.getLado1());
        System.out.println("r2 lado 2 = " + r2.getLado2());
        System.out.println("r2 color = " + r2.getColor());
        System.out.println("r2 grosor de linea = " + r2.getGrosorLinea());
        System.out.println("r2 area = " + r2.area());
        System.out.println("");
        System.out.println("cu1 lado = " + cu1.getLado());
        System.out.println("cu1 color = " + cu1.getColor());
        System.out.println("cu1 grosor de linea = " + cu1.getGrosorLinea());
        System.out.println("cu1 area = " + cu1.area());
    }
}