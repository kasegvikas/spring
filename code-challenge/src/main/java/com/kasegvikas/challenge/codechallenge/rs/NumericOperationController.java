package com.kasegvikas.challenge.codechallenge.rs;

import com.kasegvikas.challenge.codechallenge.models.PrimeNumbersOutput;
import com.kasegvikas.challenge.codechallenge.services.PrimeNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class NumericOperationController {

    @Autowired
    private PrimeNumberService primeNumberService;

    @GetMapping("/prime/{number}")
    public ResponseEntity<PrimeNumbersOutput> getPrimes(@PathVariable("number") int number){
        List<Integer> primNumbersTill = primeNumberService.findPrimNumbersTill(number);
        return ResponseEntity.ok(buildOutPut(number, primNumbersTill));
    }

    private PrimeNumbersOutput buildOutPut(int number, List<Integer> primNumbers) {
        return PrimeNumbersOutput.builder()
                .initial(number)
                .primes(primNumbers.toArray(new Integer[0]))
                .build();
    }
}
