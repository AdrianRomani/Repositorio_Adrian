
package s01_s2;
import java.util.Scanner;
public class fórmula {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double prom;
        int n1,n2,n3;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        n1=entrada.nextInt();
        n2=entrada.nextInt();
        n3=entrada.nextInt();
        
        prom=(n1+n2+n3)/3;
        System.out.println("El promedio es: "+prom);
        
    }
    
}
