public class LogPostRequestContentHandler extends Handler{
    @Override
    public void HandlerRequest(Request request) {
        if(request.getType() == Type.POST){
            System.out.println("App: Logging for POST request");
            System.out.println("Content: " + request.getContent());
        }

        if(next != null){
            next.HandlerRequest(request);
        }
    }
}
