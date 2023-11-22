public class Student implements Visitor{
    @Override
    public void Visit(Book book) {
        System.out.println("Read a book");
    }

    @Override
    public void Visit(Video video) {
        System.out.println("Watch a video");
    }

    @Override
    public void Visit(Podcast podcast) {
        System.out.println("Listen a podcast");
    }
}
