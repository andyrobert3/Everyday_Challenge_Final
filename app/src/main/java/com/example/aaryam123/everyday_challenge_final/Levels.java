package com.example.aaryam123.everyday_challenge_final;

/**
 * Created by alexa on 1/27/2018.
 */

public class Levels {
    public final static int TOTAL_LEVELS = 9;

    private int currLevel;
    private int maxLevel; // personal max level
    // set number of challenges for levelChallenges array
    private int levelChallenges[] = {4,5,6,7,8,9,10,11,12};
    private int doneActivites[] ={0};

    Levels () {
        currLevel = 1;
        maxLevel = 1;
    }

    // call when one is done with challenge at a level (1, 2, ... )
    public void doneChallenge(int level) {
        if (level > TOTAL_LEVELS)
            throw new IllegalArgumentException("Level accessed is too high");

        if (doneActivites[level-1] >= levelChallenges[level-1]) {// exceed or equal to number of challenges at level
            maxLevel = level + 1;
            currLevel = level + 1;
        } else {
            maxLevel = level;
            currLevel = level;
        }

        doneActivites[maxLevel-1]++;
    }

    public int getCurrLevel() {
        return currLevel;
    }

}
