/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado.practica;

/**
 *
 * @author Balto
 */
public abstract class EmpleadoPractica {
public String name;
public int Id;

    public EmpleadoPractica(String name, int Id) {
        this.name = name;
        this.Id = Id;
    }
    
    public abstract double calcularSalario();
    
    public abstract double calcularBonificacion();

}
