public class Primitive{
    public static void main(String[] args){

        /* There are 8 Primitives which are building block of Java

           1.byte = 8 bit integer val = -128 ~ 127 =>default val 0
           2.short=16 bit integer val = -32768 ~ 32767 => default 0
           3.int  =32 bit integer val = -2147483648 ~ 2147483647 =>defa 0
           4.long =64 bit integer val = -9223372036854780000 ~ 9223372036854780000 =>def 0L / 0l (upper lower both denotes long)

           the above are for whole numbers , below are for floating point number

           5.float 32 bit =>0.0F /0.0f
           6.double 64bit => normal 123.4 =>exponential notation 1.234E2

           7.BOOLEAN DEFAULT FALSE  (1 bit information,size is not precisely defined)
           8.char > 16 bits default val "\u0000"

        */
        int a = 12;
        System.out.println(Integer.toBinaryString(a)); //similarly toOctalString ,toHexString is also present in wrapper class
        //a numeric val can be expressed as binary ,decimal , octal ,hex
        a=0b1101;  //0b in front to denote this is binary
        System.out.println(a);
        a=052;  //0 in front to denote this is octal
        System.out.println(a);
        a=0x2A;  //0x in front to denote this is binary
        System.out.println(a);
        char b='A'; //char holds only one char enclosed in only single quote
        System.out.println(b);
        char c='\u0041'; //unicode char assignment 
        System.out.println(c);
        System.out.println(c+1); //char values are stores as char code, A=65 thats why result will be 66 an int
        //Assignment of one var to another creates a copy of val
        //a bigger type can not be assigned to smaller type
        //All java numeric primitives are signed // changing a sign is done by inverting all bits and add one (2s complement)
        // ~ bitwise inverter
        //long l=100_199_00000_90.0067_8990; wrong lossy conver
        double l=100_199_00000_90.0067_8990;

        System.out.println(l);

    }
}