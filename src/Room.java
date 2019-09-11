import java.util.ArrayList;

public class Room {
    private int roomNum;
    private Room prevRoom;
    private String msg;
    private ArrayList<String> dirRoomChoice;

    Room(){
        msg = "";
        prevRoom = null;
        roomNum = 0;
        dirRoomChoice = new ArrayList<>();
    }

    //Setters
    public void setRoomNum(int roomNum) { this.roomNum = roomNum; }

    public void setPrevRoom(Room prevRoom) { this.prevRoom = prevRoom; }

    public void setMsg(String msg) { this.msg = msg; }

    //Sets Room choices
    public void addDirRoomChoices(String dirChoice) {
        dirRoomChoice.add(dirChoice);
    }

    public int goNextRoom(String nextRoomChoice) {
        int nextRoomNum = 0;

        return nextRoomNum;
    }

    public boolean hasPrevRoom(){
        return prevRoom != null ? true: false;
    }

    //Getters
    public int getRoomNum(){ return roomNum; }

    public Room getPrevRoom() { return prevRoom; }

    public String getMsg() { return msg; }

    public ArrayList<String> getDirRoomChoice() { return dirRoomChoice; }
}
