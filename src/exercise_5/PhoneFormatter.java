package exercise_5;

public class PhoneFormatter {

    public static String phoneFormat(String phoneNumber) {
        StringBuilder stringBuilder = new StringBuilder(phoneNumber);
        if (phoneNumber.startsWith("+")) {
            stringBuilder.insert(5, "-").insert(9, "-");
        } else {
            stringBuilder.deleteCharAt(0).insert(0, "+7").insert(5, "-").insert(9, "-");
        }
        return stringBuilder.toString();
    }
}
