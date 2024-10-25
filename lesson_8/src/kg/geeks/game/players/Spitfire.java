package kg.geeks.game.players;

public class Spitfire extends Hero {
    public Spitfire(String name, int health, int damage, SuperAbility ability) {
        super(name, health, damage, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                boss.setHealth(boss.getHealth() - 80);
                break;

            }
        }
    }
}
