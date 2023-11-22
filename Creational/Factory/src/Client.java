public class Client {
    public static void main(String[] args) {
        System.out.println("App: Launched with the DataProcessorType PDF.");
        DataProcessor processor = DataProcessorFactory.GetType(DataProcessorType.PDF);
        processor.Process();
        System.out.println("App: Launched with the DataProcessorType HTML.");
        processor = DataProcessorFactory.GetType(DataProcessorType.HTML);
        processor.Process();
        System.out.println("App: Launched with the DataProcessorType JSON.");
        processor = DataProcessorFactory.GetType(DataProcessorType.JSON);
        processor.Process();
    }
}
