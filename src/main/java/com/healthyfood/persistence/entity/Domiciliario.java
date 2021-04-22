package com.healthyfood.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "domiciliarios")
public class Domiciliario extends Usuario{

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "entregas_por_dia")
    private Integer entregasPorDia;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getEntregasPorDia() {
        return entregasPorDia;
    }

    public void setEntregasPorDia(Integer entregasPorDia) {
        this.entregasPorDia = entregasPorDia;
    }
}
