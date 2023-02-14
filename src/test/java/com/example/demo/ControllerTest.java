package com.example.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ControllerTest {
    @LocalServerPort
    private  int port;

    @Test
    public void Test_Get_Coucou(){
        String result = new RestTemplate()
                .getForObject("http://localhost:" + port + "/coucou",
                        String.class);
        Assertions.assertFalse(result.contains("toto"));

    }
}
