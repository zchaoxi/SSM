package LOL.entity;

import LOL.Utils.PositionConvertUtil;

public class Hero {

    private int id;
    /**
     * 英雄名称
     */
    private String name;
    /**
     * 英雄位置 1:上单、2:打野、3:中单、4:ad、5:辅助
     */
    private String position;
    private String attack;
    private String heroRole;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return PositionConvertUtil.convert(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getHeroRole() {
        return heroRole;
    }

    public void setHeroRole(String heroRole) {
        this.heroRole = heroRole;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", attack='" + attack + '\'' +
                ", heroRole='" + heroRole + '\'' +
                '}';
    }
}
