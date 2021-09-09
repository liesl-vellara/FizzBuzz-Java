//Creating a Class
class FizzBuzz {
  //Creating the main
  public static void main(String[] args) {
    //Using a for loop
    for (int i = 1; i <= 100; i++) {
      //Adding the condition to add Fizz for numbers divisiable by 3
      if (i%3 == 0 && i%5 != 0) {
        System.out.println("Fizz");
        //Adding the condition to add buzz for numbers divisible by 5
      }else if(i%5 == 0 && i%3 != 0) {
        System.out.println("Buzz");
        //Adding the conditio to add FizzBuzz for the numbers divisible by 3 and 5
      } else if(i%5 == 0 && i%3 ==0) {
        System.out.println("FizzBuzz");
      }else {
        //printing the numbers that are not divisible by an of the conditions
        System.out.println(i);
      }
      
       
    }
  }
} 
