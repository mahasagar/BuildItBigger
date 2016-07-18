package com.example;

import java.util.Random;

public class JokeLib {
    private static Random random = new Random();
    private static String[] jokes = new String[] {
            "As long as there are tests, there will be prayer in schools.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "A day without sunshine is like, night.",
            "Born free, taxed to death.",
            "For Sale: Parachute. Only used once, never opened.",
            "What is faster Hot or cold? Hot, because you can catch a cold.",
            "Love may be blind, but marriage is a real eye-opener.",
            "girl : what..!i fail..!that also in english..! unpossible..!"
    };
    public static String getJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}
