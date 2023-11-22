public class Main {
    public static void main(String[] args) {

        Drink coffee = new Coffee();
        Drink tea = new Tea();
        coffee.Prepare();
        System.out.println("-----------");
        tea.Prepare();
    }
}