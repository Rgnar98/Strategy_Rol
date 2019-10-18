public class Mountless implements IMount{

    @Override
    public MountType getType() {

        return MountType.MOUNTLESS;
    }

    @Override
    public int getDuration(int distance) {
        return (int) (distance*0.5);
    }
}
