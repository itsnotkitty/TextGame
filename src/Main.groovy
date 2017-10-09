Room room1 = new Room(
        roomId: 1,
        title: "Room of Doom",
        description: "A sign lay in the middle of the room, the sign belays your doom "
)

Room room2 = new Room(
        roomId: 2,
        title: "Room of Boom",
        description: "You smell gasoline, be careful with that torch!"
)

Room room3 = new Room(
        roomId: 3,
        title: "Room of Salvation",
        description: "The room is empty save for a single font of water"
)

Room room4 = new Room(
        roomId: 4,
        title: "Room of Bloom",
        description: "a field of flowers lay before you. No one how they grow down here in the dark"
)

Room room5 = new Room(
        roomId: 5,
        title: "The End of all things",
        description: "sad times ahead. Turn Back"
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

