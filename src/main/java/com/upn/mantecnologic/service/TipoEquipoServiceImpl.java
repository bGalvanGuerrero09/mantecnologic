package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.TipoEquipoDTO;
import com.upn.mantecnologic.mappers.EquipoMapper;
import com.upn.mantecnologic.mappers.TipoEquipoMapper;
import com.upn.mantecnologic.repository.EquipoRepository;
import com.upn.mantecnologic.repository.TipoEquipoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoEquipoServiceImpl implements TipoEquipoService {

    private final TipoEquipoRepository tipoequipoRepository;

    public TipoEquipoServiceImpl(TipoEquipoRepository tipoequipoRepository) {
        this.tipoequipoRepository = tipoequipoRepository;
    }

    @Override
    public List<TipoEquipoDTO> listarTipoEquipo() {
        return TipoEquipoMapper.instancia.listaTipoEquipoAListaTipoEquipoDTO(tipoequipoRepository.findAll());
    }
}
