public class TrainStrategy implements  TravelStrategy{
    @Override
    public void PlanRoute() {
        System.out.println("Planning route by train");
    }

    @Override
    public void StartTrip() {
        System.out.println("Trip was started by train");
    }
}
