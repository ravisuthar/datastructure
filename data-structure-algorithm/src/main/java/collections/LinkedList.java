package collections;

public class LinkedList {
        Node head;
     Node tail;

    public static class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
    }

    public void add(int value){
        if(this.head==null){
            var node =new Node(value);
            this.head = node;
            this.tail=node;
        }else{
            var node =new Node(value);
            this.tail.next = node;
            this.tail=node;
        }
    }

    public void display(){
        if(this.head==null){
            System.out.println("empty");
        }

        var temp = this.head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void display(Node node){
        if(node==null){
            System.out.println("empty");
        }

        while(node!=null){
            System.out.println(node.value);
            node=node.next;
        }
    }

    public boolean hasCycle(){
        Node slow= this.head;
        Node fast = this.head;
        while(fast!=null &&  fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow=slow.next;
            if(slow==fast) return true;
        }
        return false;
    }

    // pointers
    public Node reverse(){
        Node previous = null;
        Node current = this.head;
        while(current!=null){
            Node temp = current.next;
            current.next= previous;
            previous=current;
            current= temp;
        }

        return previous;
    }
    public Node reverseRecursion(){
        return reverseRecursion(this.head);
    }

    //important recursion function
    public Node reverseRecursion(Node head){
        //break condition
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursion(head.next);
        Node headNext = head.next;
        headNext.next=head;
        head.next=null;
        return  newHead;
    }
}
