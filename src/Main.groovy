Person soothSayer = new Person(
        name: "Old SoothSayer",
        healthPool: 10,
        hostile: false,
        multiplier: 10,
)

Person sleepingDog = new Person(
        name: "Sleeping Dog",
        healthPool: 20,
        hostile: true,
        multiplier: 2,
)

Person manEatingPlant = new Person(
        name: "Voracious Man Eating Pant",
        healthPool: 50,
        hostile: true,
        multiplier: 4,
)

Person bigBoss = new Person(
        name: "the Eternal Demon",
        healthPool: 100,
        hostile: true,
        multiplier: 6,
)

Person fairy = new Person(
        name: "Kindly Fairy",
        healthPool: 1,
        hostile: false,
        multiplier: 10,
)

Room room1 = new Room(
        roomId: 1,
        title: "Room of Doom",
        description: "A sign lay in the middle of the room, the sign belays your doom ",
        monster: soothSayer,
)

Room room2 = new Room(
        roomId: 2,
        title: "Room of Boom",
        description: "You smell gasoline, be careful with that torch!",
        monster: sleepingDog,
)

Room room3 = new Room(
        roomId: 3,
        title: "Room of Salvation",
        description: "The room is empty save for a single font of water",
        monster: manEatingPlant,
)

Room room4 = new Room(
        roomId: 4,
        title: "Room of Bloom",
        description: "a field of flowers lay before you. No one how they grow down here in the dark",
        monster: fairy,
)

Room room5 = new Room(
        roomId: 5,
        title: "The End of all things",
        description: "sad times ahead. Turn Back",
        monster: bigBoss,
)

room1.connections = ["s":room2]
room2.connections = ["n":room1,"w":room3]
room3.connections = ["e":room2,"n":room4]
room4.connections = ["s":room3,"w":room5]
room5.connections = ["e":room4]



import java.util.Random
Random rand = new Random()
int max = 10
def randomIntegerList = []
(1..10).each {
    randomIntegerList << rand.nextInt(max) + 1 //This creates a random number between 1 and 10
}
println randomIntegerList


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

