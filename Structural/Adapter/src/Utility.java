public class Utility {
    public static Json ConvertXmlToJson(XML xmlData) {
        StringBuilder jsonString = new StringBuilder();
        String[] lines = xmlData.getXMLData().lines().toArray(String[]::new);
        for (String line : lines) {
            jsonString.append(line.replace("<", "{").replace(">", "}")).append("\n");
        }
        return new Json(jsonString.toString());
    }
}