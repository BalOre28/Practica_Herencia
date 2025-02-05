/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado.practica;

/**
 *
 * @author Balto
 */
public class EmpleadoPorHora extends EmpleadoPractica {
 private double tarifaPorHora;
    private int horasTrabajadas;

    //constructor de la hija con la herencia de la clase padre
    public EmpleadoPorHora(String name, int id, double tarifaPorHora, int horasTrabajadas) {
        super(name, id);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    
    public double calcularSalario() {
        return tarifaPorHora * horasTrabajadas;
    }


    public double calcularBonificacion() {
        return 0.05 * calcularSalario();
    }    
}
