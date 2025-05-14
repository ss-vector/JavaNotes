
package programa;


public class PrintRegistroVentaGetSet {
    
    public static void main(String args[]){
    RegistroVentaGetSet objVenta = new RegistroVentaGetSet();
    
    objVenta.setVenta1(100);
    objVenta.setVenta2(300);
    objVenta.setVenta3(700);
    
    
    System.out.println("Venta 1: "+ objVenta.getVenta1());
    System.out.println("----------");
    System.out.println("El total de ventas es: "+ objVenta.promedio());
    System.out.println("----------");
    System.out.println("El total de ventas es: "+ objVenta.mayor());
    }
}
