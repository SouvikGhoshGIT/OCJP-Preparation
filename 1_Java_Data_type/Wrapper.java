import java.math.BigDecimal;
public class Wrapper{
    public static void main(String[] args){
        Integer iob=Integer.valueOf("100"); // valueOf returns wrapper object Integer
        int i=Integer.valueOf("100"); // here autounboxing to primitivie
        System.out.println(iob+i); 
        int o=Integer.parseInt("1000"); //pasrint retirn s  primitive
        Integer io=Integer.parseInt("1000"); //autoboxing to Integer wrapper
        System.out.println(o+io);
        int abc=new Integer(5).intValue(); //xxxValue() also returns primitive ; using Interger consutr is not recommended 
        //we should use value of ,Interger.valueOf("B2B",16) => yes we can specify base
        System.out.println(abc);
        //avoid too many auto box auto unbox for performance issue

        //BigDecimal special kind of wrappper
        BigDecimal bd= BigDecimal.valueOf(199.99);
        BigDecimal result=bd.multiply(BigDecimal.valueOf(2));
        System.out.println(result);
        
    }
}