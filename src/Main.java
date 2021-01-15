import BinaryTree.BinaryTree;
import BinaryTree.BinaryTreeAlreadyHasAnItemWithTheSameSortingOrderException;
import HashTable.HashTable;
import JustForTests.Person;
import LinkedList.IndexOutOfLinkedListException;
import LinkedList.LinkedList;
import LinkedList.Node;


public class Main {


    private static void print(LinkedList linkedList){

        Node current = linkedList.head;

        while (current != null){
            System.out.println(current.getData());
            current = current.next;
        }
    }



    public static void main(String[] args) throws IndexOutOfLinkedListException,
            BinaryTreeAlreadyHasAnItemWithTheSameSortingOrderException {

        ///////////////////////////////////////// *** List *** /////////////////////////////////////////////////////////


/*
        List myList = new List();

        myList.Add("ola1");
        myList.Add("ola2");
        myList.Add("ola3");
        myList.Add("ola4");
        myList.Add("ola5");
        myList.Add("ola6");
        myList.Add("ola7");
        myList.Add("ola8");
        myList.Add("ola9");
        myList.Add("ola10");
        myList.Add("ola11");
        myList.Add("ola12");

        System.out.println(myList);

        for (Object i :myList.data) {
            System.out.println(i);
        }
*/


        ///////////////////////////////////////// *** Linked List *** //////////////////////////////////////////////////


/*
        LinkedList numbers = new LinkedList();
        for(int i=0; i<10; i++)
            numbers.add(i*10);

        print(numbers);
        System.out.println();
        numbers.getNodeByIndex(20);
        numbers.remove(90);
        numbers.remove(0);
        numbers.remove(50);
        System.out.println();
        print(numbers);
*/

        ///////////////////////////////////////// *** Binary Tree *** //////////////////////////////////////////////////


/*
        BinaryTree tree = new BinaryTree();
        for (double d: new double[]{54, 45, 76, 65, 78, 64, 68})
            tree.add(d);

        System.out.println(tree.contains(64.0));
        System.out.println(tree.contains(15.0));
        tree.print("ascending");
        System.out.println();
        tree.print("descending");
*/


        ///////////////////////////////////////// *** Hash Table *** ///////////////////////////////////////////////////


        // TODO: we need to test it and also change some stuff in the classes
        HashTable myHashTable = new HashTable(100);
        myHashTable.add(new Person("yossi", 20, "000"));
        myHashTable.add(new Person("avi", 30, "123"));
        myHashTable.add(new Person("moshe", 40, "456"));

        System.out.println(myHashTable.contains(new Person("moshe", 40, "456")));
        System.out.println(myHashTable.contains(new Person("noam", 50, "456")));
        System.out.println(myHashTable.contains(new Person("noam", 40, "666")));


    }


}
