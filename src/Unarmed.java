public class Unarmed implements IWeapon {

    @Override
    public WeaponType getType() {
        return WeaponType.UNARMED;
    }

    @Override
    public int getDamage() {
        return 5;
    }
}
