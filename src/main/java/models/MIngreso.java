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
public class MIngreso {
    
    private Integer id_ing;
    private String id_ting;
    private String desc_ing;
    private Double monto_ing;
    private LocalDate fecha_ing;

    public MIngreso(Integer id_ing, String id_ting, String desc_ing, Double monto_ing, LocalDate fecha_ing) {
        this.id_ing = id_ing;
        this.id_ting = id_ting;
        this.desc_ing = desc_ing;
        this.monto_ing = monto_ing;
        this.fecha_ing = fecha_ing;
    }

    public MIngreso(String id_ting, String desc_ing, Double monto_ing, LocalDate fecha_ing) {
        this.id_ting = id_ting;
        this.desc_ing = desc_ing;
        this.monto_ing = monto_ing;
        this.fecha_ing = fecha_ing;
    }
    
    public Integer getId_ing() {
        return id_ing;
    }

    public void setId_ing(Integer id_ing) {
        this.id_ing = id_ing;
    }

    public String getId_ting() {
        return id_ting;
    }

    public void setId_ting(String id_ting) {
        this.id_ting = id_ting;
    }

    public String getDesc_ing() {
        return desc_ing;
    }

    public void setDesc_ing(String desc_ing) {
        this.desc_ing = desc_ing;
    }

    public Double getMonto_ing() {
        return monto_ing;
    }

    public void setMonto_ing(Double monto_ing) {
        this.monto_ing = monto_ing;
    }

    public LocalDate getFecha_ing() {
        return fecha_ing;
    }

    public void setFecha_ing(LocalDate fecha_ing) {
        this.fecha_ing = fecha_ing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ing, id_ting, desc_ing, monto_ing, fecha_ing);
    }
}
