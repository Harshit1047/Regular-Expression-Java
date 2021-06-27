import java.lang.*;
class Quant2{
    public static void main(String[] args)
    {
        String str="abcc";
        boolean str1=str.matches("[abc]{4}");
        System.out.println(str1);
    }
}