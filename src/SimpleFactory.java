/**
 * @author xujiacong@ejiayou.com
 * @description 工厂模式简单实现
 * @create 2022-05-10 17:19
 **/
public class SimpleFactory {
    
    public static void main(final String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.getProduct(Type.A).doSomething();
        simpleFactory.getProduct(Type.B).doSomething();
        simpleFactory.getProduct(Type.C).doSomething();
    }

    public Product getProduct(Type type) {
        switch (type) {
            case A:
                return new ProductA();
            case B:
                return new ProductB();
            case C:
                return new ProductC();
            default:
                throw new RuntimeException("未找到该类型对象");
        }
    }

    abstract class Product {
        abstract void doSomething();
    }

    class ProductA extends Product {
        @Override
        void doSomething() {
            System.out.println("商品A的逻辑");
        }
    }

    class ProductB extends Product {
        @Override
        void doSomething() {
            System.out.println("商品B的逻辑");
        }
    }

    class ProductC extends Product {
        @Override
        void doSomething() {
            System.out.println("商品C的逻辑");
        }
    }

    enum Type {
        A, B, C
    }

}
