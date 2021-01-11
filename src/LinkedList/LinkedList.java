package LinkedList;

public class LinkedList {

    public Node head;
    public int index = 0;


    public void add(Object item){

        // if first
        if(head == null) {
            head = new Node();
            head.data = item;
            head.next = null;
            return;
        }

        // otherwise
        Node current = head;

        while (current.next != null)
            current = current.next;

        current.next = new Node();
        current.next.data = item;
        current.next.next = null;
    }



    public boolean remove(Object item) throws IndexOutOfLinkedListException {

        Node current = head;
        Node previous = null;

        while (current != null){

            if(current.data.equals(item)){

                // if it's the first node
                if(current == head){
                    head = head.next;
                    return true;
                }

                // if it's the last node
                if(current.next == null){
                    previous.next = null;
                    return true;
                }

                // if somewhere in the middle
                previous.next = current.next;
                current.next = null;
                return true;
            }

            previous = current;
            current = current.next;
        }
        return false;
    }



    public Node getNodeByIndex(int index) throws IndexOutOfLinkedListException {

        if(head == null)
            throw new IndexOutOfLinkedListException();

        int i = 0;
        Node current = head;

        while (i<index)
        {
            if(current.next == null)
                throw new IndexOutOfLinkedListException();

            current = current.next;
            i++;
        }
        return current;
    }


}
