package com.ben.coloc.colocexpo.mapper;

import com.ben.coloc.colocdomain.domain.Colocation;
import com.ben.coloc.colocexpo.dto.ColocationDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class DtoMapper  extends ModelMapper {
    public ColocationDTO toDTO(Colocation colocation) {
        return this.map(colocation, ColocationDTO.class);
    }
}
