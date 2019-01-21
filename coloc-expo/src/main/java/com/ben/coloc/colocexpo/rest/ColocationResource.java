package com.ben.coloc.colocexpo.rest;

import com.ben.coloc.colocapplication.GetColocationCommand;
import com.ben.coloc.colocdomain.repository.ColocationRepository;
import com.ben.coloc.colocexpo.dto.ColocationDTO;
import com.ben.coloc.colocexpo.mapper.DtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/colocation")
public class ColocationResource {

    @Autowired
    private DtoMapper mapper;

    @Autowired
    private GetColocationCommand getColocCommand;

    @GetMapping(path = "/{colocationId}")
    public ColocationDTO getColocation(@PathVariable String colocationId) {
        return mapper.toDTO(getColocCommand.process(colocationId));
    }
}
