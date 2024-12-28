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
public class MTipoIngreso {
    private Integer id_ting;
    private String nombre_ting;

    public MTipoIngreso() {
    }

    public MTipoIngreso(Integer id_ting, String nombre_ting) {
        this.id_ting = id_ting;
        this.nombre_ting = nombre_ting;
    }
    
    public MTipoIngreso(String nombre_ting) {
        this.nombre_ting = nombre_ting;
    }

    public Integer getId_ting() {
        return id_ting;
    }

    public String getNombre_ting() {
        return nombre_ting;
    }

    public void setId_ting(Integer id_ting) {
        this.id_ting = id_ting;
    }

    public void setNombre_ting(String nombre_ting) {
        this.nombre_ting = nombre_ting;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ting, nombre_ting);
    }
}
