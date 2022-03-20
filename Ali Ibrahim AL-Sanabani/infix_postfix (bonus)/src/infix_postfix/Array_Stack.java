
package infix_postfix;

public class Array_Stack<E> {
    
    E data [] ; 
    int t = -1 ; 
    static final int CAPACITY = 100 ; 

    public Array_Stack(int c) {
        
        data = (E[]) new Object[c] ;
        
    }

    public Array_Stack() {
        this(CAPACITY);
    }
    
    
   
    public boolean isEmpty() {
       return t == -1 ; 
    }

    
    public int size() {
        return t + 1 ;
    }

    
    public void push(E element) {
        
        if ( size() == data.length)
            throw new IllegalStateException("Stack is full") ; 
        
        data[++t]= element ; 
    
    
    }

    
    public E pop() {
       
        if(isEmpty())
            return null ;
        
        E delete = data[t];
        data[t] = null ; 
        t-- ; 
        return delete ; 
    
    
    }

    
    public E peek() {
       
    if(isEmpty()) return null ;
    
    return data[t] ;
    
    }
        
       
}
