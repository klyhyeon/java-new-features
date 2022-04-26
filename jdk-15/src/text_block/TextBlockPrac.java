package text_block;

public class TextBlockPrac {

    public static void main(String[] args) {
        String jsonWithoutTb = "{\"name\": \"painter\", \"qty\": 18, "
                + "\"size\": {\"width\": 1, \"height\": 8, \"unit\": \"in\"},"
                + "\"tags\": [\"writing\", \"pen\"],"
                + "\"rating\": 7}";

        String jsonWithTb = """
                {
                 "name": "painter", "qty": 18,
                 "size": {"width": 1, "height": 8, "unit": "in"},
                 "tags": ["writing", "pen"],
                 "rating": 7
                }              
                """;

        System.out.println("without TB: " + jsonWithoutTb);
        System.out.println("with TB: " + jsonWithTb);
    }
}
