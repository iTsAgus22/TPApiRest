package com.utn.TpApiRest.services;

import com.utn.TpApiRest.entities.Localidad;
import com.utn.TpApiRest.repositories.BaseRepository;
import com.utn.TpApiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl <Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepositoryRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepositoryRepository) {
        super(baseRepository);
        this.localidadRepositoryRepository = localidadRepositoryRepository;
    }
}
