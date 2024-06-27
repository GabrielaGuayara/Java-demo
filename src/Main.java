public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        String name = "Zbdoul";
        System.out.println(name.charAt(0));

        //Ternary
        if(name.charAt(0) == 'A' ? true : false){
            System.out.println("Name starts with A");
        }else if(name.charAt(0)== 'B'){
            System.out.println("Name starts with B");
        }
        else {
         //   System.out.println("Name does not start with A");
//            stringOne();
//            printStatements();
//            System.out.println(WhatDayQM("Tuesday"));
            loops(12);

        }
    }

    static void loops(int num){
//        for( int i = 0; i < num; i++ ) {
//            System.out.println(i);
//        }

//        while(num > 5){
//            System.out.println(" This is the Number " +num);
//            num--;
//
//        }

        do {
            System.out.println(" This is the Number " +num);
            num--;
        }while(num > 5);
    }

    static int mathOne(){

        //AutoBoxing: The automatic conversion that the Java compiler makes between the primitives types and their corresponding object wrapper classes.
        Integer Myinteger = 25;

        //Unboxing: The reverse of autoboxing. It is the automatic conversion of wrapper classes to their respective primitive types.
        int num = Myinteger;

        return  Myinteger;
    }

    static String escape(){
        return "\"Steven\" \nHulse";
    }


    static void stringOne(){
        //Create and use Strings

       String Name = " Francisco";

       String newStr = new String("Put it in the Bag ! ");

        //.trim() remove the space that are before and after a string
        //   System.out.println(Name.trim());

       System.out.println(newStr.replace("t", "").toUpperCase().replace(" ", ""));
    }

    static boolean isCapitalize(String c) {

        if (c == c.toUpperCase()) {
            return true;
        }
        else {
            return false;
        }
    }



    static void printStatements(){
        System.out.println("Hello World ! ");
        System.out.print("Hello");

        //printf is similar to backsticks (``).
        System.out.printf(" AGE: %.2f, Name %s", 30.3455, "Steven");
//        System.out.printf("Hello World!");
    }

    static double mathClass(){

            //Math methods are similar to JS math methods
            double a = Math.max(3, 4);
           return Math.sqrt(16);
    }


    static String WhatDayQM(String s){

        switch(s){

            case "Monday":
                System.out.println("It is Monday");
            break;

            case "Tuesday":
                System.out.println("It is Tuesday");
                break;

            case "Wednesday":
                System.out.println("It is Wednesday");
                break;

            case "Thursday":
                System.out.println("It is Thursday");
                break;
            case "Friday":
                System.out.println("It is Friday");
                break;
            case "Saturday":
                System.out.println("It is Saturday");
                break;

            default:
                System.out.println("It is Sunday");
                break;
        }


        return s;
    }
}