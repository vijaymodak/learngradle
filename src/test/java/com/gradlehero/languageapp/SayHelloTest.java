package com.gradlehero.languageapp;

import com.gradlehero.languageapp.SayHello;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class SayHelloTest {
    @Test
    public void testSayHello() throws IOException {
        SayHello.main(new String[]{"en"});
    }
}
