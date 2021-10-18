public class Operator{
    public static void main(String[] args){
        int a=1;
        int b=2;
        a=++b; //first b gets incremented and then assigned to a so a=3
        System.out.println(a);
        b=a++; //first a current val gets copied and assigned to b and then b gets increment so b=3
        System.out.println(b);
        /*
            > < >= <= instance of  Relational
            && logical and & bitwise end
            >> << >>> bitsift
            !! logical and ! bitwise and ^ bitwise xor
        */
        byte c =1;
        System.out.println(Integer.toBinaryString(c<<2)); //00000001 left shift 2 = 00000100
        c <<= 2;  // c=4
        System.out.println(c >> 2); //back to 1
        c=100;
        System.out.println(Integer.toBinaryString(c)); //1100100
        System.out.println(Integer.toBinaryString(c >> 2)); //0011001
        System.out.println(Integer.toBinaryString(-c >>> 2)); // unsigned bitwise shift adds 0 to MSBs

        System.out.println(1 & 3); //butwise and when both 1 then result 1 , else 0 
        System.out.println( 1 | 0); //bitwise or , when either is 1 result is 1
        System.out.println(0 ^ 1); //bitwise xor when both bits same then 0, when diff then 1

        //bitwise operator results is int type
        /*
         && || -> short circuit evaluration for && when left side is false then right right does not get evaluated
                  similarly for  || when left is true the right dont get eval
         &  |  -> full circuit 


        */

        // boolean b= !0;   this will thorw error cant use logical operator on numenrics
        long lo= 10L;
        int fg =2;
        fg *= lo;
        System.out.println(fg);

        /*
        One of the reasons compound operators are useful is that not only they provide a shorter way for operations, but also implicitly cast variables.

        Formally, a compound assignment expression of the form:

        E1 op= E2

        is equivalent to:

        E1 = (T)(E1 op E2)

        where T is the type of E1.

        */



        


    }
}