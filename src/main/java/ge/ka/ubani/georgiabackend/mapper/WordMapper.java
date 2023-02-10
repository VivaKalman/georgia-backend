package ge.ka.ubani.georgiabackend.mapper;

import ge.ka.ubani.georgiabackend.dto.WordAddingRequestDto;
import ge.ka.ubani.georgiabackend.dto.WordDto;
import ge.ka.ubani.georgiabackend.entity.RootWord;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WordMapper {


    @Mapping(target = "refWord", ignore = true)
    @Mapping(target = "noun.id", ignore = true)
    @Mapping(target = "adjective.id", ignore = true)
    @Mapping(target = "verb.id", ignore = true)
    RootWord requestToEntity(WordAddingRequestDto dto);

    WordDto entityToDto(RootWord entity);

}
