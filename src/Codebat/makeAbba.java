package Codebat;
//makeAbba("Hi", "Bye") → "HiByeByeHi"
//makeAbba("Yo", "Alice") → "YoAliceAliceYo"
//makeAbba("What", "Up") → "WhatUpUpWhat"
public class makeAbba {

    public static void main(String[] args) {
    makeAbba combined = new makeAbba();
        System.out.println(combined.makeAbba("Hi", "Bye"));
    }

    public String makeAbba(String a, String b) {
    return a + b + b + a;
    }
}

//Given two strings, a and b,
// return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

