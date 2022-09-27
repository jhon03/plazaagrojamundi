package com.edu.usbcali.plazaagrojamundi.Domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tipo_identificacion")
public class TipoIdentificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tiide")
    private int idTiid;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_creacion")
    private String fechaCreacion;

    @Column(name = "fecha_modificacion")
    private String fechaModificacion;

    @Column(name = "estado")
    private String estado;



    //llaves foraneas
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoIdentificacion")
    private List<Agricultor> agricultores = new ArrayList<>();


}
