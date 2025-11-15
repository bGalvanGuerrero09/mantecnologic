package com.upn.mantecnologic.service;

import com.upn.mantecnologic.dtos.EquipoCreateDTO;
import com.upn.mantecnologic.dtos.EquipoDTO;
import com.upn.mantecnologic.dtos.EquipoUpdateDTO;
import com.upn.mantecnologic.dtos.TipoEquipoDTO;

import java.util.List;

public interface TipoEquipoService {
    List<TipoEquipoDTO> listarTipoEquipo();
}
