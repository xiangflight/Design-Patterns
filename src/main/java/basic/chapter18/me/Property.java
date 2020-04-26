package basic.chapter18.me;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/17
 */

public class Property {

    private int life;

    private int attack;

    private int defense;

    public Property(int life, int attack, int defense) {
        this.life = life;
        this.attack = attack;
        this.defense = defense;
    }

    public Property(Property property) {
        this.life = property.life;
        this.attack = property.attack;
        this.defense = property.defense;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "Property{" +
                "life=" + life +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
