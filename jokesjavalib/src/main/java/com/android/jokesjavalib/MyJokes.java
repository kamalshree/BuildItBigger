package com.android.jokesjavalib;

import java.util.List;
import java.util.Random;
import static java.util.Arrays.asList;

public class MyJokes {

    List<String> myJokeList = asList(
           "What did the spider do on the computer? ...... Made a website! ",
            "What did the computer do at lunchtime? ...... Had a byte!  ",
            "Why did the computer keep sneezing? ......  It had a virus! ",
            "What is a computer virus? ...... A terminal illness! ",
            "Why did the computer squeak?...... Because someone stepped on it's mouse!  ",
            "Where do all the cool mice live?...... In their mousepads  ",
            "How can you tell the ocean is friendly?...... It waves ",
            "What did Mars say to Saturn?...... Give me a ring sometime ",
            "What did the big flower say to the small flower?...... What's up Bud.  ",
            "What type of songs do the planets sing?...... Nep-tunes! ",
            "How does the Easter bunny stay in shape?...... Lots of eggercise!  ",
            "Why are graveyards noisy?...... Because of all the coffin!  "
            );

    public String getMyJokeList(){
        Random random = new Random();
        String mmyRandomJokes = myJokeList.get(random.nextInt(myJokeList.size()));
        return  mmyRandomJokes;
    }
}
