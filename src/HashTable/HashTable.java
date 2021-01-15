package HashTable;


// TODO: make it generic for any type

public class HashTable {


    Node[] items;
    int size;


    //
    public HashTable(int size){
        this.size = size;
        items = new Node[size];
    }


    //
    private int calculateHashCode(Object item){

        int result = item.hashCode();
        result = result % size;
        result = (result<0) ? -result : result;
        return result;
    }


    //
    public void add(Object data){

        int index = calculateHashCode(data);

        if(items[index] == null){
            items[index] = new Node();
            items[index].data = data;
            return;
        }

        Node current = items[index];
        while (current.next != null)
            current = current.next;

        current.next = new Node();
        current.next.data = data;

    }


    //
    public boolean contains(Object data){

        int index = calculateHashCode(data);
        Node current = items[index];

        while (current != null){

            if(current.data.equals(data))
                return true;
            current = current.next;
        }
        return false;
    }



}
