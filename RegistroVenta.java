/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa;

/**
 *
 * @author ss-supernova
 */
public class RegistroVenta {

    private double venta1;
    private double venta2;
    private double venta3;
    
    //Metodo constructor
    public RegistroVenta(double xVenta1, double xVenta2, double xVenta3 ){
        this.venta1 = xVenta1;
        this.venta2 = xVenta2;
        this.venta3 = xVenta3;
    }
    
    public double total(){
        return (this.venta1 + this.venta2 + this.venta3);
    }
    
    public double promedio(){
        return (this.total()/3);
    }
    
    public double mayor(){
        double xmayor;
        xmayor = this.venta1;
        if(xmayor < this.venta2 ) {
            xmayor = this.venta2;
        }
        if(xmayor < this.venta3){
            xmayor = this.venta3;
        }
        return(xmayor);
    }
    
    public double menor() {
        double xmenor = this.mayor(); 
        
        if(xmenor > this.venta1){
            xmenor = this.venta1;
        }
        
        if (xmenor > this.venta2){
            xmenor = this.venta2;
        }
        
        if (xmenor > this.venta2){
            xmenor = this.venta2;
        }
        return (xmenor);
    }
    

    
}
