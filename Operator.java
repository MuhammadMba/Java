class Main  {
    public static void main(String[] args) {

        int a=10;
        int b=5;
        System.out.println("===============Guess the Answers===============");

        System.out.println("Unary Operator: " + (a++));
        System.out.println("Unary Operator: " + (++b));
        System.out.println("Binary Operator");
        System.out.println("1+2 " +1+2);
        System.out.println("1+2 " +(1+2));
        System.out.println(1+2 +" =3");
        int increment = ++a * b++;
        System.out.println(increment);
        //Uncomment  the next lines to know the values
        //System.out.println("Current Value of a is: "+a);
        //System.out.println("Current Value of b is: "+b);
        System.out.println("Ternary Operator");
        int largestNumber=(a>b)?a:b;
        System.out.println("Largest Number is: "+largestNumber);


    }
    
}
