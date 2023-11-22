public class IosDeviceFactory implements DeviceFactory{
    @Override
    public Phone CreatePhone() {
        return new IosPhone();
    }

    @Override
    public Tablet CreateTablet() {
        return new IosTablet();
    }
}
