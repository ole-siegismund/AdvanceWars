package advancewars;

import java.io.Serializable;

public abstract class Einheit implements Serializable {
    private static final long serialVersionUID = 3L;
    private int rangeMin;
    private int rangeMax;
    private int sight;
    private int move;
    private int posX;
    private int posY;
    private int cost;
    private int hp = 10;
    private int vorteil;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getVorteil() {
        return vorteil;
    }

    public void setVorteil(int vorteil) {
        this.vorteil = vorteil;
    }

    public boolean kannAngreifen(Einheit einheit) {
        return false;
    }
    public void angreifen(Einheit einheit) {

    }
    public void bewegen(int x, int y) {

    }
    public boolean kannErreichen(int x, int y){
        return false;
    }
    public int getRangeMin() {
        return rangeMin;
    }

    public void setRangeMin(int rangeMin) {
        this.rangeMin = rangeMin;
    }

    public int getRangeMax() {
        return rangeMax;
    }

    public void setRangeMax(int rangeMax) {
        this.rangeMax = rangeMax;
    }

    public int getSight() {
        return sight;
    }

    public void setSight(int sight) {
        this.sight = sight;
    }

    public int getMove() {
        return move;
    }

    public void setMove(int move) {
        this.move = move;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}