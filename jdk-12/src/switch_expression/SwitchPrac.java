package switch_expression;

public class SwitchPrac {

    public static void main(String[] args) {
        String value = switch (count(2)) {
            case 10, 20 -> "ten to twenty";
            case 30 -> "thirty";
            case 40 -> "forty";
            default -> "unknown";
        };
        System.out.println(value);
    }

    public static int count(int num) {
        return num * 10;
    }
}
