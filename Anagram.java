import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String new_word = new String(ch);
            if (result.containsKey(new_word)) {
                result.get(new_word).add(word);
            } else {
                List<String> current = new ArrayList<>();
                current.add(word);
                result.put(new_word, current);
            }
        }

        return new ArrayList<>(result.values());

    }

    public static void main(String args[]) {
        String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
        Anagram a = new Anagram();

        a.groupAnagrams(strs);

        for (List<String> group : a.groupAnagrams(strs)) {
            System.out.println(group);

        }

    }
}

// public class Anagram {
// public void groupAnagrams(String[] strs) {
// List <String> currentList = new ArrayList<>();
// List<List<String>> result = new ArrayList<>();
// Arrays.sort(strs);
// int flag = 0;
// for(int i = 0 ; i < strs.length-1; i++){
// flag = check(strs[i],strs[i+1]);

// if(flag == 1 ){
// currentList.add(strs[i]);

// currentList.add(strs[i+1]);

// }

// else{
// result.add(currentList);
// currentList.clear();
// flag = 0;
// }

// }
// System.out.print(result+ " ");
// }
// public int check(String s, String st){
// char ch [] = s.toCharArray();
// char ch1 [] = st.toCharArray();
// Arrays.sort(ch);
// Arrays.sort(ch1);
// s = ch.toString();
// st = ch1.toString();
// if (st.equalsIgnoreCase(s)) {
// return 1;
// }
// return 0;
// }

// public static void main(String args[]){
// Anagram a =new Anagram();
// String []strs = {"act","pots","tops","cat","stop","hat"};
// a.groupAnagrams(strs);

// }
// }
