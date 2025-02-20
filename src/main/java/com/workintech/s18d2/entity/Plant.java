package com.workintech.s18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@MappedSuperclass
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // @Size kaldırıldı

    @Column(name = "name")
    @NotNull(message = "name null olamaz!")
    @Size(min = 3, max = 45, message = "name 3-45 karakter arasında yazılmalı!")
    private String name;

    @Column(name = "price")
    @DecimalMin("10")
    private Double price;
}
