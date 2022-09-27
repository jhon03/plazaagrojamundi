package com.edu.usbcali.plazaagrojamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "agricultor")
public class Agricultor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agricultor")
    private int idAgricultor;

    @Column(name = "numero_identificacion")
    private String numeroIdentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String email;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "region")
    private String region;

    @Column(name = "vereda")
    private String vereda;

    @Column(name = "actividad_agricultor")
    private String actividadAgricultor;

    //llave foranea
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tiide")
    private TipoIdentificacion tipoIdentificacion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "agricultor")
    private List<Producto> productos;

}
