package com.example.momenali.javajokelib;

import java.util.Random;

public class Jokes {
    private static final String [] Jokes = new String[]{
        "Police officer talks to a driver: Your tail light is broken, your tires must be exchanged" +
                " and your bumper hangs halfway down. That will be 300 dollars.\n" +
                " -\n" +
         "Driver: Alright, go ahead. They want twice as much as that at the garage.",


         "Why did the physics teacher break up with the biology teacher? There was no chemistry.",


            "Q. Why do the French like to eat snails so much?\n" +
                    "-\n" +
                    "A. They can't stand fast food.",

            "Husband:  Oh the weather is lovely today. Shall we go out for a quick jog? \n" +
                    "-\n" +
                    "Wife:  Hahaha, I love the way you pronounce ‘Shall we go out and have a cake'!",


            "A guest calls the waiter and complains,  How come there are no chairs at our table?!\n" +
                    "-\n" +
                    "The waiter shrugs,  I'm sorry but you only booked one table…",


            "Optimist: The glass is half full.\n" +
                    "\n" +
                    "Pessimist: The glass is half empty.\n" +
                    "\n" +
                    "Mother: Why didn't you use a coaster!",


            "I asked my daughter if she'd seen my newspaper. She told me that newspapers are old school. " +
                    "She said that people use tablets nowadays and handed me her iPad. The fly didn't stand a chance.",


            "I've been really depressed lately. A friend told me I should go to the petting zoo perhaps, to cheer up. \n" +
                    "-\n" +
                    "I went today, but not one person would stroke me.",


            "I forgot my cell phone when I went to the toilet yesterday. We have 245 tiles.",


            "She: I have a doctor's appointment today but I really don't want to go… \n" +
                    "-\n" +
                    "He: Just call in sick then.",


            "A recent scientific study showed that out of 2,293,618,367 people, 94% are too lazy to actually read that number.",


            "A recent scientific study showed that out of 2,293,618,367 people, 94% are too lazy to actually read that number.",


            "When I look at chocolate, I hear two voices in my head. \n" +
                    "\n" +
                    "The first one says:  You need to eat that chocolate. \n" +
                    "\n" +
                    "The other voice goes:  You heard. Eat the chocolate."

    };
    public static String getJoke(){
        int length = Jokes.length;
        Random r = new Random();
        return Jokes[r.nextInt(length)];
    }

    public static int getNumberOfJokes(){
        return Jokes.length;
    }
    public static String getJokeNumber(int num){
        if (num<Jokes.length)
            return Jokes[num];

        return null;
    }

}

