/*Pattern 2: Sum & Product
Sum digits
Product digits
Sum even
Sum odd
Product even
Product odd
Sum prime
Product prime
1. Write a Java program to find the sum of all digits in a number.

Input
54892
Output
28
Explanation
5 + 4 + 8 + 9 + 2 = 28 
public class sum21{
    public static void main( String [] args){
        int num =54892;
        int sum = 0;
        while (num>0){
            
        sum = sum + (num%10);
        num= num/10;

    }
    System.out.println(sum);
} 
}
 */
// # Pattern 2 – Problem 2

/* ## Product of Digits

### Question

Write a Java program to find the **product of all digits** in a number.

### Input

54893
```

 Output

```text
4320
```

### Explanation

```text
5 × 4 × 8 × 9 × 3 = 4320
```


public class sum21{
    public static void main( String [] args){
        int num =54893;
        int prod = 1;
        while (num>0){
            
        prod = prod * (num%10);
        num= num/10;

    }
    System.out.println(prod);
    }
}
    */
/* 
 # Pattern 2 – Problem 3

## Sum of Even Digits

### Question

Write a Java program to find the **sum of all even digits** in a number.

### Input

5489261
```

### Output
20
```

### Explanation

Even digits are:

4
8
2
6
```

Sum:

```text
4 + 8 + 2 + 6 = 20
```

public class sum21{
    public static void main( String [] args){
        int num =5489261;
        int sum = 0;
        while (num>0){
           
         int digit =num%10;
        if (digit %2 ==0 ) {
             sum = sum + (num%10);
        }

            
        num= num/10;
}
    System.out.println(sum);
} 
}
 

// sum of odd digit
public class sum21{
    public static void main (String [] args)
{
    int num = 5489261;
    int sum= 0;
    while (num >0  ){
        int digit = num%10;
        if (digit %2 !=0) {
            sum = sum + num%10;
    
        }
      num = num/10;
    }
System.out.println(sum);
}}
 
// Product even
public class sum21{
    public static void main (String [] args)
{
    int num = 5489261;
    int prod= 1;
    while (num >0  ){
        int digit = num%10;
        if (digit %2 ==0) {
            prod = prod * digit;
    
        }
      num = num/10;
    }
    System.out.println(prod);
}

} 
*/
// lets do this Sum prime, product prime
public class sum21{
    public static void main(String[] args) {
        int num = 5489261;
        int sum = 0;
        while ( num >0){
            int digit = num %10;
            if ( digit==3 || digit ==2 || digit==5 ||digit==7){
                sum = sum + digit;
            }
            num = num/10;

            }
            System.out.println(sum);
            }
        
        }
    