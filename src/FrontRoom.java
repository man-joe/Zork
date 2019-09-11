public class FrontRoom extends Room {

    public FrontRoom(){
        super.setRoomNum(2);
        super.setMsg("Welcome to the Front Room!\nThere is a piano...\nYou can go east or west");
        super.addDirRoomChoices("e");
        super.addDirRoomChoices("w");
    }

    public void setMsg(String msg){
        super.setMsg(super.getMsg() + " or back" + msg);
    }

    public void setPrevRoom(Room room) {
        super.setPrevRoom(room);
    }
}

