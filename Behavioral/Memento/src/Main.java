public class Main {
    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.setLevel(1);
        CheckPoint checkPoint1 = game.save();
        Thread.sleep(2000);
        game.printState();

        game.setLevel(2);
        CheckPoint checkPoint2 = game.save();
        game.printState();

        game.load(checkPoint1);
        game.printState();
    }
}