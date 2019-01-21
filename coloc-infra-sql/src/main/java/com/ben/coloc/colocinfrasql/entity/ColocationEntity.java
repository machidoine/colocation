package com.ben.coloc.colocinfrasql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name = "Colocation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ColocationEntity {
    @Id
    private String id;

    @Version
    private Integer techLockVersion = 0;

    private String name;
}
