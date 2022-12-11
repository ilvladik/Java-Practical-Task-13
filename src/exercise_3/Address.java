package exercise_3;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Address {
    private LinkedHashMap<String, String> address;
    private static final String[] places = {"country", "region", "city", "street", "building", "corpus", "flat"};

    public Address(String str, int flag) {
        String[] array = str.split(",");
        this.address = new LinkedHashMap<>();

        for (int i = 0; i < array.length && i < places.length; i++) {
            address.put(places[i], array[i].strip());
        }
    }
    public Address(String s) {
        StringTokenizer str = new StringTokenizer(s, ",. ;");
        this.address = new LinkedHashMap<>();
        int count = 0;
        while (str.hasMoreTokens()) {
            address.put(places[count++], str.nextToken());
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Set<String> keys = address.keySet();
        for (String key : keys) {
            str.append(address.get(key)).append(" ");
        }
        return str.toString();
    }
}
