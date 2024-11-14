package com.project.CFA.Spring;


import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage() {
        return "Welcome to the Sprint Boot Application!";
    }
}
