public abstract class Drink {
    public void Prepare(){
        DrinkPrepare();
        Brew();
        Pour();
    }

    private void Pour() {
        System.out.println("Pour into cup");
    }

    protected abstract void Brew();

    private void DrinkPrepare() {
        System.out.println("Prepare for drink");
    }
}
