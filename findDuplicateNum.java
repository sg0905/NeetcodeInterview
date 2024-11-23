import java.util.HashMap;

public class findDuplicateNum {
    public static int solution(int [] nums){
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int num : nums){
            hashmap.put(num, hashmap.getOrDefault(num,0)+1);
        }
        int sol = -1;
        for(HashMap.Entry<Integer,Integer> entry : hashmap.entrySet()){
            if(entry.getValue() > 1){
                sol = entry.getValue();
         } 
        }
        return sol;

    }
    public static void main(String args[]){
        int ar[] = {3,1,3,4,2};
        findDuplicateNum df = new findDuplicateNum();
        System.out.println("The duplicate number is : "+ df.solution(ar));

    }
}
