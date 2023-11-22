public class ArchitectDecorator extends BaseDeveloperDecorator{
    public ArchitectDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public void DoTask() {
        _developer.DoTask();
        System.out.println("Make Architecture");
    }
}
