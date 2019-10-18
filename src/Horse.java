public class Horse implements IMount {

    @Override
    public MountType getType() {
        return MountType.HORSE;
    }

    @Override
    public int getDuration(int distance) {
        return (int) (distance*0.015);
    }
}
