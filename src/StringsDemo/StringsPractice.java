package StringsDemo;

public class StringsPractice {
    public static void main(String[] args) {
        String a = "hello";

        //String Length & Checks
        System.out.println(a.length());
        System.out.println(a.isEmpty());
        System.out.println(a.charAt(0));

        //String Case Conversion
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());

        //String Comparison
        System.out.println(a.equals("hello"));
        System.out.println(a.equalsIgnoreCase("HELLO"));
        System.out.println(a.compareTo("hello"));
        System.out.println(a.compareToIgnoreCase("HELLO"));

        //String Searching
        System.out.println(a.contains("ell"));
        System.out.println(a.indexOf("l"));
        System.out.println(a.lastIndexOf("l"));
        System.out.println(a.startsWith("he"));
        System.out.println(a.endsWith("lo"));

        //String Modification
        System.out.println(a.replace("l", "w"));
        System.out.println(a.substring(2));
        System.out.println(a.substring(1, 4));
        System.out.println(a.concat(" world"));
        System.out.println(a + " world");

        //String Splitting & Joining
        String[] arr = a.split("l");
        System.out.println(arr);
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println(String.join(" ", arr));

        //String Conversion
        System.out.println(String.valueOf(123));
        System.out.println(Integer.toString(123));
        System.out.println(Integer.parseInt("123"));

        //String Formatting
        System.out.println(String.format("Hello %s", "world"));
        System.out.printf("Hello %s\n", "world");

        //String Buffer
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        System.out.println(sb);

        //String Builder
        StringBuilder sb2 = new StringBuilder("hello");
        sb2.append(" world");
        System.out.println(sb2);


    }
}
