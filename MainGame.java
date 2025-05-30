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
                System.out.println("\nNarrator: Some time pass and you get hungry.");
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
            System.out.println("Note: From what I gathered the reason why they move is probably from the security modes on them the Faz Bear Entertainment put on them and to also not have the joints lock when performing.");
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
            System.out.println("What will you do? \nArcade 1 \nArcade 2 \nDinning Area\n");
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
                    System.out.println("\nNarrator: You go into the first arcade.");
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
                    System.out.println("Where will you go next? \nEntrance \nParty Room 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Arcade 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You go to the second arcade and look around.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: All arcades are off except for one.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance \nParty Room 2 \nGo to Arcade Machine\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Go Back")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You leave the Arcade alone.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: It's probably better to not play the arcade that you didn't pay to play with either way.");
                    try {
                        Thread.sleep(4200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("What will you do next? \nEntrance \nParty Room 2 \nGo to Arcade Machine\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Go to Arcade Machine")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You go to the arcade machine.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: It seems like it's waiting for someone to play.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("What will you do next? \nGo Back \nPlay Arcade Game\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Play Arcade Game")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: Welcome to Foxy Runner.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Press play to start.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("What will you do next? \nGo Back \nPlay\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Play")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: Glad to see you actually played the game.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: So Foxy needs to get to the children at the end of 10 rooms there is only 3 levels good luck.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Run to the children. \nRun 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 3\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 3")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 3");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 4\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 4")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 4");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 5\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 5")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 5");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 6\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 6")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 6");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 7\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 7")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 7");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 8\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 8")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 8");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 9\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 9")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 9");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 10\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 10")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 10");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Congratulations you made it the the children");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Round 2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Run to the children. \nRun 11\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 11")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 11");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 12\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 12")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 12");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 13\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 13")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 13");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 14\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 14")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 14");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 15\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 15")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 15");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 16 \nFlip Lever 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 16")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 16");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 17\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 17")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 17");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 18\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 18")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 18");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 19\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 19")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 19");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 20\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 20")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 20");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Congratulations you made it the the children");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Round 3");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Run to the children. \nRun 21\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 21")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 21");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 22\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 22")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 22");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 23\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 24")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 24");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 25\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 25")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 25");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 26\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 26")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 26");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 27\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 27")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 27");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 28\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 28")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 28");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 29\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 29")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 29");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }

                    System.out.println("Run to the children. \nRun 30\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Run 30")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You run forward you are now in room 30");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: Congratulations you made it the the children");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: You have come across a door that leads into an office.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("What will you do? \nLeave Arcade \nEnter office\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Leave Arcade")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You leave the arcade.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance \nParty Room 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Enter Office")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nGame: You enter the office and you see a security guard.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Game: You approach him and bite his head killing him.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You leave the arcade game.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: Upon leaving you see the screen flash a bright light saying \"THANK YOU FOR SAVING ME.\"");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance \nParty Room 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Party Room 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter party room 1 all of the chairs are neatly stacked on the table with the table cloth draping over the edges of the tables.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: There is nothing here for you.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nArcade 1 \nDinning Area \nBack Hall 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Party Room 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter party room 2 all of the chairs are neatly stacked on the table with the table cloth draping over the edges of the tables.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: There is nothing here for you.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nArcade 2 \nDinning Area \nBack Hall 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Party Room 3")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter party room 3 all of the chairs are neatly stacked on the table with the table cloth draping over the edges of the tables.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: There is nothing here for you.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nBack Hall 3\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Party Room 4")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter party room 4 all of the chairs are neatly stacked on the table with the table cloth draping over the edges of the tables.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: There is nothing here for you.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nBack Hall 4\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Dinning Area")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the dining area and walk around and see a stage with 4 animatronics on it them being Freddy, Bonnie, Chica, and Foxy");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You see that they are deactivated.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance \nParty Room 1 \nParty Room 2 \nParty Room 3 \nParty Room 4 \nKitchen Hall \nBathroom Hall 1 \nBathroom Hall 2 \nLoading Dock Hall\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Bathroom Hall 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall.");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nBoys Restroom 1 \nGirls Restroom 1 \nBack Hall 1 \nBack Hall 3\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Back Hall 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 1 \nParty Room 1 \nStorage Room 1 \nAnimatronic Display 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Storage Room 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the storage room and see Thanksgiving and Birthday decorations.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBack Hall 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Animatronic Display 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the display and are behind the glass that looks outside with Bonnie and Foxy.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBack Hall 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Back Hall 3")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 1 \nParty Room 3\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Boys Restroom 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the boys restroom and see the stall doors are closed.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Girls Restroom 1")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the girls restroom and see the stall doors are closed.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 1\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Bathroom Hall 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nBoys Restroom \nGirls Restroom \nBack Hall 2 \nBack Hall 4\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Back Hall 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 2 \nStorage Room 2 \nParty Room 2 \nAnimatronic Display 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Storage Room 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the storage room and see that there are Halloween and Christmas decorations inside.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBack Hall 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Animatronic Display 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the display and are behind the glass that looks outside with Freddy and Chica.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBack Hall 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Back Hall 4")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 2 \nParty Room 4\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Boys Restroom 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the boys restroom and see the stall doors are closed.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Girls Restroom 2")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the girls restroom and see the stall doors are closed.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nBathroom Hall 2\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Kitchen Hall")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Kitchen hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nKitchen \nParts & Service\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Kitchen")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Kitchen.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen Hall \nManagement Hall \nFreezer \nEmployee Bathroom \nJanitor Closet\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Freezer")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Freezer and it's pretty cold and you see a lot of raw meat and boxes filled with all kinds of frozen food.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Employee Bathroom")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the employee bathroom and see it's pretty relatively clean for a bathroom and the stall doors are closed.");
                    try {
                        Thread.sleep(4200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Janitor Closet")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Janitor closet and see Janitor supplies all put away and some scattered on the ground.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Management Hall")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nYou enter the Management hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen \nManagers Office \nRoof Stairwell\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Managers Office")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Managers Office and see that there are just papers on his desk.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: But over all it is neat and clean.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nManagement Hall\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Roof Stairwell")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the stairwell and go up the stairs and try the door.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: But it's locked shut.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nManagement Hall\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Loading Dock Hall")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Loading Dock hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nDinning Area \nLoading Dock \nParts & Service\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Loading Dock")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Loading Dock and see an arrangement of crates and boxes.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nLoading Dock Hall \nEmployee Lounge\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Employee Lounge")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Employee lounge and see it is dirty and there are left over pizza boxes left out.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nOffice Hall \nEmployee Locker Room\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Employee Locker Room")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the locker room and see some lockers are open.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEmployee Lounge\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Office Hall")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Office hall.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEmployee Lounge \nSewer Maintenance \nGo to Office\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Sewer Maintenance")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter the Sewer maintenance and see pipes for water and gas.");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You also see a grate on the ground that leads into the actual sewers but you can't open it.");
                    try {
                        Thread.sleep(3570);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nOffice Hall\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Parts & Service") || secChoice.equalsIgnoreCase("Parts and Service")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You enter Parts & Service and you see a bunch of shelves that have animatronic parts.");
                    try {
                        Thread.sleep(3525);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: But on one of the tables you see a racoon animatronic deactivated on the table.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nKitchen Hall \nLoading Dock Hall \nGo to Office\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Entrance")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You go back into the entrance and nothing has changed.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("What will you do? \nArcade 1 \nArcade 2 \nDinning Area \nGo Outside\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Go Outside")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You go back outside and see nothing just cars passing by on the main road and street lights gleaming in the night.");
                    try {
                        Thread.sleep(4255);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Where will you go next? \nEntrance\n");
                    secChoice = game.nextLine();
                }

                if (secChoice.equalsIgnoreCase("Go to Office")) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("\nNarrator: You decide to go to your office.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: Your office is pretty clean and you have a camera monitor.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    System.out.println("Narrator: You get behind the desk and start looking through the cameras.");
                    break loopOne;
                }
            }
            System.out.println("Narrator: You are scanning through the cameras looking for anything suspicious");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Upon checking the dinning area camera you see bonnie is no longer on the stage.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: But just looking at the stage not moving but occasionally twitching his head.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: He then moves and the camera goes static.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You go to the other camera's to find Bonnie eventually you see Bonnie is in the Loading Dock hall");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: He seems to be approaching the Loading Dock doors, he opens them and goes inside.");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Bonnie continues to progress towards you, getting closer and closer every second that passes.");
            try {
                Thread.sleep(2750);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: You decide to get out of the camera's and look over to your left and you see the door is opening at the end of the hall.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("Narrator: Inside the Employees lounge you can see Bonnie enter through the door and slowly approach your office door.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println("What will you do? \nClose Office Door \nKeep Door Open\n");
            String thirdChoice = game.nextLine();
            if(thirdChoice.equalsIgnoreCase("Keep Door Open")) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("\nNarrator: You decide to keep the door open and Bonnie comes into the office and grabs you by the neck.");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Bonnie: Seems like we have an intruder on the premises.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("Narrator: Bonnie takes you to an empty suit in Parts & Service and he stuffs you inside the suit and you start to get crushed by the endoskeleton and outer suit casing and you die.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("GAME OVER");
                return;
            }
            if (thirdChoice.equalsIgnoreCase("Close Office Door")) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                System.out.println("\nNarrator: You close the Office door and Bonnie bangs on the door");
            }
        }
    }
}
