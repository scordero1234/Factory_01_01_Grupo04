/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.edu.ec.model;

/**
 *
 * @author grupo4
 */
public class VehiculoCamion extends Vehiculo {

    private String transmision;
    private String carga;

    @Override
    public double costoMatricula() {
        if (getPrecio() > 60000) {
            return 2500;
        }
        if (getAnioFabricacion() >= 2023) {
            return 800;
        }
        return 400;

    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

}
