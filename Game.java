package projekat111;
// Ljubomir Jelic   25/006
// Damjan Draskovic 23/030
import java.util.ArrayList;

public class Game {
    private Player player;
    private ArrayList<Enemy> enemies;
    private ArrayList<String> eventLog;

    public Game(Player player) {
        this.player = player;
        enemies = new ArrayList<>();
        eventLog = new ArrayList<>();
    }

    public boolean checkCollision(Player p, Enemy e) {
        return p.getX() < e.getX() + e.getWidth()
                && p.getX() + p.getWidth() > e.getX()
                && p.getY() < e.getY() + e.getHeight()
                && p.getY() + p.getHeight() > e.getY();
    }

    public void decreaseHealth(Player p, Enemy e) {
        int oldHealth = p.getHealth();

        p.setHealth(p.getHealth() - e.getDamage());

        eventLog.add("HIT: " + p.getName() + " by "
                + e.getType() + " for " + e.getDamage()
                + " -> HP " + oldHealth + "->" + p.getHealth());
    }

    public void addEnemy(Enemy e) {
        enemies.add(e);
        eventLog.add("Added enemy: " + e.getType());
    }

  
}
