package projekat111;

class Player {

    private String name;

    private int x, y;

    private int width, height;

    private int health;

    public Player(String name, int x, int y, int width, int height, int health) {

        setName(name);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        setHealth(health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Player";
        } else {
            name = name.trim().toLowerCase();
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }

    @Override
    
    public String toString() {
        return "Player[" + name + "] @ (" + x + "," + y + ") "
                + width + "x" + height + " HP=" + health;
    }

}