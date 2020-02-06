package com.vimal;

public class Stack<T>{

    private  T[] stack;
    private int stackSize;

    public Stack(){
        this.stack = (T[]) new Object[1];
    }

    public void push(T newData){
        if (this.stackSize == this.stack.length){
            resize(stackSize * 2);
        }
        this.stack[this.stackSize++] = newData;
    }


    public T pop(){
        T itemToPop = this.stack[stackSize-1];
        if (this.stackSize > 0 && this.stack.length == this.stackSize/4){
            resize(this.stack.length/2);
        }
        stackSize--;
        return itemToPop;
    }

    public Boolean isEmpty(){
        return this.stackSize == 0;
    }

    public Integer size(){
        return this.stackSize;
    }

    private void resize(int newSize){
        T[] stackCopy = (T[])new Object[newSize];

        for(int i = 0 ; i < this.stack.length; i++){
            stackCopy[i] = this.stack[i];
        }
        this.stack = stackCopy;
    }
}