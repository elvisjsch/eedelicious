/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Elviscocho
 */
public class MEgreso {
    private int id_egr;
    private int id_tegr;
    private String nombre_egr;
    private double monto_egr;
    private LocalDate fecha_egr;

    public MEgreso() {
    }

    public MEgreso(int id_egr, int id_tegr, String nombre_egr, double monto_egr, LocalDate fecha_egr) {
        this.id_egr = id_egr;
        this.id_tegr = id_tegr;
        this.nombre_egr = nombre_egr;
        this.monto_egr = monto_egr;
        this.fecha_egr = fecha_egr;
    }
    
    public MEgreso(int id_tegr, String nombre_egr, double monto_egr, LocalDate fecha_egr) {
        this.id_tegr = id_tegr;
        this.nombre_egr = nombre_egr;
        this.monto_egr = monto_egr;
        this.fecha_egr = fecha_egr;
    }

    public int getId_egr() {
        return id_egr;
    }

    public void setId_egr(int id_egr) {
        this.id_egr = id_egr;
    }

    public int getId_tegr() {
        return id_tegr;
    }

    public void setId_tegr(int id_tegr) {
        this.id_tegr = id_tegr;
    }

    public String getNombre_egr() {
        return nombre_egr;
    }

    public void setNombre_egr(String nombre_egr) {
        this.nombre_egr = nombre_egr;
    }

    public double getMonto_egr() {
        return monto_egr;
    }

    public void setMonto_egr(double monto_egr) {
        this.monto_egr = monto_egr;
    }

    public LocalDate getFecha_egr() {
        return fecha_egr;
    }

    public void setFecha_egr(LocalDate fecha_egr) {
        this.fecha_egr = fecha_egr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_egr, id_tegr, nombre_egr, monto_egr, fecha_egr);
    }  
}