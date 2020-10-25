package com.geekdigging.chapter04.builder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/25
 * @Time: 21:03
 * @email: inwsy@hotmail.com
 * Description:
 */
public class MeituanBuilder extends Builder {
    private MeituanBike meituanBike = new MeituanBike();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.meituanBike.setSequence(sequence);
    }

    @Override
    public AbstractBike getBike() {
        return this.meituanBike;
    }
}
