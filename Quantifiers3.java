import java.lang.*;
class Quant2{
    public static void main(String[] args)
    {
        String str="abcca";
        boolean str1=str.matches("[abc]{4,8}");
        System.out.println(str1);
    }
}