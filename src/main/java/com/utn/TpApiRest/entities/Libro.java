package com.utn.TpApiRest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Libro")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro extends Base {


    private Date fecha;


    private String genero;


    private int paginas;


    private String titulo;

    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
