import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class slidingPuzzle{
    int dirs [] = {-1, 1, -3, 3};

    public int solution(int[][] board){
        Queue<String> queue = new LinkedList();
        HashSet<String> seen = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(int [] row : board){
            for(int num : row){
                sb.append(num);
            }
        }
        String start = sb.toString();
        final String target = "123450";
        queue.add(start);
        seen.add(start);
        int res = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size; i++) {
                String node = queue.poll();   //queue.poll returns the top element of the queue made.
                if(node.equals(target)){
                    return res;
                }
                int startIndex = node.indexOf("0");
                for(int j = 0; j < dirs.length; j++){
                    int nextIndex = startIndex + dirs[j];
                    if(isValid(startIndex, nextIndex)){
                        char[] letters = node.toCharArray();
                        swap(letters, startIndex, nextIndex);
                        String nextState = new String (letters);
                        if(nextState.equals(target)){
                            return res+1;
                        }
                        if(!seen.contains(nextState)){
                            seen.add(nextState);
                            queue.add(nextState);
                        }
                    }
                }
            }
            res++;
        }
        return -1;
    }

    public void swap (char[] strs, int source, int dest){
        char temp = strs[source];
        strs[source] = strs[dest];
        strs[dest] = temp;
    }



    
    public boolean isValid(int startIndex, int nextIndex){
        if(nextIndex < 0 || nextIndex > 5 || (startIndex == 2 && nextIndex == 3) ||((startIndex == 3 && nextIndex == 2)))
            return false;
        return true;
    }
    public static void main(String args[]){
        slidingPuzzle sd = new slidingPuzzle();
        int arr[][] = {
                        {1,2,3},
                        {4,0,5}
                    };

        
        System.out.println("Minimum Steps required to return the value : " + sd.solution(arr));
        
        int ar[][] = {
            {1, 2, 3},
            {5, 4, 0}
        };


System.out.println("Minimum Steps required to return the value : " + sd.solution(ar));


        // The size of window is fixed to 2*3 
        // Goal state is 123450

    }
    
} 