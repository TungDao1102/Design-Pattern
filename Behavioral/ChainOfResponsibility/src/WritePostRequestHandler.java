public class WritePostRequestHandler extends  Handler{
    @Override
    public void HandlerRequest(Request request) {
        if(request.getType() == Type.POST){
            System.out.println("App: Writing POST request");
            System.out.println("Content: " + request.getContent());
        }
        if(next != null){
            next.HandlerRequest(request);
        }
    }
}
