package oop.labor02;

public class Bankszamla {
    private double egyenleg;
    private double osszeg;
    public Bankszamla(double egyenleg){
        egyenleg=osszeg;}
    public void betesz(double osszeg){
        egyenleg=osszeg;
    }
    public boolean kivesz(double osszeg) {
        if (osszeg <= egyenleg)
            return true;
        return false;
    }

    public  double getEgyenleg(){
        return egyenleg;
    }
}
