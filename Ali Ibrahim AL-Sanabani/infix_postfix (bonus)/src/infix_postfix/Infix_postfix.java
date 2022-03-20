
package infix_postfix;

import java.util.Scanner;
 


public class Infix_postfix {

    public static int priority (char c)
    {
        if (c == '+' || c == '-')
            return 1 ;
        else if (c == '*' || c == '/')
            return 2 ;
        else if (c == '^')
            return 3 ;
        else
            return 0 ; 
  
    }
    
    public static String infix_to_postfix (String exp)
    {
        Array_Stack<Character> s  = new Array_Stack<> (); 
        String output = "" ; 
        
        char ch[] = exp.toCharArray() ;
        
        for (int i = 0 ; i < exp.length() ; i++) {
            
            if (ch[i] == ' ') continue ;
            
            if(Character.isDigit(ch[i]) || Character.isAlphabetic(ch[i]))
                output += ch[i] ; 
                
            else if (ch[i] == '(' )
                s.push('(');
            
            else if (ch[i] == ')' )
            {   
                while (s.peek() != '(') {                    
                    output += s.peek(); 
                    s.pop() ; 
                    
                }   
                s.pop();                    
             }
            
            else
            {
                while (!s.isEmpty()&& priority(ch[i]) <= priority(s.peek())) {                    
                    
                    output += s.peek();
                    s.pop() ;
                }
            
                s.push(ch[i]);
            
            }
                 
         }
      
        while (!s.isEmpty()) 
        {
            output += s.peek();
            s.pop() ; 
        }
        
        return output;
     }
    

  
    
  
    public static void main(String[] args) {
     
      
        Scanner in = new Scanner(System.in) ;
    
        String a = in.nextLine();
        
        System.out.println(infix_to_postfix(a));
        
        
        
        
        
        
   
    
}


}