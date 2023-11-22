public class Request {
    private Type type;
    private String content;

    public Type getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public Request(Type type, String content) {
        this.type = type;
        this.content = content;
    }

}
