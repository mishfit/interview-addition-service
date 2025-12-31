package com.interview.addition.controller;

import com.interview.addition.dto.AdditionRequest;
import com.interview.addition.dto.AdditionResponse;
import com.interview.addition.service.CalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdditionController {

    private final CalculatorService calculatorService;

    public AdditionController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/add")
    public ResponseEntity<AdditionResponse> add(@RequestBody AdditionRequest request) {
        Double result = calculatorService.add(request.getNumber1(), request.getNumber2());
        return ResponseEntity.ok(new AdditionResponse(result));
    }
}
