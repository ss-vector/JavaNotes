package programa;


public class RegistroVentaGetSet {

    private double venta1;
    private double venta2;
    private double venta3;


    public double getVenta1() {
        return venta1;
    }

    public void setVenta1(double venta1) {
        this.venta1 = venta1;
    }

    public double getVenta2() {
        return venta2;
    }

    public void setVenta2(double venta2) {
        this.venta2 = venta2;
    }

    public double getVenta3() {
        return venta3;
    }

    public void setVenta3(double venta3) {
        this.venta3 = venta3;
    }
    
    // Método total()
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
}
