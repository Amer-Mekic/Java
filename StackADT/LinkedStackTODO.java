/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackADT;

/**
 *
 * @author amerm
 */
import java.util.EmptyStackException;

public class LinkedStackTODO<T> implements StackInterface2<T> {

    private Node topNode; // references the first node in the chain

    public LinkedStackTODO() {
        topNode = null;
    } 

   
    public void push(T newEntry) {
          
        Node newNode = new Node(newEntry);        
        newNode.next = topNode;
        topNode = newNode;          
    } 

    public T peek() {       
        if (topNode != null) {
            T top = topNode.data;
            return top;
        }
        else throw new EmptyStackException();
        
    } 

 
    public T pop() {
        T result =null;
       if(isEmpty()){
           throw new EmptyStackException();
       }
       else{
           result = topNode.data;
           topNode=topNode.next;
       }
       return result;
    } 

 
    public boolean isEmpty() {
       return topNode==null;
    } 

 
    public void clear() {
        topNode = null;
    } 

    public void display() {
         Node currentNode = topNode;
         while (currentNode != null) {
             System.out.println(currentNode.data);
             currentNode = currentNode.next;
        }
     }
    
    private class Node {

        private T data; // entry in stack
        private Node next; // link to next node

        private Node(T dataPortion) {
            data = dataPortion;
            next = null;
        } 

        private Node(T dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } 

        private T getData() {
            return data;
        } 

        private void setData(T newData) {
            data = newData;
        } 

        private Node getNextNode() {
            return next;
        } 

        private void setNextNode(Node nextNode) {
            next = nextNode;
        } 
    }
} 
