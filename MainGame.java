import java.util.Scanner;
public class MainGame {
    // System.out.print();
    // System.out.println();
    public static void main(String[] args) {
        // add scanner for the game
        Scanner game = new Scanner(System.in);
        // make the game fall asleep for as many milliseconds
        try {
            // to sleep 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
        System.out.println("Hello...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Welcome to \"Survive the Night: RE-ENLIGHTENED\" i have a question do you wish to change a man's life...?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Oh you can't type anything else other than \"Yes\" or \"No\"...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Oh well let's just get to the point...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println("Would you like to start the game?\n");
        String gameStart = game.nextLine();
        // make if statement so game choices can be done
        if(gameStart.equalsIgnoreCase("yes")) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("\nNarrator: It was a beautiful day outside like normal and on that day you lost everything you had your family is gone and your wife left you.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You wake up alone...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Of course...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Why did it have to happen on a beautiful day like today...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: But that's besides the point.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You have to change this man's ending and give him a happy life.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Anyways you go to the front door of your house and see a newspaper on the floor in front of the door and it came through the slit of the mail door.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You pick it up and flip through the pages and find that a local pizzeria at in your town needs a night guard to watch over animatronics.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You decide to go get dressed and go to the pizzeria.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Some time later....");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You see the building is quite awfully large there are two windows at the edge of the building on each side that displays an arrange of animatronics.");
            try {
                Thread.sleep(4750);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: The left side showcases Bonnie and Foxy.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: On the right side it showcases Freddy and Chica.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Above the door is a platform showcasing the animatronics again giving you a grand welcoming.");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You arrive at the pizzeria and approach the door and take your first step in the pizzeria in a while.");
            try {
                Thread.sleep(2250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You approach a guy who is minding his business and he looks at you.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Mark: Hello, how may I help you sir?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("You: Um, yeah I was wanting to see if i could apply to be a night guard?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Mark: Oh, you should have just said so but yeah we could use someone like you.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("A while pass, Mark gets done interviewing you.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Mark: Alright well you start at 12 and leave fully at 7 so no leaving early capiche?");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("You: Yes sir.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Mark: Oh and here's your uniform.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Mark hands you your uniform.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("You: Thanks.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Guide: There will be multiple endings so do what you need to get these endings.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You head out the door and head home.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You enter your house and close the door.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Now what will you do you have the option to watch TV or just go to sleep and fast forward to the night section.");
            System.out.println("Choices: \nWatch TV \nGo to sleep\n");
            String firstChoice = game.nextLine();
            if (firstChoice.equalsIgnoreCase("watch tv")){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.print("\nNarrator: You go to the couch and turn on the TV and start to watch some shows.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: Some time pass and you get hungry.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: You get up and enter the kitchen and grab something to eat.");
                try {
                    Thread.sleep(2700);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: After you get done eating you go to your room and pass out until your night shift.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("A few hours pass...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: You wake up, get your night guard uniform on and you head out to work.");
            } else if (firstChoice.equalsIgnoreCase("Go to sleep")) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("\nNarrator: You go to your room and pass out until your night shift.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("A few hours pass...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: You wake up, get your night guard uniform on and you head out to work.");
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You walk up to the building, it's lights are all off except for the sign and the exterior lights.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You walk up to the doors and open them and you enter the building and close the doors behind you.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: It's pretty dark and the only light you can see is from outside and you can see a note, keys and a flashlight on the front desk.");
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You approach the paper, and pick up the keys and flashlight, turn it on and you start to read the note.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Hey I Realized that I didn't give you, your set of keys to lock the door so after you are done reading this note can you lock the door thanks.");
            try {
                Thread.sleep(4750);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Now David, what I need to tell you is your office is at the back of the pizzeria you only have a big doorway in front of your desk and a hallway to your left.");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: I will leave you notes here every night but for now just know that every night the animatronics will get more and more aggressive every night so to say.");
            try {
                Thread.sleep(4900);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: But for tonight just know Bonnie and maybe Chica will be active now I will say this you might be wondering how I know...");
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Well let's just say some other nightguards who came to work here everytime the animatronics would power on one by one every night once a new person came in at night.");
            try {
                Thread.sleep(5250);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: And let's just say I also decided to be my own security guard on their days off and it's horrible so I wish you luck.");
            try {
                Thread.sleep(4700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("test");
        }
    }
}