package creational.Singleton;

public class SingletonTest {
    

    public void RunSingleton(){

    Logger log1 = Logger.getInstance();
    Logger log2 = Logger.getInstance();

    if(log1 == log2){
        System.out.println("true");
    }
    else{
        System.out.println("false");
    }
    }
}
