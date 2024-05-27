public class SumInteger{
    void run(int a, int b){
        // let a = 4 , b = 5
        while(b != 0) {
            a++;
            b--;
        }
        System.out.print("Sum of two number without + operator : " + a);
    }
        public static void main(String args[]) {
            int a = 4, b =5;
            SumInteger si = new SumInteger();
            si.run(a, b);
        }
        
    }