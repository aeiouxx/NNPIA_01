package com.example.demo;

import com.example.demo.controllers.IdkTrash;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class IdkTrashTest {
    @Autowired
    IdkTrash blabla;
    @Test
    public void whyAmITestingThis() {
        Assert.notNull(blabla._greetingService,
                "Shoot me xd");
    }

}
