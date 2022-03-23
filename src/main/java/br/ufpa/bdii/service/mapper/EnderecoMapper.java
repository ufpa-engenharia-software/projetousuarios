package br.ufpa.bdii.service.mapper;

import br.ufpa.bdii.domain.Endereco;
import br.ufpa.bdii.service.dto.EnderecoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Endereco} and its DTO {@link EnderecoDTO}.
 */
@Mapper(componentModel = "spring", uses = { UsuarioMapper.class })
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco> {
    @Mapping(target = "usuario", source = "usuario", qualifiedByName = "id")
    EnderecoDTO toDto(Endereco s);
}
