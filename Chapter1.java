import java.util.Scanner;

class Chapter1{
    public static void main(String[] args){

        Flower f1 = new Flower("daisy", 7, 2);
        System.out.println(f1);
        f1.setPetals(34);
        f1.setPrice(45.2f);
        System.out.println(f1);
    }

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

    public static boolean isMultiple(long m, long n){
        return m%n == 0;
    }

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

    public static int addN(int n){
        return n*(n+1)/2;
    }

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

    public static int sumSquares(int n){
        if(n<=0) return 0;
        int sum = 0;
        for (int i=0 ; i<=n ; i++){
            sum += i*i;
        }
        return sum;
    }

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
}