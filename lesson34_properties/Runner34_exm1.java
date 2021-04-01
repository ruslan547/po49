import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner34_exm1 {
    public static void main(String[] args) {
        String regex = "java\\w*";
        String str = "Hello java, javascript, javaSE, javaEE";
        //Work whis class Matcher
        Matcher matcher = Pattern.compile(regex).matcher(str);// -> pattern

        boolean find = matcher.find(10);
        System.out.println("find 1: " + find);

        System.out.println("find 2: " + matcher.find());
        System.out.println("find 3: " + matcher.find());
        System.out.println("find 4: " + matcher.find());
        System.out.println("find 5: " + matcher.find());
        System.out.println("find 6: " + matcher.find());

        //Сбрасывает matcher в начало строки
        matcher.reset();

        while (matcher.find()) {
            //Метод start() возвращает индекс начала совпадения
            int start = matcher.start();
            //Метод end() возвращает индекс конца совпадения
            int end = matcher.end();
            //method group() return found substring
            //method need to de called when find returned true
            String subStr = matcher.group();
            System.out.printf("start=%d, end=%d, substr=%s\n", start, end, subStr);
        }

        matcher.reset();

        //(abc) - group of signs, it is used for logical collect of signs
        matcher.reset("phone: +375-29-888-77-55");
        matcher.usePattern(Pattern.compile("\\+(\\d{1,3})-(\\d{2})-([\\d-]{1,10})"));
        if (matcher.find()) {
            String phoneNumber = matcher.group(0);//the same that is group()
            String codeCountry = matcher.group(1);
            String codeNet = matcher.group(2);
            String number = matcher.group(3);
            System.out.println("\n\nphone number:" + phoneNumber);
            System.out.println("codeCountry:" + phoneNumber);
            System.out.println("codeNet:" + phoneNumber);
            System.out.println("number:" + phoneNumber);
        }


        //////////////////////
        matcher.reset("JavaSE Web");
        matcher.usePattern(Pattern.compile("Java\\w*"));
        //method lookingAt() return true if substring is at start of string
        //method find from 0 index
        boolean lookingAt = matcher.lookingAt();
        System.out.println("lookingAt:" + lookingAt);
        System.out.println("start:" + matcher.start() + ", end:" + matcher.end());
        System.out.println("group: " + matcher.group());
    }
}
