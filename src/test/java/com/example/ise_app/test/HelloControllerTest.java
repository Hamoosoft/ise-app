package com.example.ise_app.test;


import com.example.ise_app.controller.HelloController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello_returnsGreeting() {
        HelloController ctrl = new HelloController("Hallo ISE 🚀");
        String resp = ctrl.hello();
        assertTrue(resp.contains("Hallo ISE"));
    }
}