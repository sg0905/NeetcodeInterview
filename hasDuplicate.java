import java.util.HashMap;
import java.util.Map;

public class hasDuplicate {
    public boolean solution(int[] ar){
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int num : ar){
            m.put(num, m.getOrDefault(num, 0)+1);
        }
        for (HashMap.Entry<Integer, Integer> entry : m.entrySet()) {
        if(entry.getValue() > 1){
            return true;
        }
    }
        return false;
    }
    public static void main(String args[]){
        int ar [] = {1, 2, 3, 3};
        hasDuplicate h = new hasDuplicate();
        if(h.solution(ar)){
            System.out.println("Has duplicate element");
        }
        else
        System.out.println("Has no duplicate element");

    }
}
