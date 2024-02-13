package com.example.demo;

import com.example.demo.controllers.LessTrash;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class LessTrashTest {
    @Autowired
    private LessTrash shootMe;
    @Test
    public void whyAmITestingThis() {
        Assert.notNull(shootMe._service, "bruh");
    }
}
