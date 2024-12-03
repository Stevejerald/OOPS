public class StringBuff{
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("Praise ");
        StringBuffer str2 = new StringBuffer("The Lord, Amen");

        str1.append(str2);
        System.out.println(str1);

        str1.replace(7, 11, "GOD THE ");
        System.out.println(str1);

        str1.delete(19,25);
        System.out.println(str1);

        str2.reverse();
        System.out.println(str2);

        System.out.println("Length: "+ str1.length());
    }
}