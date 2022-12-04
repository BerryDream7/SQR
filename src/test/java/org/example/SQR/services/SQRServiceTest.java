package org.example.SQR.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calcTestWhenFewNumbersFinded() {
        SQRService service = new SQRService();

        int actual = service.calc(250, 700);
        int expected = 11;

        Assertions.assertEquals(expected, actual);
    }

}