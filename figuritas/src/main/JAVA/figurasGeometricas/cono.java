package figurasGeometricas;
import java.util.Scanner;

public abstract class cono extends figura{

    Scanner lector = new Scanner(System.in);
    private double radio, altura, generatriz, area, perimetro;
    public cono(){

    }

    public cono(double radio, double altura, double generatriz, double area, double perimetro){
        this.radio = radio;
        this.altura = altura;
        this.generatriz = generatriz;
        this. perimetro = perimetro;
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public void calcularPerimetro(double radio, double altura){
        //System.out.println("Ingresa el radio: ");
        //radio = lector.nextDouble(); 
        //System.out.println("Ingresa la altura ");
        //altura = lector.nextDouble(); 
        perimetro = 4 * 3.1416 * radio + (radio * radio);
        System.out.println("El perimetro es " + perimetro);
    }
    public void calcularArea(double generatriz, double radio){
        //System.out.println("Ingresa el radio ");
        //radio = lector.nextDouble();
        //System.out.println("Ingresa la generatriz: ");
        //generatriz = lector.nextDouble();
        area = 3.1416 * radio *(generatriz + radio); 
        System.out.println("El area es " + area);
    }
}
