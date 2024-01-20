public class SLL 
{
    private int size;
    Node head;

    SLL()
    {
        this.size = 0;
    }
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++; 
        }
    }
    //add - first/last
    public void addfirst(String data)
    {
        Node NewNode = new Node(data);
        if(head == null)//if the first node is null then
        {
            head = NewNode;
            return;
        }
        //otherwise
        NewNode.next = head;
        head = NewNode;
        
    }

    public void addlast(String data)
    {
        Node NewNode = new Node(data);
        if(head == null)//if the first node is null then
        {
            head = NewNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) 
        {
            currNode = currNode.next;    
        }
        currNode.next = NewNode;
        NewNode.next = null;

    }

    public void printlist()
    {
        if (head == null) 
        {
            System.out.println("The list is Empty");
            return;    
        }
        Node currNode = head;
        while (currNode != null) 
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;    
        }
        System.out.println("NULL");

    
    }

    public void removefirst(String data)
    {
        if (head == null) 
        {
            System.out.println("The list is Empty");
            return;    
        }
        size--;
        head = head.next;

    }
    public void removelast(String data)
    {
        if (head == null) 
        {
            System.out.println("The list is Empty");
            return;    
        }
        size--;

        if (head.next == null) //  <---------
        {//                                  |
            head = null;//                   |
            return;   //                     |
        }//                                  |
        Node secondlast = head;//            |
        Node lastnode  = head.next; // if head.next = null -> lastnode = null
        while(lastnode.next != null)// null.next  = error
        {
            lastnode = lastnode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null; 
    }

    public int getsize()
    {
        return size;
    }

    //reverse a linked list
    public void reverseiterate()
    {
        if (head == null || head.next == null ) 
        {
            return;
        }
        Node prevNode = head;
        Node currNode = prevNode.next;
        while( currNode != null)
        {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //updating the value of the currNode and the prevnode
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }



    public static void main(String[] args) 
    {
        SLL list  = new SLL();
        list.addfirst("a");
        list.addfirst("is");
        list.addlast("list");
        list.addfirst("This");
        list.printlist();
        list.reverseiterate();
        list.printlist();
        System.out.println("the size of thr array is "+list.getsize());
    }
    
}
