public class Game_role_setting {
    String name ;
    int hp;
    short atk;
    byte mp;
    String skill_atk;
    String sing;
    String weapon;
    void setSing(String sing){
        this.sing = sing;
    }
    void setWeapon(String weapon){
        this.weapon=weapon;
    }
    String getName()  {
        return this.name;
    }

    void ShoutMyName() {

        System.out.println("我的職業是:" + getName().toUpperCase() + "!!!!!!!!!!!" );
        System.out.println("HP:" + hp + "Atk:" + atk + "MP:" + mp);
        System.out.println("我的攻擊是:"+this.atk);
        System.out.println("詠唱:"+sing);
        System.out.println(("穿戴:" + weapon));
    }


    void setRole(int hp){
        this.hp = hp;
    }

    void setRole(short atk){
        this.atk = atk;
    }

    void setRole(byte mp){
        this.mp = mp;
    }

    void setAtk(String skill_atk){
        this.skill_atk=skill_atk;
    }


}

