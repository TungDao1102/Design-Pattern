public class PlaneStrategy implements TravelStrategy{
    @Override
    public void PlanRoute() {
        System.out.println("Planning route by plane");
    }

    @Override
    public void StartTrip() {
        System.out.println("Trip was started by plane");
    }
}
