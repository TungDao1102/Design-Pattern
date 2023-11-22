public class XML {
    private String xmlData;

    public XML(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getXMLData() {
        return xmlData;
    }

    public void setXMLData(String xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String toString() {
        return "XMLData: \n" + xmlData;
    }
}
