package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class trowdice {

    public int first_one(){
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        return randomNum;


    }




}
