import creational.Singleton.SingletonTest;
import creational.Factory.FactoryTest;
public class App {
    public static void main(String[] args) throws Exception {
        SingletonTest st = new SingletonTest();

        FactoryTest ft = new FactoryTest();

        ft.run();
    }
}
