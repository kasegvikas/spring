package com.kasegvikas.challenge.codechallenge.rs;

import com.kasegvikas.challenge.codechallenge.services.PrimeNumberService;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class NumericOperationControllerTest {

    @Autowired
    private NumericOperationController operationController;
    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private PrimeNumberService primeNumberService;

    @Test
    public void test() throws Exception {
        //Mockito.when(primeNumberService.findPrimNumbersTill(ArgumentMatchers.anyInt())).thenReturn(IntStream.of(1,1,1).boxed().collect(Collectors.toList()));

        mockMvc.perform(get("/prime/10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("initial", is(10)))
                .andExpect(jsonPath("primes").isArray())
                .andExpect(jsonPath("primes", hasItems(2, 3, 5, 7)));

    }
}
