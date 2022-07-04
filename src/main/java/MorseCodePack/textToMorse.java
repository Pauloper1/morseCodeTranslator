package MorseCodePack;

public class textToMorse {

    public static String MorseCode(String a){
        a = a.toLowerCase();
        String Mtext = "";
        for(char c : a.toCharArray())
        {
            switch (c){
                case 'a':
                    Mtext += ".-/";
                    break;
                case 'b':
                    Mtext += "-.../";
                    break;
                case 'c':
                    Mtext += "-.-./";
                    break;
                case 'd':
                    Mtext += "-../";
                    break;
                case 'e':
                    Mtext += "./";
                    break;
                case 'f':
                    Mtext += "..-./";
                    break;
                case 'g':
                    Mtext += "--./";
                    break;
                case 'h':
                    Mtext += "..../";
                    break;
                case 'i':
                    Mtext += "../";
                    break;
                case 'j':
                    Mtext += ".---/";
                    break;
                case 'k':
                    Mtext += "-.-/";
                    break;
                case 'l':
                    Mtext += ".-../";
                    break;
                case 'm':
                    Mtext += "--/";
                    break;
                case 'n':
                    Mtext += "-./";
                    break;
                case 'o':
                    Mtext += "---/";
                    break;
                case 'p':
                    Mtext += ".--./";
                    break;
                case 'q':
                    Mtext += "--.-/";
                    break;
                case 'r':
                    Mtext += ".-./";
                    break;
                case 's':
                    Mtext += ".../";
                    break;
                case 't':
                    Mtext += "-/";
                    break;
                case 'u':
                    Mtext += "..-/";
                    break;
                case 'v':
                    Mtext += "...-/";
                    break;
                case 'w':
                    Mtext += ".--/";
                    break;
                case 'x':
                    Mtext += "-..-/";
                    break;
                case 'y':
                    Mtext += "-.--/";
                    break;
                case 'z':
                    Mtext += "--../";
                    break;
                default:
                    Mtext += "No such code ";
                    break;
            }
        }
        return Mtext;
    };
    public static String Morse(String Text){
        String MorseText = "";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Text :");
//        Text = sc.nextLine();
        String[] token = Text.split(" ");
        for(String Words : token){
            MorseText += MorseCode(Words);
        }
//        System.out.println(MorseText);
        return MorseText;
    };
    public static void main(String args[]){

    }

}

