package com.example.ise_app.test;


import com.example.ise_app.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {
    @Test
    void hello_returnsGreeting() {
        HelloController controller = new HelloController();
        String result = controller.hello();

        assertNotNull(result);
        assertTrue(result.contains("Hello"));
    }
}

