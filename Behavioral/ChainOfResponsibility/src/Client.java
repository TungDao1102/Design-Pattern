public class Client {
    public static void main(String[] args) {

       Handler logPostHandler = new LogPostRequestContentHandler();
       Handler writePostHandler = new WritePostRequestHandler();
       Handler logPutHandler = new LogPutRequestContentHandler();
       Handler writePutHandler = new WritePutRequestHandler();

       logPostHandler.setNext(writePostHandler);
       writePostHandler.setNext(logPutHandler);
       logPutHandler.setNext(writePutHandler);

       Request post = new Request(Type.POST, "Dao Duc Tung - POST Method");
       Request put = new Request(Type.PUT, "Dao Duc Tung - PUT Method");

       logPostHandler.HandlerRequest(post);
       logPostHandler.HandlerRequest(put);
    }
}