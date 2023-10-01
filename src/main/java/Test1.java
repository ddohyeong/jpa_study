public class Test1 {
    public static void main(String[] args) {
        String str1 = "hi";
        String str2 = "hi";
        String str3 = new String("hi");


        System.out.println(str1 == str2);

        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
