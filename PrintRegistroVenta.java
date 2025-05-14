/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa;

/**
 *
 * @author ss-supernova
 */
public class PrintRegistroVenta {
    public static void main(String[] args) {
    // TODO code application logic here
    RegistroVenta objVenta = new RegistroVenta(200,300,400);
    
    System.out.println("El total de ventas es: "+ objVenta.total());
    System.out.println("----------");
    System.out.println("El total de ventas es: "+ objVenta.promedio());
    System.out.println("----------");
    System.out.println("El total de ventas es: "+ objVenta.menor());
    }
}
