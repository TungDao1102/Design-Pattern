public class XmlToJsonAdapter implements JsonProvider{
    private XMLDataProvider _provider;
    public XmlToJsonAdapter(XMLDataProvider provider){
        _provider = provider;
    }
    @Override
    public Json GetJsonData() {
        return Utility.ConvertXmlToJson(_provider.GetXMLData());
    }
}
