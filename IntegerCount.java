import java.util.HashMap;

public class IntegerCount {
    public static void duplicate(int ar[]) {
        
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < ar.length ; i++) {
            Integer c = hm.get(ar[i]);
            if(hm.get(ar[i])== null){
                hm.put(ar[i], 1);
            }
            else{
                hm.put(ar[i], ++c);
            }
        }
        System.out.println(hm);
    }

    public static void main(String args[]){
        int ar [] = { 10, 34, 5, 10, 3, 5, 10 };
        duplicate(ar);
    }
}
