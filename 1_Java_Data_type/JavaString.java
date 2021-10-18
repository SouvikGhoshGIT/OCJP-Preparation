public class JavaString{
    public static void main(String[] args){

        String s1="Hello";
        String s2="Hello ".trim();
        System.out.println(s1==s2);
        String s3="Hello";
        System.out.println(s2==s3);
        String s4=s3.intern();
        System.out.println(s3==s4);
        /*
        String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
        By applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory.
        It is advised to use equals(), not ==, to compare two strings. This is because == operator compares memory locations, while equals() method compares the content stored in two objects.
        Whenever we create a String Object, two objects will be created i.e. One in the Heap Area and One in the String constant pool and the String object reference always points to heap area object. When line-1 execute, it will create two objects and pointing to the heap area created object. Now when line-2 executes, it will refer to the object which is in the SCP. Again when line-3 executes, it refers to the same object which is in the SCP area because the content is already available in the SCP area. No need to create a new one object.

        */

        String numbers = "0123456789";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7)); //begin index
        //begin index is inclusing , end index is exclusive
        /*
            java.lang.String    java.lang.StringBuilder
            immmutable          mutable
            common method = substring,indexOf,charAt
            additonal in builder append,insert,delete,reverse    

        */

        String str="    Hello    ";
        System.out.println(str.stripLeading());
    }
}