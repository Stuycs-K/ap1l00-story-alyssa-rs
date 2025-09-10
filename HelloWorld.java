public class HelloWorld{
//return true if and only if x is prime,false otherwise.
public static boolean isPrime(int x){
  if (x <= 1) {
    return false;
  }
  int i = 2;
  while (i < x){
    if (x % i == 0) {
      return false;
    }
    i++;
  }
  return true;
  //just check divisibility for all values from `2` through `x - 1` inclusive.
}

//return the nth prime,
//e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
public static int nthPrime(int n){
  int primeNum = 2;
  int count = 0;
  while (true){
    if (isPrime(primeNum)){
      if (count == n){
        return primeNum;
      }
      count++;
    }
    primeNum++;
  }
}
  //Loop through values and check if they are prime until you find n of them
  //use your isPrime function.


public static void main (String[] args){
      int [] nValues = {0, 1, 2, 3, 4}; //input to nthPrime
      int [] primeNums = {2, 3, 5, 7, 11}; // expected from nthPrime
      int i = 0;
    while (i < nValues.length){
      int expectedPrime = primeNums[i];
      int inputValue = nValues[i];
      int resultPrime = nthPrime(inputValue);
    if (expectedPrime == resultPrime){
      System.out.println("pass");
    }
    else{
      String message = "fail; expected ";
      String message1 = " but value returned was ";
      System.out.println(message + expectedPrime + message1 + resultPrime);
    }
    i++;
    }
}

}
