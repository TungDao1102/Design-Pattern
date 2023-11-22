public interface Visitor {
    void Visit(Book book);
    void Visit(Video video);
    void Visit(Podcast podcast);
}
