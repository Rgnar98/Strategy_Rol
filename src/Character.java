public abstract class Character {
    private String name;
    private IWeapon weapon;
    private IMount mount;

    public Character(String name) {
        this.name = name;
    }

    public abstract CharacterType getTipo();

    public void setWeapon(IWeapon w){
        this.weapon = w;
    }

    public void useWeapon(){
        System.out.println("====================================");
        System.out.println("Arma: "+weapon.getType());
        System.out.println("Daño infringido:"+weapon.getDamage());
        System.out.println("====================================");
    }

    public void setMount(IMount m){
        this.mount = m;
    }

    public void useMount(int distance, DirectionType directionType){
        System.out.println("====================================");
        System.out.println("Montura: "+mount.getType());
        System.out.println("Dirección viaje: "+directionType.toString());
        System.out.println("Duración viaje: "+ mount.getDuration(100)+" min");
        System.out.println("====================================");
    }

    public void info(){
        System.out.println("====================================");
        System.out.println("Tipo personaje: "+getTipo());
        System.out.println("Nombre: "+name);
        System.out.println("Arma: "+weapon.getType());
        System.out.println("Puntos de daño: "+weapon.getDamage());
        System.out.println("Montura: "+mount.getType());
        System.out.println("====================================");

    }

}
