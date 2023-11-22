public abstract class BaseDeveloperDecorator implements Developer{
    protected Developer _developer;
    public BaseDeveloperDecorator(Developer developer){
        _developer = developer;
    }
}
