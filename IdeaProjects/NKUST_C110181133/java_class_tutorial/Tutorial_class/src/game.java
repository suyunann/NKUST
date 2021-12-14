public class game {
    public static void main(String[] args) {
        Game_role_setting Archer = new Game_role_setting();
        Game_role_setting Berserker = new Game_role_setting();
        Game_role_setting Mage = new Game_role_setting();

        Archer.name = "弓箭手";
        Archer.hp = 100;
        Archer.atk = 50;
        Archer.mp = 20;
        Archer.weapon = "腐蝕箭";
        Archer.sing = "集中";
        Archer.skill_atk = "連續射擊";

        Berserker.name = "狂戰士";
        Berserker.hp = 150;
        Berserker.atk = 60;
        Berserker.mp = 10;
        Berserker.weapon = "戰斧";
        Berserker.sing = "衝鋒";
        Berserker.skill_atk = "旋風斬";

        Mage.name = "魔法師";
        Mage.hp = 60;
        Mage.atk = 70;
        Mage.mp = 100;
        Mage.weapon = "法杖";
        Mage.sing = "火焰雨";
        Mage.skill_atk = "冰霜雨";

        Archer.ShoutMyName();

        Berserker.ShoutMyName();

        Mage.ShoutMyName();
    }
}
