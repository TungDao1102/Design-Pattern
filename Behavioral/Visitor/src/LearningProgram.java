import java.util.List;

public class LearningProgram {
    private List<LearningMaterial> materials;

    public LearningProgram() {
        materials = List.of(
                new Book(),
                new Video(),
                new Podcast()
        );
    }

    public void VisitBy(Visitor visitor){
        materials.forEach(x -> x.Accept(visitor));
    }
}
