public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int win;

    public int getWin() {
        win = 3;
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    private int loss;

    public int getLoss() {
        loss = 0;
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    private int draw;

    public int getDraw() {
        draw = 1;
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
}
