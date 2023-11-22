public class TeamDecorator extends BaseDeveloperDecorator{
    public TeamDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public void DoTask() {
        _developer.DoTask();
        System.out.println("Manage team");
    }
}
