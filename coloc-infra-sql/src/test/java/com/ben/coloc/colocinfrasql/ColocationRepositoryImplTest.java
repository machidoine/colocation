package com.ben.coloc.colocinfrasql;

import com.ben.coloc.colocdomain.domain.Colocation;
import com.ben.coloc.colocdomain.repository.ColocationRepository;
import com.ben.coloc.colocinfrasql.entity.ColocationEntity;
import com.ben.coloc.colocinfrasql.jpa.ColocationJpaRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class ColocationRepositoryImplTest {

    @SpringBootApplication
    static class Conf {

    }

    @Autowired
    private ColocationRepository repo;

    @Autowired
    private ColocationJpaRepository jpaRepo;

    @Test
    public void findOneColocation() {
        ColocationEntity colocEntity = new ColocationEntity();
        colocEntity.setId("1");
        colocEntity.setName("my coloc");
        jpaRepo.save(colocEntity);

        Colocation coloc = Colocation.builder().name("my coloc").build();

        assertThat(repo.findColocation("1").getName(), is(coloc.getName()));
    }

}
