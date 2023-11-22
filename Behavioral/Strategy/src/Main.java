public class Main {
    public static void main(String[] args) {
        System.out.println("-----Client use Plain for the trip-----");
        Traveller traveller = new Traveller(new PlaneStrategy());
        traveller.travel();
        System.out.println("-----Client use Train for the trip-----");
        traveller = new Traveller(new TrainStrategy());
        traveller.travel();
    }
}