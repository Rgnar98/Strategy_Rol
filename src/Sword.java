public class Sword implements IWeapon{

    @Override
    public WeaponType getType() {
        return WeaponType.SWORD;
    }

    @Override
    public int getDamage() {
        return 40;
    }
}
