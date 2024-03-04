/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StackADT;

/**
 *
 * @author amerm
 */

import java.util.Arrays;
import java.util.EmptyStackException;

public final class ArrayStackTODO<T> implements StackInterface2<T> {

    private  T[] stack;    // array of stack entries
    private int topIndex; // index of top entry
    //fail-safe programming:
    private boolean initialized = false;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;
    private static final int MAX_CAPACITY = 10000;

    public ArrayStackTODO() {
        this(DEFAULT_INITIAL_CAPACITY);
    } 

    public ArrayStackTODO(int initialCapacity) {
        checkCapacity(initialCapacity);
         @ SuppressWarnings("unchecked")
        T[] tempStack = (T[])new Object[initialCapacity];
        stack = tempStack;   
        topIndex = -1;
        initialized = true;
    } 

 
    //adds a new entry to the top of the stack
    public void push(T newEntry) {
        checkInitialization();
        ensureCapacity();
        stack[++topIndex]=newEntry;       
    } 
    
     //poping an element and returting the stack' top entry.
    public T pop() {
        checkInitialization();
        if (isEmpty())
            throw new EmptyStackException();
        else {
            T elementToPop = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return elementToPop;
        }       
    }
    
    public void ensureCapacity(){
        if (topIndex == stack.length-1) {// if array is full, expand array             
            int newLength = 2 * stack.length;
            checkCapacity(newLength);
            Arrays.copyOf(stack, newLength);
        }
    }
     //check if there is enough capaicty, if not throw an exception
    public void checkCapacity(int capacityLength) {
       if (capacityLength >= MAX_CAPACITY)            
        throw new SecurityException("Capacity of the array is full");
    }
    
    public T peek() {
        checkInitialization();
        T result = null;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        else{
            result = stack[topIndex];
        }
            return result;
    }
       
     private void checkInitialization() {
        if (!initialized) {
            throw new SecurityException("Array stack is not initialized properly");
        }
    }
    public boolean isEmpty() {
        return topIndex == -1;
    } 

 
     
    public void clear() {
        while(!isEmpty())
            pop();
    }

   
} 
