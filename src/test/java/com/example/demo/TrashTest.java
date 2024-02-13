package com.example.demo;

import com.example.demo.controllers.Trash;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class TrashTest {
    @Test
    void whyAmITestingThis() {
        Trash t = new Trash();

        Assert.notNull(t._usefulService
                , "xdd");
    }
}
