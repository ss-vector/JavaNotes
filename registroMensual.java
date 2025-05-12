
package trabajoFinal;

public class registroMensual {
    
    private double ingresoMes;
    private double otrosIngresos;
    private double gastosMes;


    
    public registroMensual( double regIngresosMes, double regOtrosIngresos, double regEgresosMes){
        
        this.ingresoMes = regIngresosMes;
        
        this.otrosIngresos = regOtrosIngresos;
        
        this.gastosMes = regEgresosMes;

    }
    
    // Determinar el ahorro mensual, semestral y anual proyectado.
    public double ahorroMensual(){
        double ahorroMes = this.ingresoMes + this.otrosIngresos - this.gastosMes;
        return (ahorroMes);
    }
    
    public double ahorroSemestral(){
        double ahorroSemestral;
        ahorroSemestral = this.ahorroMensual() * 6;
        return (ahorroSemestral);
    }
    
    public double ahorroAnual(){
        double ahorroAnual;
        ahorroAnual = this.ahorroSemestral() * 2;
        return (ahorroAnual);
    }
}
