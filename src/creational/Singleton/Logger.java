package creational.Singleton;

public class Logger {
    
    private static Logger temp;
    
    private Logger(){

    }


    public static Logger getInstance(){
        if (temp == null){
            temp = new Logger();
        }
        return temp;
    }
}
