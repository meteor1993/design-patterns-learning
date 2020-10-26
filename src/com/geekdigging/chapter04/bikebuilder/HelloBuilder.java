package com.geekdigging.chapter04.bikebuilder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/25
 * @Time: 21:07
 * @email: inwsy@hotmail.com
 * Description:
 */
public class HelloBuilder extends Builder {
    private HelloBike helloBike = new HelloBike();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.helloBike.setSequence(sequence);
    }

    @Override
    public AbstractBike getBike() {
        return this.helloBike;
    }
}
