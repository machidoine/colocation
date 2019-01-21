package com.ben.coloc.colocdomain.repository;

import com.ben.coloc.colocdomain.domain.Colocation;

import java.util.List;

public interface ColocationRepository {
    Colocation findColocation(String id);
    List<Colocation> findAllColocations();
}
