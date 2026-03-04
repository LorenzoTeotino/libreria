package com.libreria.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Autore
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
