package org;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingShould {

    @Test
    public void say_hello() {
        assertEquals("Hello", Greeting.sayHello());
    }
}
