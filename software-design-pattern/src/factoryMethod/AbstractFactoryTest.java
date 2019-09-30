package factoryMethod;

/**
 * @Author: 11101453
 * @Date: 2019/9/30
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        try {
            Product a;
            AbstractFactory af;
            af = (AbstractFactory) ReadXML1.getObject();
            a = af.newProduct();
            a.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
