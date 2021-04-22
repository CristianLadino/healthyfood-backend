package com.healthyfood.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "cupones")
public class Cupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cupon")
    private Integer idCupon;

    private Boolean redimido;

    public Integer getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(Integer idCupon) {
        this.idCupon = idCupon;
    }

    public Boolean getRedimido() {
        return redimido;
    }

    public void setRedimido(Boolean redimido) {
        this.redimido = redimido;
    }
}
