package oop.labor05.models;

public class Mydate {
    private int year, month,day;
    public Mydate(int pyear,int pmonth,int pday){
        if (correctDate(year, month, day)){
        year= year;
        month = month;
        day = day;
     }
    }
    public static boolean correctDate(int year, int month, int day) {
        if(year<0 ||year>18000){
            return false;
        }
        if(month<1 || month >12){
            return false;
        }
        int[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        return!(day<1 ||day>days[month-1]);      }
    public static boolean leapYear(int year) {
        if(year%4==0 && year%100==0 && year%400==0){
            return true;
        }
        return false;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    @Override
    public String toString() {
        return "Mydate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
