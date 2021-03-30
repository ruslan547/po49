import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner34_hw2 {
    /**
     * wight regex for java doc, a lot of line, universal
     *
     */
    public static void main(String[] args) {
        final String FILE_NAME = "lesson34_hw2/itClass.txt";
        final String REGEX = "\\s*//.*\n";//comment

        StringBuilder builder = readFile(FILE_NAME);
        System.out.println(builder);

        System.out.println("\n\nFind comments...");
        Matcher matcher = Pattern.compile(REGEX).matcher(builder);
        while (matcher.find()) {
            //method group return founded string recording ...
            String substr = matcher.group();
            System.out.println("Comment: " + substr);
            int start = matcher.start();
            int end = matcher.end();
            builder.delete(start, end - 1);
            matcher.reset();
        }

        System.out.println("\nNew builder: ");
        System.out.println(builder);
    }

    private static StringBuilder readFile(String filename) {
        final int CAPACITY = 500;
        final char ENTER = '\n';
        StringBuilder builder = new StringBuilder(CAPACITY);

        try (Scanner sc = new Scanner(new FileReader(filename))) {
            while (sc.hasNextLine()) {
                builder.append(sc.nextLine() + ENTER);
            }
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }

        return builder;
    }
}
