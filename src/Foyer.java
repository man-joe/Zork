public class Foyer extends Room{

    public Foyer(){
        super.setRoomNum(1);
        super.setMsg("Welcome to the Foyer!\nThere is a dead Scorpion...\nYou can go north");
        super.addDirRoomChoices("n");
    }

    public void setMsg(String msg){
        super.setMsg(super.getMsg() + " or back(b)" + msg);
    }

    public void setPrevRoom(Room room) {
        super.setPrevRoom(room);
    }

    public int goNextRoom(String nextRoomChoice) {
        int nextRoomNum = 0;
        if(super.getDirRoomChoice().contains(nextRoomChoice)){
            if(nextRoomChoice.equalsIgnoreCase("n"))
                nextRoomNum = 2;
        } else if(nextRoomChoice.equalsIgnoreCase("b")){
            nextRoomNum = super.getPrevRoom().getRoomNum();
        }
        return nextRoomNum;
    }
}
