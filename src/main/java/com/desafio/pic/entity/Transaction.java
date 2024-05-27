package com.desafio.pic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@AllArgsConstructor
@Setter
@Getter
@Entity
public class Transaction {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String payer;

    private String payee;

    private Long value;

}
