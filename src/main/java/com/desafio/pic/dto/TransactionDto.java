package com.desafio.pic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDto {

    private Long payer;

    private Long payee;

    private Long value;

}
