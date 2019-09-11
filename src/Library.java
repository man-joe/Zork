public class Library extends Room {

    public Library(){
        super.setRoomNum(3);
        super.setMsg("Welcome to the Library!\nThere is are spiders...\nYou can go east or north");
        super.addDirRoomChoices("e");
        super.addDirRoomChoices("n");
    }

    public void setMsg(String msg){
        super.setMsg(super.getMsg() + " or back" + msg);
    }

    public void setPrevRoom(Room room) {
        super.setPrevRoom(room);
    }
}
