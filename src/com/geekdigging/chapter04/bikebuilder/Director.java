package com.geekdigging.chapter04.bikebuilder;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * 导演类
 *
 * @Date: 2020/10/26
 * @Time: 0:00
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private HelloBuilder helloBuilder = new HelloBuilder();
    private MeituanBuilder meituanBuilder = new MeituanBuilder();

    public HelloBike getHelloBike() {
        this.sequence.clear();
        // 自定义生产的顺序
        this.sequence.add("frame");
        this.sequence.add("seat");
        this.sequence.add("tire");
        this.helloBuilder.setSequence(sequence);
        return (HelloBike) this.helloBuilder.getBike();
    }

    public MeituanBike getMeituanBike() {
        this.sequence.clear();
        // 定义生产的顺序
        this.sequence.add("seat");
        this.sequence.add("tire");
        this.sequence.add("frame");
        this.meituanBuilder.setSequence(sequence);
        return (MeituanBike) this.meituanBuilder.getBike();
    }
}
