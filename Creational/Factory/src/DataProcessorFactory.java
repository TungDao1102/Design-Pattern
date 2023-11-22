public class DataProcessorFactory {
    public static DataProcessor GetType(DataProcessorType type) {
        return switch (type) {
            case JSON -> new JsonProcessor();
            case HTML -> new HtmlProcessor();
            case PDF -> new PdfProcessor();
            default -> throw new RuntimeException("Unknown process");
        };
    }
}