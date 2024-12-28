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
public class MPedido {
    private Integer id_pd;
    private String nombre_cl;
    private Double monto_pd;
    private String fecha_pd;
    private String fechac_pd;
    private String estado_pd;

    public MPedido() {
    }

    public MPedido(Integer id_pd, String nombre_cl, Double monto_pd, String fecha_pd, String fechac_pd, String estado_pd) {
        this.id_pd = id_pd;
        this.nombre_cl = nombre_cl;
        this.monto_pd = monto_pd;
        this.fecha_pd = fecha_pd;
        this.fechac_pd = fechac_pd;
        this.estado_pd = estado_pd;
    }
    
    public MPedido(String nombre_cl, Double monto_pd, String fecha_pd, String fechac_pd, String estado_pd) {
        this.nombre_cl = nombre_cl;
        this.monto_pd = monto_pd;
        this.fecha_pd = fecha_pd;
        this.fechac_pd = fechac_pd;
        this.estado_pd = estado_pd;
    }

    public Integer getId_pd() {
        return id_pd;
    }

    public String getNombre_cl() {
        return nombre_cl;
    }

    public Double getMonto_pd() {
        return monto_pd;
    }

    public String getFecha_pd() {
        return fecha_pd;
    }

    public String getFechac_pd() {
        return fechac_pd;
    }

    public String getEstado_pd() {
        return estado_pd;
    }

    public void setId_pd(Integer id_pd) {
        this.id_pd = id_pd;
    }

    public void setNombre_cl(String nombre_cl) {
        this.nombre_cl = nombre_cl;
    }

    public void setMonto_pd(Double monto_pd) {
        this.monto_pd = monto_pd;
    }

    public void setFecha_pd(String fecha_pd) {
        this.fecha_pd = fecha_pd;
    }

    public void setFechac_pd(String fechac_pd) {
        this.fechac_pd = fechac_pd;
    }

    public void setEstado_pd(String estado_pd) {
        this.estado_pd = estado_pd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_pd, nombre_cl, monto_pd, fecha_pd, fechac_pd, estado_pd);
    }
    
}
