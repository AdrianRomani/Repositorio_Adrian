package prueba1;
import java.util.Scanner;
public class Prueba1 {
    
    public static void main(String[] args) {
        
        int a,b,area;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Ingrese el largo y ancho del rectangulo");
        a=entrada.nextInt();
        b=entrada.nextInt();
        
        area=a*b;
        
        System.out.println("El area del rectangulo es "+area);

    }
    
}
