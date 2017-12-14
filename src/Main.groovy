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
        name: "Eternal Demon",
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

Boolean keepPlaying = true
Room currentRoom = room1
Integer healthPool = 100
// possible place to set max health integer, or is there a way to set it when I defined the health

while (keepPlaying) {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

println "Welcome to " + currentRoom.title

println currentRoom.description

println "Hp " + healthPool

println "In the center of the room you see the " + currentRoom.monster.name

println "Doors are located to the" + currentRoom.connections.keySet()
def userInput = br.readLine()
    println "quitting"
    if (userInput == 'q') {
        keepPlaying = false
    } else if (!userInput) {
        println "All you can find is a blank wall, look else where!"
    } else {
       /* it is at this point that I intended to get a random "hit" value to roll but was unable to figure out random numbers
       if currentRoom.monster.hostile = true*/
        Room room = currentRoom.connections.get(userInput)
        if (room) {
            currentRoom = room
            } /* following this part i inteded to place an if "hit" did jnjot equal odd or hit( % =/= 2)
        damage = randomIntegerList * currentRoom.monster.multiplier
        println currentRoom.monster.name + "hit you for " + (healthPool - damage) followed by an if statement of (healthpool == 0)
         I know I would have to set a way to make sure the health stays set at the current number rahter than reverting to 100 every room change
         {keepPlaying = false} followed by an else if
         statement of hit( % == 2) prntln "you regenerated health" + (healthPool + Damage) */    else {
                println "This action is unavailable"
            }
        }
    }

