public class LogPutRequestContentHandler extends  Handler{
    @Override
    public void HandlerRequest(Request request) {
        if(request.getType() == Type.PUT){
            System.out.println("App: Logging for PUT request");
            System.out.println("Content: " + request.getContent());
        }

        if(next != null){
            next.HandlerRequest(request);
        }
    }
}
