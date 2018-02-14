
package recursioncount7;

public class RecursionCount7 {

    public static void main(String[] args) {
        // question: Given a non-negative int n, return the count of the occurrences of 7 as a digit, 
        //so for example 717 yields 2. (no loops). 
        //Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        

        //Sample output
        //count7(717) → 2
       //count7(7) → 1
      //count7(123) → 0
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(123));
        System.out.println(count7(77777777));
    }
    
    
    
    public static int count7(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
            // go back to the begnning count7 method and divide n by 10 

        } else {
            return 0 + count7(n / 10);

        }

    }
    
    
}
