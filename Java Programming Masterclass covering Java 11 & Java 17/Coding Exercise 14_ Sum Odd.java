public class SumOddRange {
    
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 1) {
            return true;
        }
        return false;
    }
    
    public static int sumOdd(int start, int end) {
        
        if ((end >= start) && (start > 0) && (end > 0)) {
            int sumOdds = 0;
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                sumOdds += i;
                }
            }
            return sumOdds;
        }
        return -1;
    }
 
}
