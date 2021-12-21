public class game {
    public static void main(String[] args) {
        Game_role_setting Archer = new Game_role_setting("弓箭手", 100, 50, 20, "腐蝕箭", "集中", "連續射擊");
        Game_role_setting Berserker = new Game_role_setting("狂戰士", 150, 60, 10, "戰斧", "衝鋒", "旋風斬");
        Game_role_setting Mage = new Game_role_setting("魔法師", 60, 70, 100, "法杖", "火焰雨", "冰霜雨");

        Archer.ShoutMyName();//1222
        Berserker.ShoutMyName();
        Mage.ShoutMyName();//000000hoooong
    }
}
