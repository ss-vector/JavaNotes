
package programa;


public class RegistroComprasTest {
    
    public static void main(String args[]){
        
        RegistroCompras regCompras = new RegistroCompras();
        
        regCompras.setCompras();
        // Print solution
        System.out.println("-------");
        System.out.println("Total: "+ regCompras.total());
        System.out.println("-------");
        System.out.println("Promedio: "+ regCompras.promedio());
        System.out.println("-------");
        System.out.println("Mayor: "+ regCompras.mayor());
        System.out.println("-------");
        System.out.println("Menor: "+ regCompras.menor());
    }
}
