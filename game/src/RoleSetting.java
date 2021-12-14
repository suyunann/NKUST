public class RoleSetting {
    String name;
    int hp;
    int atk;
    int mp;
    String skill_atk;
    String sing;
    String weapon;

    String getName() {
        return this.name;
    }

    int getHp() {
        return this.hp;
    }

    int getAtk() {
        return this.atk;
    }

    int getMp() {
        return this.mp;
    }

    String getSing() {
        return this.sing;
    }

    String getWeapon() {
        return this.weapon;
    }

    String getSkill_atk() {
        return this.skill_atk;
    }

    RoleSetting(String Name, int Hp, int Atk, int Mp, String Weapon, String Sing, String Skill_atk){

        name = Name;
        hp = Hp;
        atk = Atk;
        mp = Mp;
        weapon = Weapon;
        sing = Sing;
        skill_atk = Skill_atk;
    }
    void ShoutMyName() {

        System.out.println("我的職業是:" + getName().toUpperCase() + "!!!!!!!!!!!");
        System.out.println("HP:" + this.getHp() + "Atk:" + this.getAtk() + "MP:" + this.getMp());
        System.out.println("我的攻擊是:" + this.getSkill_atk());
        System.out.println("詠唱:" + this.getSing());
        System.out.println(("穿戴:" + this.getWeapon()));
    }
}
