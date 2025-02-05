/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado.practica;

/**
 *
 * @author Balto
 */
public class EmpleadoPorVenta extends EmpleadoPractica{
    protected double ventasRea;
    protected double comision;

    public EmpleadoPorVenta(double ventasRea, double comision, String name, int Id) {
        super(name, Id);
        this.ventasRea = ventasRea;
        this.comision = comision;
    }

    public double calcularSalario() {
        return ventasRea * comision;
    }
       
    public double calcularBonificacion() {
        return 0.10 *calcularSalario();
    }
    
    
}
