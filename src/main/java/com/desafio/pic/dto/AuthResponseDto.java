package com.desafio.pic.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class AuthResponseDto {

    private String status;

    private Map<String, Object> data;

}
