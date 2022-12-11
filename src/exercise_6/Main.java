package exercise_6;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = consoleReader.readLine();
        BufferedReader fileReader = new BufferedReader(new InputStreamReader
                (new FileInputStream(fileName), StandardCharsets.UTF_8));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = fileReader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(" ");
        }
        line = stringBuilder.toString().trim();
        StringBuilder result = getLine(line);
        System.out.println(result);
    }

    public static StringBuilder getLine(String words) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(words, " ");
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        char next = 'a';
        StringBuilder stringBuilder = new StringBuilder();
        while (!list.isEmpty()) {
            boolean haveMore = false;
            for (String s : list) {
                char ch = s.toLowerCase().charAt(0);
                if (ch == next) {
                    stringBuilder.append(s).append(" ");
                    list.remove(s);
                    next = s.toLowerCase().charAt(s.length() - 1);
                    haveMore = true;
                    break;
                }
            }
            if (!haveMore) break;
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder;
    }
}
