package com.desafio.pic.controller;

import com.desafio.pic.dto.TransactionDto;
import com.desafio.pic.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transfer")
    private void executeTransaction(@RequestBody TransactionDto transactionDto) {



    }

}
