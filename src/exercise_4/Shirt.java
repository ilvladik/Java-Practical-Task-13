package exercise_4;

import java.util.StringTokenizer;

public class Shirt {

    private String index;
    private String type;
    private String color;
    private String size;

    public Shirt(String index, String type, String color, String size) {
        this.index = index;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Shirt(String shirt) {
        String[] strings = shirt.split(",");
        index = strings[0];
        type = strings[1];
        this.color = strings[2];
        size = strings[3];
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "index='" + index + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
