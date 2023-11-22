public class Traveller {
    private TravelStrategy _travelStrategy;
    public Traveller(TravelStrategy travelStrategy){
        _travelStrategy = travelStrategy;
    }

    public void travel(){
        _travelStrategy.PlanRoute();
        _travelStrategy.StartTrip();
    }
}
