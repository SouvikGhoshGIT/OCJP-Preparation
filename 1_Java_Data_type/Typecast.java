public class Typecast{
    public static void main(String[] args){
        /*
            smaller types automatically casted to bigger types
            a bigger type val can not be assigned to smaller type without explicit type casting
            resulting type of an arithmentic operation of types smaller than int is always an int

        */
        byte a=5,b=2;
        // incorrect byte c=a+b;  because a+b will return int
        int c=a+b;
    }
}