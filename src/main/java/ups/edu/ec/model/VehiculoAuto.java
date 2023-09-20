/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.model;

/**
 *
 * @author grupo4
 */
public class VehiculoAuto extends Vehiculo{
 private String version;
    @Override
    public double costoMatricula() {
return 800;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
    
}
