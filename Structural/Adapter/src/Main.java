public class Main {
    public static void main(String[] args) {
        XMLDataProvider provider = new XMLDataProvider();
        System.out.println(provider.GetXMLData());
        Program program = new Program(new XmlToJsonAdapter(provider));
        program.PrintJsonData();
    }
}