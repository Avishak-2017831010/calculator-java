/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new1;

import java.util.Scanner;

/**
 *
 * @author Avishak
 * 
 */
class calculator
{
    int first,second;
    calculator(int first,int second){
        this.first=first;
        this.second=second;
    }
    
    int add(){return first+second; 
    }
    
    int sub(){return first-second; 
    }
    
    int mul(){return first*second; 
    }
    
    int div(){return first/second; 
    }
    
    
     
}

public class cacl {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first element ");
        int first=scan.nextInt();
        System.out.print("Enter the second element ");
        int second=scan.nextInt();
        System.out.print("Enter operation(+,-,*,/) ");
        String opr=scan.next();  
        int op=0;
        calculator obj=new calculator(first,second);
        
        switch(opr){
            case "+":
                op=obj.add();
                break;
                
                
            case "-":
                op=obj.sub();
                break;
                
            case "*":
                op=obj.mul();
                break;
                
            case "/":
                op=obj.div();
                break;  
                
            default: System.out.println("Invalid operation");
            
        }
        
        System.out.println(first + opr + second + "=" + op);
        
       
        
    }
}
