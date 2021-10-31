package com.example.makeuslaugh.Jokes;

import java.util.Random;

public enum Jokes {
    A("An ant went for a swim. Elephant was in the pool. The ant asks him to come out, elephant came out and asked what happened?"+
            "Ant said I was just checking if you were wearing my underwear"),
    B("Man talking to a door and says did you like my joke and said what do you know you are a door," +
            "you just like knock knock jokes");
//    C(""),
//    D(""),
//    E("");

    private final String value;

    Jokes(String value){
        this.value = value;
    }

    public String getString(){
        return this.value;
//        return Jokes.values()[new Random().nextInt(Jokes.values().length)];
    }
}
