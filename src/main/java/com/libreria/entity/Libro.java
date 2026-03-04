package com.libreria.entity;

import jakarta.persistence.*;

@Entity
public class Libro
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
