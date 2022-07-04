import static MorseCodePack.morseToTextClass.ToText;// ToText() -> Converts Morse code to text.
import static MorseCodePack.textToMorse.Morse;// Morse() -> Converts Text to Morse code.
import static AudioPack.AudioPack.playMusic;// playMusic() -> Plays the required Audio.

import java.util.*;


public class MorseTranslator extends Thread{

    //Storing the paths of audio files in variables.
    static String dot = "/home/kruger/IdeaProjects/morseTranslator/src/main/java/Audios/dot.wav";
    static String dash = "/home/kruger/IdeaProjects/morseTranslator/src/main/java/Audios/dash.wav";
    public static void main(String [] args) throws InterruptedException {
        //User entering the choice whether to translate from
        //Morse Code to Text
        //Or
        //Text to Morse Code.

        Scanner sc = new Scanner(System.in);
        System.out.println("Morse code to text -> 1\nText to Morse code -> 2\n");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1: {
                String morseCode;
                System.out.println("Enter the code : ");
                morseCode = sc.nextLine();
                String text = ToText(morseCode);
                System.out.printf("Text : %s\n", text);
                break;
            }

            case 2:{
                String text;
                System.out.println("Enter the text :\n");
                text = sc.nextLine();
                String morse = Morse(text);
                System.out.printf("Morse Code : %s\n",morse);

                //Asking the user whether to play the audio form of morse code or not.
                System.out.println("Need audio for the morse code ?y/n");
                String needAudio = sc.nextLine();
                if(needAudio.equals("y")){
//                    doubt: why needAudio == "y" doesn't work?
                    for(int i = 0;i < morse.length();i++){
                        if(morse.charAt(i) == '.'){
                            playMusic(dot);
                            Thread.sleep(300);
                        }
                        else if (morse.charAt(i) == '-'){
                            playMusic(dash);
                            Thread.sleep(300);
                        }
                        else if (morse.charAt(i) == '/'){
//                            playMusic(dash);
                            Thread.sleep(500);
                        }
                    }
                }
                break;
            }

        }
    }

}
