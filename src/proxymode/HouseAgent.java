package proxymode;

public class HouseAgent implements IRoom {

    private final IRoom mRoom;

    public HouseAgent(IRoom room) {
        this.mRoom = room;
    }

    @Override
    public void findHouse() {
        mRoom.findHouse();
    }

    @Override
    public void watchHouse() {
        mRoom.watchHouse();
    }

    @Override
    public void rent() {
        mRoom.rent();
    }

    @Override
    public void finish() {
        mRoom.finish();
    }
}
