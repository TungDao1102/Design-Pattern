public class AndroidDeviceFactory implements  DeviceFactory{
    @Override
    public Phone CreatePhone() {
        return new AndroidPhone();
    }

    @Override
    public Tablet CreateTablet() {
        return new AndroidTablet();
    }
}
