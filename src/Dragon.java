public class Dragon implements IMount {


    @Override
    public MountType getType() {
        return MountType.DRAGON;
    }

    @Override
    public int getDuration(int distance) {
        return (int) (distance*0.05);
    }
}
