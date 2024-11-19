import java.util.*;

public class practice {
    public static void main(String args[]){
       String strs[] = {"act","pots","tops","cat","stop","hat"};
       for ( int i =0 ;i < strs.length ; i++) 
       {
        char chr []= strs[i].toCharArray();
         
       Arrays.sort(chr);
       strs[i] = new String (chr);
    }
        for ( String st : strs)
        System.out.println(st);

    }
}
