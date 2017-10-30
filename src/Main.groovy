Room room1 = new Room(
        roomId: 1,
        title: "Room of Doom",
        description: "A sign lay in the middle of the room, the sign belays your doom ",
)

Room room2 = new Room(
        roomId: 2,
        title: "Room of Boom",
        description: "You smell gasoline, be careful with that torch!",
)

Room room3 = new Room(
        roomId: 3,
        title: "Room of Salvation",
        description: "The room is empty save for a single font of water",
)

Room room4 = new Room(
        roomId: 4,
        title: "Room of Bloom",
        description: "a field of flowers lay before you. No one how they grow down here in the dark",
)

Room room5 = new Room(
        roomId: 5,
        title: "The End of all things",
        description: "sad times ahead. Turn Back",
)

room1.connections = ["s":room2]
room2.connections = ["n":room1,"w":room3]
room3.connections = ["e":room2,"n":room4]
room4.connections = ["s":room3,"w":room5]
room5.connections = ["e":room4]



Boolean keepPlaying = true
Room currentRoom = room1

while (keepPlaying) {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

println "Welcome to " + currentRoom.title

println currentRoom.description

println "Doors are located to the" + currentRoom.connections.keySet()
def userInput = br.readLine()
    if (userInput == 'q') {
        println "quitting"
        keepPlaying = false
    } else if (!userInput) {
        println "All you can find is a blank wall, look else where!"
    } else {
        Room room = currentRoom.connections.get(userInput)
        if (room) {
            currentRoom = room
            } else {
                println "This action is unavailable"
            }
        }
    }

