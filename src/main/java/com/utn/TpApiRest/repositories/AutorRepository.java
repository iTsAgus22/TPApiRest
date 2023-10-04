package com.utn.TpApiRest.repositories;

import com.utn.TpApiRest.entities.Autor;
import org.springframework.stereotype.Repository;


@Repository
public interface AutorRepository extends BaseRepository <Autor, Long> {
}
