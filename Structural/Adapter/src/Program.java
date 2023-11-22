public class Program {
    private JsonProvider _jsonProvider;

    public Program(JsonProvider jsonProvider) {
        _jsonProvider = jsonProvider;
    }

    public void PrintJsonData(){
        Json jsonData = _jsonProvider.GetJsonData();
        System.out.println(jsonData);
    }
}
