
public class DoubleLinkedList_op {
    static class  Node{
        Node prev,next;
        int val;
        Node(int val)
        {this.val=val;}
    }
    public static void main(String[] args) {
        Node start=new Node(1);
        addToEnd(start,2);
       addToEnd(start,3);
       addToEnd(start,4);
        printList(start);
        System.out.println();
        start=addToStart(start, 0);
        printList(start);
        System.out.println();
        start=delfromStart(start);
        printList(start);
        System.out.println();
        start=delfromEnd(start);
        printList(start);
        System.out.println();
        start=addAfter(start,2,5);
        printList(start);
        System.out.println();
        start=delAfterVal(start,2);
        printList(start);
    }
    public static void addToEnd(Node start,int val){
        Node temp =start;
        while(temp.next!=null){
                temp=temp.next; 
        }
        temp.next=new Node(val);
        temp.next.prev=temp;
    }
    public static Node addToStart(Node start,int val){
        Node temp=start;
        if(temp==null){
            temp=new Node(val);
        }
        else{
            temp.prev=new Node(val);
            temp.prev.next=start;
            temp=start.prev;
        }
        return temp;
    }
    public static Node addAfter(Node start,int val1,int val2){
        Node temp=start;
        while(temp.val!=val1){
            temp=temp.next;
        }
        Node temp2=temp.next;
        temp.next=new Node(val2);
        temp.next.next=temp2;
return start;
    }
    public static Node delfromStart(Node start){
        if(start==null){
           System.out.println("Nothing to delete");
        }
        else{
            start=start.next;
            start.prev=null;
        }
        return start;
    }
    public static Node delAfterVal(Node start,int val1){
        Node temp=start;
        if(start==null){
            System.out.println("Nothing to delete");
            return start;
        }
        // else if(temp.val==val1){
        //     start=start.next;
        //     return start;
        //  }
         else{
        while(temp.val!=val1){
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
        return start;
    }
    public static Node delfromEnd(Node start){
        Node temp=start;
        if(start==null){
           System.out.println("Nothing to delete");
           return start;
        }
        else if(temp.next==null){
            temp=null;
            return temp;
        }
        else{
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
        return start;
    }
    public static void printList(Node start){
        Node temp=start;
        while(temp!=null){
            System.out.print(temp.val+" ");
                temp=temp.next;
        }
    }
}
