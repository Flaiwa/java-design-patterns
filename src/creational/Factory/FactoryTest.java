package creational.Factory;

public class FactoryTest {
   
    public void run(){
    
    FahrzeugFactory F = new FahrzeugFactory();
    
    Fahrzeug LKW = F.createInstanz("LKW");

    Fahrzeug Auto = F.createInstanz("Auto");

    Auto.fahren();

    LKW.fahren();
    }
}
