public class String_Operation {
    public static void main(String[] args) {
        StringOperation2 s1 = new StringOperation2("Utkarsh");
        StringOperation2 s2 = new StringOperation2("Utkarsh");
        s1.city = "Delhi";
        s2.city = "Nagpur";
        System.out.println(s1==s2);
        System.out.println((s1.name).equals(s2.name));
    }
}
