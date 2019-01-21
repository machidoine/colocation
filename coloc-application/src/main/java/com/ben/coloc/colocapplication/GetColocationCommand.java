package com.ben.coloc.colocapplication;

import com.ben.coloc.colocdomain.domain.Colocation;
import com.ben.coloc.colocdomain.repository.ColocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetColocationCommand  {

    @Autowired
    private ColocationRepository colocRepo;

    public Colocation process(String id) {
        return colocRepo.findColocation(id);
    }
}
