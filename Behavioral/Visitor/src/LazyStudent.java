public class LazyStudent implements  Visitor{
    @Override
    public void Visit(Book book) {
        System.out.println("Read a half of a book");
    }

    @Override
    public void Visit(Video video) {
        System.out.println("Skip video");
    }

    @Override
    public void Visit(Podcast podcast) {
        System.out.println("Listen a podcast at 10x speed");
    }
}
