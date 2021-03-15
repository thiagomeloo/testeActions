package com.teste.olamundo.olamundo.model;

import javax.persistence.*;

@Entity
@Table(name="TB_PRODUTO")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

}
