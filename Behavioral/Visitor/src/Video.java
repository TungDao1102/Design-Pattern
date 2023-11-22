public class Video implements LearningMaterial{
    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
