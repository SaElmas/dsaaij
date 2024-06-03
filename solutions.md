<link rel="stylesheet" type="text/css" href="./style.css" />


# Data Structures and Algorithms in Java
Authors: Michael T. Goodrich, Irvine Roberto, Michael H. Goldwasser

## Chapter 1. Java Primer

### Reinforcement


<div class="q-box">

**R-1.1.** Write a short Java method, `inputAllBaseTypes`, that inputs a different value of each base type from the standard input device and prints it back to the standard output device.
<details>
<summary>Solution</summary>

```java
public static void inputAllBaseTypes(){
    Scanner sc = new Scanner(System.in);
    boolean bo;
    byte by;
    short sh;
    int i;
    long l;
    float f;
    double d;

    System.out.print("Enter a boolean value: ");
    bo = sc.nextBoolean();
    System.out.println("The boolean value you entered is: " + bo);

    System.out.print("Enter a byte value: ");
    by = sc.nextByte();
    System.out.println("The byte value you entered is: "+ by);

    System.out.print("Enter a short value: ");
    sh = sc.nextShort();
    System.out.println("The short value you entered is: "+ sh);

    System.out.print("Enter a int value: ");
    i = sc.nextInt();
    System.out.println("The int value you entered is: "+ i);

    System.out.print("Enter a long value: ");
    l = sc.nextLong();
    System.out.println("The long value you entered is: " + l);

    System.out.print("Enter a float value: ");
    f = sc.nextFloat();
    System.out.println("The float you enter is: " + f);

    System.out.print("Enter a double value: ");
    d = sc.nextDouble();
    System.out.println("The double value yuo entered is: " + d);



    sc.close();       
}
```

</details>

</div>

<div class="q-box" markdown=1>

**R-1.2.** Suppose that we create an array `A` of `GameEntry` objects, which has an integer scores field, and we clone `A` and store the result in an array `B`. If we then immediately set `A[4].score` equal to 550, what is the score value of the `GameEntry` object referenced by` B[4]`?
<details>
<summary>Solution</summary>
Since the integer field is a primitive type we expect the array B wont get effected.
</details>

</div>


<div class="q-box">

**R-1.3.** Write a short Java method, `isMultiple`, that takes two `long` values, `n` and `m`, and returns `true` if and only if `n` is a multiple of `m`, that is, `n = mi` for some integer `i`.

<details>
<summary>Solution</summary>
Solution on `Chapter1.java` file.

```java
public static boolean isMultiple(long m, long n){
    return m%n == 0;
}
```

</details>
</div>


<div class="q-box">

**R-1.4.** Write a short Java method, isEven, that takes an int `i` and returns `true` if and only if `i` is even. Your method cannot use the multiplication, modulus, or division operators, however.

<details>
<summary>Solution</summary>
 Solution on `Chapter1.java` file.

 ```java
public static boolean isEven(int i){
if(i>0){
    while(i>1){
        i -=2;
    }
} else {
    while(i<-1){
        i += 2;
    }
}
if(i==0) return true;
else return false;
    }
 ```

</details>
</div>

<div class="q-box">

**R-1.5.** Write a short Java method that takes an integer `n` and returns the sum of all positive integers less than or equal to `n`.
<details>
<summary>Solution</summary>

In the file of `Chater1.java`

```java
public static int addN(int n){
    return n*(n+1)/2;
}
```
</details>
</div>


<div class="q-box">

**R-1.6**. Write a short Java method that takes an integer `n` and returns the sum of all the odd positive integers less than or equal to `n`.

<details>
<summary>Solution</summary>

In the file of `Chapter1.java`
```java
public static int addOddsN(int n){
    if(n<=0) return 0;
    int sum = 0;
    for(int i=0 ; i<= n ; i++){
        if(i%2 == 1){
            sum += i;
        }
    }
    return sum;
}
```
</details>

</div>

<div class="q-box">

**R-1.7**. Write a short Java method that takes an integer `n` and returns the sum of the squares of all positive integers less than or equal to `n`.

<details>
<summary>Solution</summary>

In the file of `Chapter1.java`
```java
public static int sumSquares(int n){
    if(n<=0) return 0;
    int sum = 0;
    for (int i=0 ; i<=n ; i++){
        sum += i*i;
    }
    return sum;
}
```
</details>

</div>


<div class="q-box">

**R-1.8**. Write a short Java method that counts the number of vowels in a given character string.

<details>
<summary>Solution</summary>

In the file of `Chapter1.java`
```java
public static int sumSquares(int n){
    if(n<=0) return 0;
    int sum = 0;
    for (int i=0 ; i<=n ; i++){
        sum += i*i;
    }
    return sum;
}
```
</details>

</div>

<div class="q-box">

**R-1.8** Write a short Java method that counts the number of vowels in a given character string.

<details>
<summary>Solution</summary>

In the file of `Chapter1.java`

```java
public static int countVowels(String str){

    int counter = 0;
    str = str.toLowerCase();
    for (int i=0 ; i<str.length() ; i++){
        if( str.charAt(i) == 'a' || 
            str.charAt(i) == 'e' || 
            str.charAt(i) == 'i' ||
            str.charAt(i) == 'o' ||
            str.charAt(i) == 'u'
            ){
            counter++;
        }
    }

    return counter;
}
```

</details>

</div>

<div class="q-box">

**R-1.9** Write a short Java method that uses a `StringBuilder` instance to remove all the punctuation from a string `s` storing a sentence, for example, transforming the string `"Let’s try, Mike!"` to `"Lets try Mike"`.

<details>

In the file of `Chapter1.java`
<summary>Solution</summary>

```java
public static String removePunc(String str){

    String ret_str = "";
    for (int i=0 ; i<str.length() ; i++){
        char c = str.charAt(i);
        int code = (int) c;
        if (
            code < 48 || 
            (code > 57 && code < 65) ||
            (code > 90 && code < 97) ||
            code > 122) {
                continue;
            }
        ret_str += c;
    }
    return ret_str;
}
```


</details>

</div>