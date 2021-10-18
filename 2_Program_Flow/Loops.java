public class Loops{
    public static void main(String[] args){

        // it is optional to use {} when if else has only one statement , if more than one it must be enclosed {}
        //Switch expression must be of following type 
        //==> byte,short,int,char,string,enum
        //In switch execution flow continues untill it reaches end or find a break, that is once one case get satisfied all rest will get called expect default
        //default case when no case match , it does not have to be the last case and its optional

        int a=3;
        switch(a){
            case 1:
                System.out.println(1);
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            case 7:
                System.out.println(7);
            case 8:
                System.out.println(8);
            case 9:
                System.out.println(9);
            case 10:
                System.out.println(10);
            default:
                System.out.println("Def");
        }

        for(byte a1=0 , b1=2;a1+b1 <10 ;a1++,b1++) System.out.println(a1+" "+b1);
        //for(byte a1=0 , int b1=2;a1+b1 <10 ;a1++,b1++) System.out.println(a1+" "+b1); two different types can not be defines complilation error
        for(byte a1=0 , b1=2;a1+b1 <10 ,a1<5 ;a1++,b1++) System.out.println(a1+" "+b1);


    }
}