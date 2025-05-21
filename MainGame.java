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
                Thread.sleep(3000);
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
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You pick it up and flip through the pages and find that a local pizzeria at in your town needs a night guard to watch over animatronics.");
            try {
                Thread.sleep(3000);
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
            System.out.println("Narrator: You see two windows that display animatronics on both sides of the building.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: On the left the windows showcase Bonnie and Foxy.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: On the right the windows showcase Freddy and Chica.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Above the front entrance is a roof and it showcases the animatronics to you again giving you a grand welcoming.");
            try {
                Thread.sleep(4500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You approach the door and take your first step in the pizzeria in a while.");
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
            System.out.println("Narrator: The building is very dark and the only light you can see is from the light outside.");
            try {
                Thread.sleep(2600);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: The light from outside shines on the front desk with a note, keys and a flashlight.");
            try {
                Thread.sleep(2450);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You approach the desk and pick up the keys and flashlight.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You turn on the flashlight and start to read the note.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Hey David, I forgot to give you, your set of keys to the place so when you are done reading this note lock the doors thanks.");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: So the animatronics will be active mainly Bonnie and maybe Chica tonight.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Before you get on my case about how would I know and why do they move around.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: I had some nightguards before you and they told me they moved around when they came in the building and entered the office, \nI also became a night guard on their days off to see what they were talking about and they do move.");
            try {
                Thread.sleep(4100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: From what I gathered the reason why they move is probably from the security modes on them the Faz Bear Entertainment put on them and to also not ave the joints lock when performing.");
            try {
                Thread.sleep(4955);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Now I'm gonna let you get to your office now, and to tell you it's on the opposite side of the pizzeria.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: It has a big doorway that is in front of your desk and leads into parts & services.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: On the left is a hallway with a door at the end and the employee's lounge beyond the door.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Note: Alright I will let you go now talk to you tomorrow.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("What will you do? \nArcade 1 \nArcade 2 \nParty Room 1 \nParty Room 2 \nParty Room 3 \nParty Room 4 \nDinning Area \nKitchen \nLoading Dock \nParts & Service \nGo to Office\n");
            String secChoice = game.nextLine();
            // make a boolean condition true so the thread.sleep will work in a loop
            boolean condition = true;
            // name the while loop so you can choose which one to break
            // make a while loop
            loopOne: while(condition) {
                if (secChoice.equalsIgnoreCase("Arcade 1")){
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You go into the arcade on your left.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You see arcades ranging from ghost eater, space intruders, ect.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: All arcades are unplugged and off.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance \nArcade 2 \nParty Room 1 \nParty Room 2 \nParty Room 3 \nParty Room 4 \nDinning Area \nKitchen \nLoading Dock \nParts & Service \nGo to Office\n");
                } else if (secChoice.equalsIgnoreCase("Arcade 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("test");
                } else if (secChoice.equalsIgnoreCase("Party Room 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Party Room 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Party Room 3")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Party Room 4")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Dinning Area")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Kitchen")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Loading Dock")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Parts & Service")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                } else if (secChoice.equalsIgnoreCase("Entrance")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                } else if (secChoice.equalsIgnoreCase("Go to Office")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nYou decide to go to find your office.");
                    break loopOne;
                }
                System.out.println("test");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

            }
        }
    }
}