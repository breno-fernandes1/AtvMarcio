package com.example.AtvMarcio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    // Converte Celsius para Fahrenheit
    @GetMapping("/celsiusParaFahrenheit")
    public double celsiusParaFahrenheit(@RequestParam("grau") double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Converte Fahrenheit para Celsius
    @GetMapping("/fahrenheitParaCelsius")
    public double fahrenheitParaCelsius(@RequestParam("grau") double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
