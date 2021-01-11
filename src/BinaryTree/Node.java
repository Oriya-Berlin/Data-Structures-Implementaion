package BinaryTree;


public class Node implements Comparable<Double>{

    public Double Data;
    public Node Right;
    public Node Left;


    @Override
    public int compareTo(Double item){
        return this.Data.compareTo(item);
    }

}
