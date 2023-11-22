public class WritePutRequestHandler extends  Handler{
    @Override
    public void HandlerRequest(Request request) {
        if(request.getType() == Type.PUT){
            System.out.println("App: Writing PUT request");
            System.out.println("Content: " + request.getContent());
        }
        if(next != null){
            next.HandlerRequest(request);
        }
    }
}
