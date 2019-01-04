public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
       System.out.println( convertEurToUsd(20, 1.35)); 
       System.out.println(convertEurToUsd(20, 22.54));  
        
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        
        return eur * course;
    }
}
