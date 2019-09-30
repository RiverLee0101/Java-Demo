package factoryMethod;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 * @Description: 具体工厂1，生产产品1
 */
public class ConcreteFactory1 implements AbstractFactory {
    public Product newProduct(){
        System.out.println("具体工厂1生成-->具体产品1...");
        return new ConcreteProduct1();
    }
}
