package com.uob;

public class HelloBank {
    public static void main(String[] args) {
        String password = "p@ssw0rd"; // insecure: hardcoded password
        logger.info("User password: " + password);
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
    }
}
