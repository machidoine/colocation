package com.ben.coloc.colocinfrasql.mapper;

import com.ben.coloc.colocdomain.domain.Colocation;
import com.ben.coloc.colocinfrasql.entity.ColocationEntity;
import lombok.extern.log4j.Log4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class EntityMapper extends ModelMapper {

    public Colocation toColocation(ColocationEntity e) {
        return this.map(e, Colocation.class);
    }
}
