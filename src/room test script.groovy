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
        title: "End of all things",
        description: "Welcome to the End of everything as we know it, sad times ahead. Turn Back"
)

Map<String,Room> [room1:1,room2:2,room3:3,room4:4,room5:5]

Boolean keepPlaying = true
while (keepPlaying) (
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
    }
)
