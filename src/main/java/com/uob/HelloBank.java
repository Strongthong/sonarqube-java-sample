package com.uob;

public class HelloBank {
    public static void main(String[] args) {
        String password = "p@ssw0rd"; // insecure: hardcoded password
        Properties p = new Properties();
        { p.setProperty("db.password", "1234"); }
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
    }
}
