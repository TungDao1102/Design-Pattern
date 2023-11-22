import java.util.Date;

public class Game {
    private int level;
    private Date date;
    public void setLevel(int newLevel){
        this.level = newLevel;
        this.date = new Date();
    }

    public CheckPoint save(){
        return new CheckPoint(level);
    }

    public void load(CheckPoint checkPoint){
        this.level = checkPoint.getLevel();
        this.date = checkPoint.getDate();
    }

    @Override
    public String toString() {
        return "Game{" +
                "level=" + level +
                ", date=" + date +
                '}';
    }

    public void printState(){
        System.out.println(this);
    }
}
