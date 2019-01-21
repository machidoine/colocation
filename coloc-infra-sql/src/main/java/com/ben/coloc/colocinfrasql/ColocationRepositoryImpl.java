package com.ben.coloc.colocinfrasql;

import com.ben.coloc.colocdomain.domain.Colocation;
import com.ben.coloc.colocdomain.repository.ColocationRepository;
import com.ben.coloc.colocinfrasql.jpa.ColocationJpaRepository;
import com.ben.coloc.colocinfrasql.mapper.EntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ColocationRepositoryImpl implements ColocationRepository {
    @Autowired
    private ColocationJpaRepository jpaRepo;

    @Autowired
    private EntityMapper mapper;

    @Override
    public Colocation findColocation(String id) {
        return jpaRepo.findById(id)
                .map(mapper::toColocation)
                .orElseThrow(() -> new ColocationNotFoundException(id));
    }

    @Override
    public List<Colocation> findAllColocations() {
        return jpaRepo.findAll().stream()
                .map(mapper::toColocation)
                .collect(Collectors.toList());
    }

    @AllArgsConstructor
    public class ColocationNotFoundException extends RuntimeException {
        private String id;

        @Override
        public String getMessage() {
            return "Colocation '" + id +"' not found.";
        }
    }
}
