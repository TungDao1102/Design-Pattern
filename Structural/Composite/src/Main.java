public class Main {
    public static void main(String[] args) {

        Water water = new Water();
        Cola cola = new Cola();

        Box box = new Box();
        box.Add(water);
        box.Add(cola);

        Container container = new Container();
        container.Add(water);
        container.Add(cola);
        container.Add(box);

        System.out.println("Water: "+ water.GetPrice());
        System.out.println("Cola: "+ cola.GetPrice());
        System.out.println("Box: "+ box.GetPrice());
        System.out.println("Container: "+ container.GetPrice());
    }
}