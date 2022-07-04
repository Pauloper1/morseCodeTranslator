
package MorseCodePack;
public class morseToTextClass {
    public static char morseToText(String letters){
        char letter = '\0';
        switch (letters){
            case ".-":
                letter = 'a';
                break;
            case "-...":
                letter = 'b';
                break;
            case "-.-.":
                letter = 'c';
                break;
            case "-..":
                letter = 'd';
                break;
            case "e":
                letter = 'e';
                break;
            case "..-.":
                letter = 'f';
                break;
            case "--.":
                letter = 'g';
                break;
            case "....":
                letter = 'h';
                break;
            case "..":
                letter = 'i';
                break;
            case ".---":
                letter = 'j';
                break;
            case "-.-":
                letter = 'k';
                break;
            case ".-..":
                letter = 'l';
                break;
            case "--":
                letter = 'm';
                break;
            case "-.":
                letter = 'n';
                break;
            case "---":
                letter = 'o';
                break;
            case ".--.":
                letter = 'p';
                break;
            case "--.-":
                letter = 'q';
                break;
            case ".-.":
                letter = 'r';
                break;
            case "...":
                letter = 's';
                break;
            case "-":
                letter = 't';
                break;
            case "..-":
                letter = 'u';
                break;
            case "...-":
                letter = 'v';
                break;
            case ".--":
                letter = 'w';
                break;
            case "-..-":
                letter = 'x';
                break;
            case "-.--":
                letter = 'y';
                break;
            case "--..":
                letter = 'z';
                break;
        }
        return letter;
    }
    public static String ToText(String Morse){
        String Text = "";
//        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter a morse code : ");
//        Morse = sc.nextLine();
        String[] token = Morse.split("/");
        for(String words : token){
            Text +=  morseToText(words);
        }
        return Text;
    }
    public static void main(String[] args){
//        ToText();
    }

}
