package com.example.demo;

import com.example.demo.controllers.LeastTrash;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class LeastTrashTest {
    @Autowired
    private LeastTrash xdd;
    @Test
    public void whyAmITestingThis() {

        Assert.notNull(
                xdd._greetingService,
                "bakjbkoadfbk"
        );
    }
}
