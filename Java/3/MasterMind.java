import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class MasterMind {
    private char[][] codeArr;
    private char[][] guessArr;
    public MasterMind(String code) {
        codeArr = new char[13][4];
        guessArr = new char[13][4];
        for (int i = 0; i < 4; i++) {
            codeArr[0][i] = code.charAt(i);
            guessArr[0][i] = '_';
        }
    }

    int calculateFeedback(int activeRow, String activeCode) {
        int recur;
        for (recur = 1; recur < activeRow; recur++) {
            if (activeCode.charAt(0) == codeArr[recur][0] && activeCode.charAt(1) == codeArr[recur][1]
                    && activeCode.charAt(2) == codeArr[recur][2] && activeCode.charAt(3) == codeArr[recur][3]) {
                return recur;
            }
        }
        codeArr[activeRow][0] = activeCode.charAt(0);
        codeArr[activeRow][1] = activeCode.charAt(1);
        codeArr[activeRow][2] = activeCode.charAt(2);
        codeArr[activeRow][3] = activeCode.charAt(3);
        for (int i = 0; i < 4; i++) {
            guessArr[activeRow][i] = ' ';
            for (int j = 0; j < 4; j++)
                if (codeArr[activeRow][i] == codeArr[0][j]) {
                    if (i == j)
                        guessArr[activeRow][i] = 'Y';
                    else
                        guessArr[activeRow][i] = 'X';
                }
        }
        return activeRow;
    }

    void startGame() {
        Scanner sc = new Scanner(System.in);
        char ch;
        int guesses = 1;
        while (guesses <= 12) {
            System.out.print("Code-breaker Guess: ");
            String currCode = "";
            for (int i = 0; i < 4; i++) {
                ch = sc.next().charAt(0);
                currCode += ch;
            }
            int r = calculateFeedback(guesses, currCode);
            if (r == guesses) {
                guesses++;
            } else {
                System.out.print("Repeated guess! ");
            }

            // Print the feedback
            System.out.print("Feedback " + r + ": ");
            // Check answer
            if (guessArr[r][0] == 'Y' && guessArr[r][1] == 'Y' && guessArr[r][2] == 'Y' && guessArr[r][3] == 'Y') {
                System.out.println("You win by " + r + " rounds");
                sc.close();
                return;
            } else {
                System.out.println(guessArr[r][0] + " " + guessArr[r][1] + " " + guessArr[r][2] + " " + guessArr[r][3]);
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        try {
            File fileObject  = new File("code.txt");
            Scanner fileScanner = new Scanner(fileObject);
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                // Split letters with space
                String[] variables = data.split("\\s");
                // Create code string without spaces
                String code = variables[0] + variables[1] + variables[2] + variables[3];
                MasterMind testGame = new MasterMind(code);
                testGame.startGame();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}