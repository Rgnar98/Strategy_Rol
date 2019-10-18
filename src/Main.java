
public class Main {

    public static void main(String args[]){
        Character character = new Knight("Mario");
        character.setWeapon(new Sword());
        character.setMount(new Horse());
        character.info();
        character.useMount(100, DirectionType.NORTH);
        character.useWeapon();
    }





}
