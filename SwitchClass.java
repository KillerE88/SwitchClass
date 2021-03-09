import java.util.Scanner;
public class SwitchClass {
    public static void switchLetter(char Letter) {
        switch (Letter)
        {
            case 'A':
            System.out.println(Letter + " is number 1");
            break;
            case 'B':
            System.out.println(Letter + " is number 2");
            break;
            case 'C':
            System.out.println(Letter + " is number 3");
            break;
            case 'D':
            System.out.println(Letter + " is number 4");
            break;
            case 'E':
            System.out.println(Letter + " is number 5");
            break;
            case 'F':
            System.out.println(Letter + " is number 6");
            break;
            case 'G':
            System.out.println(Letter + " is number 7");
            break;
            case 'H':
            System.out.println(Letter + " is number 8");
            break;
            case 'I':
            System.out.println(Letter + " is number 9");
            break;
            case 'J':
            System.out.println(Letter + " is number 10");
            break;
            case 'K':
            System.out.println(Letter + " is number 11");
            break;
            case 'L':
            System.out.println(Letter + " is number 12");
            break;
            case 'M':
            System.out.println(Letter + " is number 13");
            break;
            case 'N':
            System.out.println(Letter + " is number 14");
            break;
            case 'O':
            System.out.println(Letter + " is number 15");
            break;
            case 'P':
            System.out.println(Letter + " is number 16");
            break;
            case 'Q':
            System.out.println(Letter + " is number 17");
            break;
            case 'R':
            System.out.println(Letter + " is number 18");
            break;
            case 'S':
            System.out.println(Letter + " is number 19");
            break;
            case 'T':
            System.out.println(Letter + " is number 20");
            break;
            case 'U':
            System.out.println(Letter + " is number 21");
            break;
            case 'V':
            System.out.println(Letter + " is number 22");
            break;
            case 'W':
            System.out.println(Letter + " is number 23");
            break;
            case 'X':
            System.out.println(Letter + " is number 24");
            break;
            case 'Y':
            System.out.println(Letter + " is number 25");
            break;
            case 'Z':
            System.out.println(Letter + " is number 26");
            break;
            default:
            System.out.println("That's not a letter...");
        }
    }
    public static void switchNumber(int Number) {
        switch (Number)
        {
            case 1:
            System.out.println("A is with " + Number);
            break;
            case 2:
            System.out.println("B is with " + Number);
            break;
            case 3:
            System.out.println("C is with " + Number);
            break;
            case 4:
            System.out.println("D is with " + Number);
            break;
            case 5:
            System.out.println("E is with " + Number);
            break;
            case 6:
            System.out.println("F is with " + Number);
            break;
            case 7:
            System.out.println("G is with " + Number);
            break;
            case 8:
            System.out.println("H is with " + Number);
            break;
            case 9:
            System.out.println("I is with " + Number);
            break;
            case 10:
            System.out.println("J is with " + Number);
            break;
            case 11:
            System.out.println("K is with " + Number);
            break;
            case 12:
            System.out.println("L is with " + Number);
            break;
            case 13:
            System.out.println("M is with " + Number);
            break;
            case 14:
            System.out.println("N is with " + Number);
            break;
            case 15:
            System.out.println("O is with " + Number);
            break;
            case 16:
            System.out.println("P is with " + Number);
            break;
            case 17:
            System.out.println("Q is with " + Number);
            break;
            case 18:
            System.out.println("R is with " + Number);
            break;
            case 19:
            System.out.println("S is with " + Number);
            break;
            case 20:
            System.out.println("T is with " + Number);
            break;
            case 21:
            System.out.println("U is with " + Number);
            break;
            case 22:
            System.out.println("V is with " + Number);
            break;
            case 23:
            System.out.println("W is with " + Number);
            break;
            case 24:
            System.out.println("X is with " + Number);
            break;
            case 25:
            System.out.println("Y is with " + Number);
            break;
            case 26:
            System.out.println("Z is with " + Number);
            break;
            default:
            System.out.println("There is not a letter with " + Number);
        }

    }
    public static void main(String[] args) 
    {
        System.out.println("Welcome to our torture we had to create for class.... I just made it worse for myself....");

        char Letter;
        int Number;
        int Repeat;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1 (Letter edition) or 2 (Number edition) or 3 (Exit) :");
        Repeat = in.nextInt();

        while (Repeat != 3)
        {
            if (Repeat == 1)
            {
                System.out.println("Enter a letter: ");
                Letter = (in.next().toUpperCase()).charAt(0);
                switchLetter(Letter);
            }
            if(Repeat == 2)
            {
                System.out.println("Enter a number between 1 and 26 to find the letter with it: ");
                Number = in.nextInt();
                switchNumber(Number);
            }
            System.out.println("Would you like to play again enter 1 (Letters) or 2 (Numbers) or 3 (exit): ");
            Repeat = in.nextInt();
        }

        in.close();
    }
}
