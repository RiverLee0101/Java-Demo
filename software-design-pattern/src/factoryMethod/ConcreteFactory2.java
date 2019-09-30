package factoryMethod;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 */
public class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct(){
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}
