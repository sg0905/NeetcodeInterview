//Given two integers a and b, return the sum of the two integers without using the + and - operators.

public class SumInteger{
    void run(int a, int b){
        // let a = 4 , b = 5
        
        if( b > 0){
            while(b != 0) {
                a++;
                b--;
            }  
        }
        else if ( b < 0) {
            while ( b != 0) {
                b++;
                a--;
            }
        }
        
        System.out.println("Sum of two number without + operator : " + a);
    }
        public static void main(String args[]) {
            SumInteger si = new SumInteger();
            int a = 4, b =5;
            si.run(a, b);

            
            si.run(0, -1);

            
            si.run(-5, -4);
        }
        
    }