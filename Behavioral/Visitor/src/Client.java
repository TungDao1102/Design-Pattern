public class Client {
    public static void main(String[] args) {
        LearningProgram learningProgram = new LearningProgram();
        System.out.println("Visit by a Student: ");
        learningProgram.VisitBy(new Student());
        System.out.println("------------");
        System.out.println("Visit by a Lazy Student: ");
        learningProgram.VisitBy(new LazyStudent());
    }
}