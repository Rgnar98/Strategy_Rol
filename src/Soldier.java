public class Soldier extends Character{

    public Soldier(String name) {
        super(name);
    }

    public CharacterType getTipo(){
        return CharacterType.SOLDIER;
    }
}
