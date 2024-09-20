package com.ecommerce.afiliados.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "marca_produto")
@SequenceGenerator(name = "seq_marca_produto",
        sequenceName = "seq_marca_produto",
        allocationSize = 1,
        initialValue = 1)
public class MarcaProduto {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id;
    private String nomeDesc;
}
