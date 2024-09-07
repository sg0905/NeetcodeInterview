package Linked_List_Question;


class Node{
    int data;
    Node next;
    Node() {}
    Node(int data) {
        this.data = data;
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class mergeTwoList {
    public static Node mergeTwoLists(Node list1, Node list2){
        Node result = new Node(-1);
        Node p = result;
        while(list1 != null && list2 != null){
            
            if(list1.data < list2.data){
                p.next = list1;
                list1 = list1.next;
            }
            else{
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        if(list1 == null){
            p.next = list2;
        }
        else
            p.next = list1;
        return result.next;
    }

    public static void printlist(Node List1){
        while(List1 != null){
            System.out.print(List1.data + " " );
            List1 = List1.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next =  new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(5);
        // System.out.println("List 1 :" );
        // printlist(list1);
        
        Node temp = mergeTwoLists(list1, list2);
        System.out.println("List 1 :" );
        printlist(list1);

        System.out.println("List 2 :" );
        printlist(list2);

        System.out.println("Merge list :");
        printlist(temp);





    }
    
}
