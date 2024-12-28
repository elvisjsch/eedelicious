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
public class MDetallesPedido {
    private Integer id_pdd;
    private Integer id_pd;
    private Integer id_prod;
    private Integer cantidad_prod;

    public MDetallesPedido() {
    }

    public MDetallesPedido(Integer id_pdd, Integer id_pd, Integer id_prod, Integer cantidad_prod) {
        this.id_pdd = id_pdd;
        this.id_pd = id_pd;
        this.id_prod = id_prod;
        this.cantidad_prod = cantidad_prod;
    }

    public Integer getId_pdd() {
        return id_pdd;
    }

    public Integer getId_pd() {
        return id_pd;
    }

    public Integer getId_prod() {
        return id_prod;
    }

    public Integer getCantidad_prod() {
        return cantidad_prod;
    }

    public void setId_pdd(Integer id_pdd) {
        this.id_pdd = id_pdd;
    }

    public void setId_pd(Integer id_pd) {
        this.id_pd = id_pd;
    }

    public void setId_prod(Integer id_prod) {
        this.id_prod = id_prod;
    }

    public void setCantidad_prod(Integer cantidad_prod) {
        this.cantidad_prod = cantidad_prod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_pdd, id_pd, id_prod, cantidad_prod);
    }
}
