public class Knight extends Character {

    public Knight(String name) {
        super(name);
    }

    @Override
    public CharacterType getTipo() {
        return CharacterType.KNIGHT;
    }
}
