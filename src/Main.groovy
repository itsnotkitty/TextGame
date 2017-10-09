Room room1 = new Room(
        roomId: 1,
        title: "Room of Doom",
        description: "Welcome to THE ROOM OF DOOOOOOM!"
)

Room room2 = new Room(
        roomId: 2,
        title: "Room of Boom",
        description: "Welcome to THE ROOM OF BOOM!"
)

Room room3 = new Room(
        roomId: 3,
        title: "Room of Salvation",
        description: "Welcome to the Room of Salvation"
)

Room room4 = new Room(
        roomId: 4,
        title: "Room of Bloom",
        description: "Welcome to THE ROOM OF BLOOM!"
)

Room room5 = new Room(
        roomId: 5,
        title: "The End of all things",
        description: "Welcome to the End of everything as we know it, sad times ahead. Turn Back"
)

Map<Integer,Room> rooms = [1:room1,2:room2,3:room3,4:room4,5:room5]

Boolean keepPlaying = true
while (keepPlaying) {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
print "Enter room number: "
def userInput = br.readLine()
    if (userInput == 'q') {
        println "quitting"
        keepPlaying = false
    } else if (!userInput) {
        println "please enter a number"
    } else if (!userInput.isInteger()) {
        println "I can't do that dave"
    } else {
        Room room = rooms.get(userInput as Integer)
        if (room) {
            println "welcome to " + room.title
            } else {
                println "You find yourself in a void"
            }
        }
    }

