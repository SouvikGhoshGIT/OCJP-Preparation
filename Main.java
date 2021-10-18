public class Main{
    public static void main(String[] args){
        System.out.println("Shout out from docker container");
        String str= "       Hello       ";
        System.out.println(str.stripLeading()); // java 11 feature
        System.out.println(str.stripTrailing()); //java 11 feature
    }
}