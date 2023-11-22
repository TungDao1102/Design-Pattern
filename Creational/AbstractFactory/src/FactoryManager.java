public class FactoryManager {
    public static DeviceFactory GetFactory(Platform platform){
        return switch (platform) {
            case IOS -> new IosDeviceFactory();
            case ANDROID -> new AndroidDeviceFactory();
            default -> throw new IllegalArgumentException("Invalid Platform");
        };
    }
}
