import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs){

        // List<String> currentList = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        String org[] = strs.clone();
        for(int i = 0 ; i < strs.length ; i++) {
            char chr [] = strs[i].toCharArray();
            Arrays.sort(chr);
            strs[i]= new String (chr);
            System.out.print(org[i]+ " , ");
        }
        System.out.println();
        
        boolean check [] = new boolean[strs.length];
        for(int i = 0 ; i < strs.length; i++) {
            
            List<String> currentList = new ArrayList<>();
            
            for(int j = i+1 ; j < strs.length; j++) {
               
                if(check[i] != true && check[j] != true){
                    
                    if(strs[i].equalsIgnoreCase(strs[j])){
                    
                    currentList.add(org[j]);
                    
                    
                    }
                    
                }
                else{
                    i++;
                    j++;
                }
            }
        check[i] = true; 
        
        currentList.add(org[i]);
        result.add(currentList);
        //currentList.clear();
        }

        return result;

    }
    public static void main(String args[]){
        String strs[] = {"act","pots","tops","cat","stop","hat"};
        GroupAnagram g =new GroupAnagram();

        List<List<String>> res = g.groupAnagrams(strs);
        for (List<String> list : res) {
            System.out.println(list);
        }
    }


}
