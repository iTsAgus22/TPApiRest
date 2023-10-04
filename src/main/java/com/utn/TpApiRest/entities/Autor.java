package com.utn.TpApiRest.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Autor")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autor extends Base {


    private String apellido;


    private String nombre;

    @Column(name = "Biografia", length = 1500)
    private String biografia;
}
