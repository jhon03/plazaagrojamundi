package com.edu.usbcali.plazaagrojamundi.Domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private float precio;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "estado")
    private String estado;

    @Column(name = "categoria")
    private String categoria;


    //llaves foraneas
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_agricultor")
    private Agricultor agricultor;

}
