package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@Data
@Entity
@Table(name = "vegetable", schema = "fsweb")
public class Vegetable extends Plant{

    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;

}
