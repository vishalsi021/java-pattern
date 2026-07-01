/* //  printing 5 to50
for (int 1=5; i<=50 ; i+=5) printing 5 to50

// sum of number 1 to 10
 public class sumNumber{
    public static void main ( String [] args){
        int sum =0;
        for(int i=1; i<=10 ;i++){
            sum = sum + i;
        }
            System.out.println(sum);
        }    }
 //

//factorial
public class sumNumber{
    public static void main ( String [] args){
        int fact =1;
        for(int i=1; i<=5 ;i++){
            fact = fact * i;
        }
            System.out.println(fact);
        }
}
        
// count the digits

public class sumNumber2
{

    public static void main ( String [] args){
        int num = 54892;
        int count= 0;

        while(num >0) { 
            num = num /10;
            count++;
        }
            System .out .println(num);
        }

    }
    
//  sum of digit

public class loopsbasic{
    public static void main(String[] args) {
        int number = 54893;
        int sum = 0;
        while (number>0){
            sum = sum +(number%10);
            number= (number/10);
        }
            System.out.println(sum);

        }
    

    }

// product of digit
public class sumNumber2{
    public static void main (String[] args){
        int num = 54893;
        int  product  = 1;
        while(num>0){
            product = product*(num%10);
            num = num/10;
        }
        System.out.println(product);

        }
    }

// max number if it is 5479213
public class sumNumber2{
    public static void main(String[] args) {
        int num = 579213;
        int max = 0;

        while (num > 0) {

            if (num % 10 > max) {
                max = num % 10;
            }

            num = num / 10;
        }

        System.out.println(max);
    }
}

// min number 
public class sumNumber2{
    public static void main(String[] args) {
        int num = 5789234;
        int min =9;
        while (num >0){
            if(num %10 < min){
                min=num %10;
            }
            num = num/10;
            }
            System.out.println(min);

        }
    }
*/
// count digits 
public class loopsbasic{
    public static void main ( String[] args){
        int count =0;
        int num= 437859;
        while (num>0){
          int digit = (num%10);
            if( num%2==0){
            }
        num = num/10;
         count++;
        }   
            }
        }
