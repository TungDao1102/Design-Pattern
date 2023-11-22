public class Main {
    public static void main(String[] args) {

        Button button = new Button();
        button.AddSubscriber(new EmailSenderObserver());
        button.AddSubscriber(new EventObserver());
        button.AddSubscriber(new DatabaseObserver());
        button.Click();

    }
}