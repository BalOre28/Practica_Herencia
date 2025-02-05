/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado.practica;

/**
 *
 * @author Balto
 */
public class EmpleadoTemporal extends EmpleadoPractica{
    private double SalaFijo;

    public EmpleadoTemporal(double SalaFijo, String name, int Id) {
        super(name, Id);
        this.SalaFijo = SalaFijo;
    }

    @Override
    public double calcularSalario() {
        return SalaFijo;
    }

    @Override
    public double calcularBonificacion() {
        return 100;
    }
    
    
    
}
