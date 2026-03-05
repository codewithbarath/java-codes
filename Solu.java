import java.util.*;

public class Solu {
    public static void main(String[] args) {

        List<Integer> names = new ArrayList<>();
        int n = 2;
        int original = n; 
        while (n > 0) {
            names.add(n % 2);
            n = n / 2;
        }

        Collections.reverse(names);
        int number = 0;
        for (int i = 0; i < names.size(); i++) {
            number = number * 10 + names.get(i);
        }
        int complement = 0;
        int i = 0;
        while (number > 0) {
            int rem = number % 10;
            complement += rem * Math.pow(2, i);
            number = number / 10;
            i++;
        }
        return complement;

        
    }
}