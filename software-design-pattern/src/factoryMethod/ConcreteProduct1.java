package factoryMethod;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 * @Description: 具体产品1，实现产品接口中的抽象方法
 */
public class ConcreteProduct1 implements Product{
    public void show(){
        System.out.println("具体产品1显示..");
    }
}
