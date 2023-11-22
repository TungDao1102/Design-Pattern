import java.util.Date;
public class CheckPoint {
    private final int level;
    private final Date date;

    public int getLevel() {
        return level;
    }

    public Date getDate() {
        return date;
    }

    public CheckPoint(int level){
        this.level = level;
        this.date = new Date();
    }
}
