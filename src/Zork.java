/*
Zork is a famous text-only adventure game for the computer.
Users would type commands and navigate the rooms of a castle.

Write an application that asks the user what direction they wish to travel in. Once they tell you the direction,
move them to the next room and tell them what is in it and what direction the other exits are.

When you develop your program you must include each room in its own method. (Reminder: Creating Methods).
The only role of the main method is to get input from the user and direct the user to the appropriate room.

Your program shall allow the user to move from one room back and forth to any other connected room.

You program should allow the user to find the secret room only 25% of the time. However, once they find
the secret room they can always find it.

When the user exits the house or quits there is a 25% chance they will be followed by a ghost.
Let them know when they are being followed.

Also let the user know how many rooms they visited after they exit or quit.
 */

import java.util.HashMap;
import java.util.Scanner;

public class Zork {
    Scanner sc;
    private int numRoomVisited;
    boolean secretFound = false;
    HashMap<Integer, Room> mapTraversed;
    HashMap<Integer, Room> wholeMap;
    String userInput;
    int roomCounter = 0;
    int currRoomNum = 0;

    private void addWholeMap(HashMap<Integer, Room> map){
        map.put(1, new Foyer());
        map.put(2, new FrontRoom());
        map.put(3, new Library());
    }

    public Zork(){
        sc = new Scanner(System.in);
        numRoomVisited = 0;
        mapTraversed = new HashMap<>();
        wholeMap = new HashMap<>();
        addWholeMap(wholeMap);

        System.out.println("Welcome to Zork!");
        System.out.println("Would you like to play? (y/n)");
        userInput = sc.nextLine();

        if(userInput.equalsIgnoreCase("y")) {
            //First room is Foyer
            mapTraversed.get(roomCounter).getMsg();
            roomCounter++;
            currRoomNum = 1;
            int tempRoomNum = 0;
            mapTraversed.put(1,wholeMap.get(1));

            //Moving on to other rooms
            while (true) {
                System.out.print("Enter q to quit or a direction(n/s/w/e): ");
                userInput = sc.nextLine();
                if(userInput.equalsIgnoreCase("q"))
                    break;
                else {
                    currRoomNum = mapTraversed.get(currRoomNum).getRoomNum();
                    System.out.println("I am in room: " + currRoomNum);
                    if(!roomVisited(currRoomNum)) {// If you haven't visited this room yet...
                        roomCounter++;
                        tempRoomNum = currRoomNum;
                        currRoomNum = mapTraversed.get(currRoomNum).goNextRoom(userInput); //
                        if(currRoomNum == 0)
                            break;
                        mapTraversed.put(currRoomNum,wholeMap.get(currRoomNum));
                        mapTraversed.get(currRoomNum).setPrevRoom(wholeMap.get(tempRoomNum));
                    }
                    //Checks if room has been visited before
//                    if(roomVisited(mapTraversed.get(currRoomNum))) {
//
//                    }
                }
            }
        }
        System.out.println("Thanks for playing Zork!");
    }

//    public void goNextRoom(){
//        if(userInput.equalsIgnoreCase())
//    }

    //Check to see if you have visited the room
    public boolean roomVisited (int currRoom){
        for(int i : mapTraversed.keySet())
            if(mapTraversed.get(i).getRoomNum() == currRoom)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Zork game = new Zork();
    }
}
