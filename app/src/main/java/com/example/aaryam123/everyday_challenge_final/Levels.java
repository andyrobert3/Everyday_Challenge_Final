package com.example.aaryam123.everyday_challenge_final;

import java.io.IOException;

/**
 * Created by alexa on 1/27/2018.
 */

public class Levels {
    public final static int MAX_LEVEL = 9;

    private int currLevel;
    // set number of challenges for levelChallenges array
    private int levelChallenges[] = {4,5,6,7,8,9,10,11,12};
    private int doneActivites[] ={0};

    Levels () {
        currLevel = 1;
    }

    // call when one is done with challenge at a level (1, 2, ... )
    public void doneChallenge(int level) {
        if (level > MAX_LEVEL)
            throw new IllegalArgumentException("Level accessed is too high");

        if (doneActivites[level-1] >= levelChallenges[level-1])
            currLevel = level+1;
        else
            currLevel = level;

        doneActivites[currLevel-1]++;
    }

    public int getCurrLevel() {
        return currLevel;
    }
}
