package com.utn.TpApiRest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Domicilio")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Domicilio extends Base {


    private String calle;


    private int numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}
