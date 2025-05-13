
package programa;
import java.util.Scanner;
// Metodo Get Set
public class RegistroCompras {

    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    private Scanner sc = new Scanner(System.in);
      
    public void setCompras(){
        System.out.println("Ingrese el valor de la compra 1: ");
        this.compra1 = this.sc.nextDouble();
        
        System.out.println("Ingrese el valor de la compra 2: ");
        this.compra2 = this.sc.nextDouble();
        
        System.out.println("Ingrese el valor de la compra 3: ");
        this.compra3 = this.sc.nextDouble();
        
        System.out.println("Ingrese el valor de la compra 4: ");
        this.compra4 = this.sc.nextDouble();
    }
    
    public double getCompra1() {
        return this.compra1;
    }
    
    public double getCompra2() {
        return this.compra2;
    }

    public double getCompra3() {
        return this.compra3;
    }

    public double getCompra4() {
        return this.compra4;
    }

    // Operations: total, promedio, mayor, menor
    public double total(){
        return (this.compra1 + this.compra2 + this.compra3 + this.compra4);
    }
    
    public double promedio(){
        return (this.total()/3);
    }
    
    public double mayor(){
        double xmayor;
        xmayor = this.compra1;
        if(xmayor < this.compra2 ) {
            xmayor = this.compra2;
        }
        if(xmayor < this.compra3){
            xmayor = this.compra3;
        }
        if(xmayor < this.compra4){
            xmayor = this.compra4;
        }
        return(xmayor);
    }
    
    public double menor() {
        double xmenor = this.mayor(); 
        
        if(xmenor > this.compra1){
            xmenor = this.compra1;
        }
        
        if (xmenor > this.compra2){
            xmenor = this.compra2;
        }
        
        if (xmenor > this.compra3){
            xmenor = this.compra3;
        }
        
        if (xmenor > this.compra4){
            xmenor = this.compra4;
        }
        return (xmenor);
    }
}
