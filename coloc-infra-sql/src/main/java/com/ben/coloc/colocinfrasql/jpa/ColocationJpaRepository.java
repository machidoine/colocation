package com.ben.coloc.colocinfrasql.jpa;

import com.ben.coloc.colocinfrasql.entity.ColocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColocationJpaRepository extends JpaRepository<ColocationEntity, String> {

}
