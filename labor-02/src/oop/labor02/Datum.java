package oop.labor02;

public class Datum {
    private int ev, ho, nap;
    //Konstruktor
    public Datum(int pev, int pho, int pnap) {
        if (helyesDatum(pev, pho, pnap)) {
            ev = pev;
            ho = pho;
            nap = pnap;
        }
    }
    public static boolean helyesDatum(int ev, int ho, int nap) {
        if(ev<0 ||ev>18000){
            return false;
        }
        if(ho<1 || ho >12){
            return false;
        }
        int[] napok = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        return!(nap<1 ||nap>napok[ho-1]);      }
        public static boolean szokoEv(int ev) {
            if(ev%4==0 && ev%100==0 && ev%400==0){
                return true;
            }
            return false;
        }
        public int getEv(){
        return ev;
        }
        public int getHo(){
        return ho;
        }
        public int getNap(){
        return nap;
        }
    public String toString(){
        return ev+" "+ho+" "+nap;
    }


        }
