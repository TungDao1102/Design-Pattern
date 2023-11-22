public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();
        developer.DoTask();
        System.out.println("----------");
        developer = new TeamDecorator(new JavaDeveloper());
        developer.DoTask();
        System.out.println("----------");
        developer = new ArchitectDecorator(new TeamDecorator(new JavaDeveloper()));
        developer.DoTask();
    }
}