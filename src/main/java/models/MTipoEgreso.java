/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.Objects;

/**
 *
 * @author Elviscocho
 */



public class MTipoEgreso {
    private Integer id_tegr;
    private String nombre_tegr;

    public MTipoEgreso() {
    }

    public MTipoEgreso(Integer id_tegr, String nombre_tegr) {
        this.id_tegr = id_tegr;
        this.nombre_tegr = nombre_tegr;
    }
    
    public MTipoEgreso(String nombre_tegr) {
        this.nombre_tegr = nombre_tegr;
    }

    public Integer getId_tegr() {
        return id_tegr;
    }

    public void setId_tegr(Integer id_tegr) {
        this.id_tegr = id_tegr;
    }

    public String getNombre_tegr() {
        return nombre_tegr;
    }

    public void setNombre_tegr(String nombre_tegr) {
        this.nombre_tegr = nombre_tegr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_tegr, nombre_tegr);
    }
}
