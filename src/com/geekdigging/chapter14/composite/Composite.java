package com.geekdigging.chapter14.composite;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/11/18
 * @Time: 18:53
 * @email: inwsy@hotmail.com
 * Description:
 */
public class Composite extends Component {
    // 构建容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();
    // 增加一个叶子构件或者树枝构件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    // 删除一个叶子构件或者树枝构件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    // 获得分支下所有叶子构件或者树枝构件

    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
