package com.kasegvikas.challenge.codechallenge.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PrimeNumberFinderServiceImpl implements PrimeNumberService {
    @Override
    public List<Integer> findPrimNumbersTill(int maxNumber) {
        return IntStream.rangeClosed(0, maxNumber).filter(this::isPrime).boxed().collect(Collectors.toList());
    }

    private boolean isPrime(int num) {
        if (num <= 2) {
            return num == 2;
        }
        return (num % 2 != 0)
                &&
                IntStream.rangeClosed(2, (int) (Math.sqrt(num)))
                        .filter(x -> x % 2 != 0)
                        .noneMatch(n -> (num % n == 0));
    }
}
