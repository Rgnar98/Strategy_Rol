public class Wizard extends Character {

    public Wizard(String name) {
        super(name);
    }

    @Override
    public CharacterType getTipo() {
        return CharacterType.WIZARD;
    }
}
