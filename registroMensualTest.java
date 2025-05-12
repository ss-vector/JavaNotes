
package trabajoFinal;

import java.util.Scanner;

public class registroMensualTest {
    
    public static void main(String args[]){
        double xIngreso, xOtrosIngresos, xEgresosMes;
        
        Scanner sc = new Scanner(System.in);
        
        // Captura de datos
        System.out.println("Ingrese los ingresos que haya tenido este mes: ");
        xIngreso = sc.nextDouble();
        
        System.out.println("Ingrese otros ingresos que haya tenido este mes: ");
        xOtrosIngresos = sc.nextDouble();
        
        System.out.println("Ingrese los gastos que haya tenido este mes: ");
        xEgresosMes = sc.nextDouble();
        
        // Llamamos al objeto, que contiene las clases.
        registroMensual abc = new registroMensual(xIngreso, xOtrosIngresos, xEgresosMes);
        
        System.out.println("----------");
        System.out.println("Su Ahorro Mensual es: "+ abc.ahorroMensual());
        System.out.println("----------");
        System.out.println("Su Ahorro Semestral proyectado seria: "+ abc.ahorroSemestral());
        System.out.println("----------");
        System.out.println("Su Ahorro Aunal proyectado seria: "+ abc.ahorroAnual());


    }
}
