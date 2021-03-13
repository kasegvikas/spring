package com.kasegvikas.challenge.codechallenge.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class PrimeNumberFinderServiceImplTest {

    @Autowired
    public PrimeNumberService primeNumberService;

    @Test
    public void testFindPrimeNos(){
        assertThat(primeNumberService.findPrimNumbersTill(10))
                .hasSameElementsAs(IntStream.of(2, 3, 5, 7).boxed().collect(Collectors.toList()));
        assertThat(primeNumberService.findPrimNumbersTill(50))
                .hasSameElementsAs(IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47).boxed().collect(Collectors.toList()));
        assertThat(primeNumberService.findPrimNumbersTill(100))
                .hasSameElementsAs(IntStream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97).boxed().collect(Collectors.toList()));
    }
}
