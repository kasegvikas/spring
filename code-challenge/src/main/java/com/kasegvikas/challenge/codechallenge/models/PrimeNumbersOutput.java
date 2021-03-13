package com.kasegvikas.challenge.codechallenge.models;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class PrimeNumbersOutput {
    public Integer initial;
    public Integer[] primes;
}
