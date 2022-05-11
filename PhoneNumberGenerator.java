import java.util.Random; // importing ramdom module
public class PhoneNumberGenerator {


   public static void main(String []args) {
   Random rand = new Random();
   int num1, num2, num3, set1, set2;
   num1 = rand.nextInt(7)+1; // first 3 digits should not be 8 or 9 and also adding one so that we will not get 0 at first digit
   num2 = rand.nextInt(8); // getting random number between 0 to 7
   num3 = rand.nextInt(8);
   set1 = rand.nextInt(556)+100; // creating 2nd set of number which will not be greater than 655
   set2 = rand.nextInt(9000)+1000;// getting 3 set of the number which will have 4 digit number.
   System.out.println("The required phone number is "+num1+""+num2+""+num3+"-"+set1+"-"+set2); // printing the phone number
   
   
   
         }
}