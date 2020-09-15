package com.bsu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @Test
    void deleteNumbers() {
        String testString1 = " 12 12 erwf323 3r 34 r 4 r4r -0-0- 2";
        assertEquals(  " erwf323 3r r r4r -0-0- ",StringProcessor.deleteNumbers(testString1));
        String testString2 = "1";
        assertEquals(  " ",StringProcessor.deleteNumbers(testString2));
        String testString3 = "908218020 grjk";
        assertEquals(  " grjk",StringProcessor.deleteNumbers(testString3));
        String testString4 = "kl,312 32.jklafd";
        assertEquals(  "kl jklafd",StringProcessor.deleteNumbers(testString4));


    }
}