package com.upn.mantecnologic.mappers;

import com.upn.mantecnologic.dtos.SedeClienteCreateDTO;
import com.upn.mantecnologic.dtos.SedeClienteDTO;
import com.upn.mantecnologic.dtos.SedeClienteUpdateDTO;
import com.upn.mantecnologic.model.SedeCliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SedeClienteMapper {
    SedeClienteMapper instancia = Mappers.getMapper(SedeClienteMapper.class);

    SedeClienteDTO sedeClienteASedeClienteDTO(SedeCliente sedeCliente);
    SedeCliente sedeClienteDTOASedeCliente(SedeClienteDTO sedeClienteDTO);
    SedeCliente sedeClienteCreateDTOToSedeCliente(SedeClienteCreateDTO sedeClienteCreateDTO);
    SedeCliente sedeClienteUpdateDTOToSedeCliente(SedeClienteUpdateDTO sedeClienteUpdateDTO);

    List<SedeClienteDTO> listaSedeClienteAListaSedeClienteDTO(List<SedeCliente> listaSedeCliente);
}