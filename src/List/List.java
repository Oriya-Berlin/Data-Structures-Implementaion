package List;

//  Dynamic Array
public class List {

    final private int INITIAL_SIZE = 10;  // default size
    final private int INCREMENT = 10;
    int size;  // current cells in use
    int capacity = INITIAL_SIZE;
    public int Capacity;
    Object[] data = new Object[INITIAL_SIZE];


    // add a new value to the list
    public void Add(Object item){

        if(size == capacity)
            resizeData();

        data[size] = item;
        size++;
    }


    // when list get full
    void resizeData(){

        Object[] temp = new Object[capacity + INCREMENT];

        for(int i=0; i<capacity; i++)
            temp[i] = data[i];

        capacity = capacity + INCREMENT;
        data = temp;  // we also release the memory
    }


    // remove item of specific index
    public void remove(int position){

        if(position >= size)
            throw new ArrayIndexOutOfBoundsException();

        for(int i=position+1; i<size; i++ )
            data[i-1] = data[i];

        size--;
    }


    public void SetItem(int index, Object value){
        data[index] = value;
    }


    public Object getItem(int index){
        return data[index];
    }


    





















    public static void main(String[] args) {

        List myList = new List();

        for(int k=0; k<15; k++)
            myList.Add("ola_" + k);


        for (Object i :myList.data) {
            System.out.println(i);
        }
    }






}
