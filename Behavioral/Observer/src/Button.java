import java.util.ArrayList;
import java.util.List;

public class Button {
    private List<Observer> observerList = new ArrayList<>();
    public void AddSubscriber(Observer subscriber){
        observerList.add(subscriber);
    }
    public void RemoveSubscriber(Observer subscriber){
        observerList.remove(subscriber);
    }
    public void NotifySubscriber(){
        observerList.forEach(Observer::onClick);
    }
    public void Click(){
        System.out.println("Click");
        observerList.forEach(Observer::onClick);
    }
}
