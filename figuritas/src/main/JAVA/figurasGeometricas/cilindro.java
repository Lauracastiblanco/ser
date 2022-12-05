package figurasGeometricas;

import java.util.Scanner;

public abstract class cilindro extends figura{

    private double radio, altura, area, perimetro;
    public cilindro(){

    }
    public cilindro(double radio, double altura, double perimetro, double area){
        this.radio = radio;
        this.altura = altura; 
        this.perimetro = perimetro;
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
    Scanner lector = new Scanner(System.in);



    public double calcularPerimetro(double radio, double altura, double perimetro){
        System.out.println("Ingresa el radio: ");
        radio = lector.nextDouble();
        System.out.println("Ingresa la altura");
        altura = lector.nextDouble();
        perimetro = (2 * 3.1416* radio) + altura;
        return perimetro;
    }
    public double calcularArea(double radio, double altura, double area){
        System.out.println("Ingresa el radio: ");
        radio = lector.nextDouble();
        System.out.println("Ingresa la altura:  ");
        altura = lector.nextDouble();  
        area = 2 * 3.1416 * radio * (radio + altura); 
        return area;
    }
}

