package Linked_List_Question.Leetcode;

public class chalkReplacer {
    public int chalk_Replacer(int[] chalk, int k) {
      int len =  chalk.length;
    
      for(int i = 0; i < len; i++){
        if(k != 0 && k >chalk[i] ){
            k = k - chalk[i];
            continue;
        }
    }
    
    

}
    public static void main(String args[]){
        int [] chalk = {5,1,5};
        int k = 22;
        chalkReplacer cr = new chalkReplacer();
        
        System.out.println(cr.chalk_Replacer(chalk, k));
    }
}
