/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.model;

/**
 *
 * @author s.corderoc
 */
public class VehiculoCamioneta extends Vehiculo {

    private String traccion;

    @Override
    public double costoMatricula() {
        if (getPrecio() > 30000) {
            return 1500;
        }
        if (getAnioFabricacion() >= 2023 && getCilindraje() > 800) {
            return 400;
        }
        return 180;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

}
