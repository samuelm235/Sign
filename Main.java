public class Main
{
    public static void main(String[] args) 
    {
        Sign sign1 = new Sign("ABC222DE", 3);
        String str = sign1.getLines();
        int x = sign1.numberOfLines();
        System.out.println(x);
        System.out.println(str);
        str = sign1.getLines();
        System.out.println(str);
        Sign sign2 = new Sign("ABCD", 10);
        str = sign2.getLines();
        x = sign2.numberOfLines();
        System.out.println(x);
        System.out.println(str);
        Sign sign3 = new Sign("ABCDEF", 6);
        str = sign3.getLines();
        x = sign3.numberOfLines();
        System.out.println(x);
        System.out.println(str);
        Sign sign4 = new Sign("", 4);
        str = sign4.getLines();
        x = sign4.numberOfLines();
        System.out.println(x);
        System.out.println(str);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        str = sign5.getLines();
        x = sign5.numberOfLines();
        System.out.println(x);
        System.out.println(str);
    }
}
