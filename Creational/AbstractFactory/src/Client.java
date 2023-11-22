public class Client {
    public static void main(String[] args) {
        System.out.println("Client: Use Android Platform");
        DeviceFactory factory = FactoryManager.GetFactory(Platform.ANDROID);
        Tablet tablet = factory.CreateTablet();
        Phone phone = factory.CreatePhone();
        tablet.Enable();
        phone.Enable();
        System.out.println("Client: Use IOS Platform");
        factory = FactoryManager.GetFactory(Platform.IOS);
        tablet = factory.CreateTablet();
        phone = factory.CreatePhone();
        tablet.Enable();
        phone.Enable();
    }
}