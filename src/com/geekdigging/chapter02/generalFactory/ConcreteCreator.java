package com.geekdigging.chapter02.generalFactory;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2020/10/21
 * @Time: 23:21
 * @email: inwsy@hotmail.com
 * Description:
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> clazz) {
        Product product = null;
        try {
            product = (Product) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }
        return (T) product;
    }
}
