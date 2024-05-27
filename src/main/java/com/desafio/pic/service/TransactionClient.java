package com.desafio.pic.service;

import com.desafio.pic.dto.AuthResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "authorize", url = "https://util.devi.tools/api/v2 ")
public interface TransactionClient {

    @RequestMapping(method = RequestMethod.GET, value = "/authorize")
    AuthResponseDto getResponse();
}
