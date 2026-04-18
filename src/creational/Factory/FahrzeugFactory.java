package creational.Factory;

public class FahrzeugFactory {
    


    public Fahrzeug createInstanz(String art){

        if(art.equals("Auto")){
            return new Auto();
        }
        if(art.equals("LKW")){
            return new LKW();
        }
        else{
            return null;
        }

    }
}
