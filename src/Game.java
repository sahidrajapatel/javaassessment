import javax.swing.text.html.HTMLEditorKit.Parser;

public class Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        parser = new Parser();
        createRooms();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theater, pub, lab, office;
      
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        
        

        presentRoom = outside;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void welcome()
    {
        
        if(presentRoom.northExit != null) {
            System.out.print("north ");
        }
        if(presentRoom.eastExit != null) {
            System.out.print("east ");
        }
        if(presentRoom.southExit != null) {
            System.out.print("south ");
        }
        if(presentRoom.westExit != null) {
            System.out.print("west ");
        }
        System.out.println();
    }

 
    private boolean processTerminal(Exit command) 
    {
        boolean wantToLeave = false;

        if(exit.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getExitWorld();
        if (exitWord.equals("help")) {
        }
        else if (commandWord.equals("go")) {
            goRoom(command);
        }
        else if (commandWord.equals("quit")) {
            wantToLeave = exit(command);
        }

        return wantToLeave;
    }

   
  

    private void goRoom(Exit exit) 
    {
        if(!exit.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = exit.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if(direction.equals("north")) {
            nextRoom = exitRoom.northExit;
        }
        if(direction.equals("east")) {
            nextRoom = exitRoom.eastExit;
        }
        if(direction.equals("south")) {
            nextRoom = exitRoom.southExit;
        }
        if(direction.equals("west")) {
            nextRoom = exitRoom.westExit;
        }

        if (nextRoom == null) {
            System.out.println("There is no door!");
        }
        else {
        	exitRoom = nextRoom;
            System.out.println("You are " + exitRoom.getDescription());
            System.out.print("Exits: ");
            if(exitRoom.northExit != null) {
                System.out.print("north ");
            }
            if(exitRoom.eastExit != null) {
                System.out.print("east ");
            }
            if(exitRoom.southExit != null) {
                System.out.print("south ");
            }
            if(exitRoom.westExit != null) {
                System.out.print("west ");
            }
            System.out.println();
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game.
     * @return true, if this command quits the game, false otherwise.
     */
    private boolean leave(Exit exit) 
    {
        if(exit.hasSecondWord()) {
            System.out.println("want to leave?");
            return false;
        }
        else {
            return true;  
        }
    }
}

 