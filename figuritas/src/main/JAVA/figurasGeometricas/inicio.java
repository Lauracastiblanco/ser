package figurasGeometricas;

import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        System.out.println("Bienvenido, elige la figura: ");
        opcion = lector.nextInt();
        
        switch (opcion) {
            case 1:
            hexagono hex = new hexagono(); 
            System.out.println("Ingresa el lado del hexagono: ");
            hex.setLado(lector.nextDouble());
            hex.calcularArea();
            System.out.println("Ingresa el perimetro: ");
            hex.setPerimetro(lector.nextDouble());
            System.out.println("Ingresa el apotema: ");
            hex.setApotema(lector.nextDouble());
            hex.calcularPermietro();
                break;
            default:
                break;
        }
    }
}
