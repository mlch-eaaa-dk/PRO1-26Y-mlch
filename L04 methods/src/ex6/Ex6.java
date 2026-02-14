package ex6;

public class Ex6 {
    void main() {
        IO.println("Your choice of Scissor(0), Rock(1) or paper(2) ?");
        int userNo = Integer.parseInt(IO.readln());
        IO.println("Your choice: " + numberToName(userNo));

        int computerNo = (int) (Math.random() * 3);
        IO.println("Computer's choice: " + numberToName(computerNo));

        String result = result(userNo, computerNo);

        IO.println("*** " + result + " ***");
    }

    // Pre: 0 <= no <= 2
    public String numberToName(int no) {
        String result;
        if (no == 0) result = "Scissors";
        else if (no == 1) result = "Rock";
        else result = "Paper";
        return result;
    }

    public String result(int userNo, int computerNo) {
        String result;
        if (userNo == computerNo) {
            result = "It is a draw";
        } else if (userNo - computerNo == 1 || userNo - computerNo == -2) {
            result = "You won";
        } else {
            result = "Computer won";
        }
        return result;
    }
}

// main():
// prompt user for her choice (1, 2 or 3)
// read user choice
// print user's choice (Scissors, Rock or Paper)
// calculate computer choice (1, 2 or 3)
// print computer's choice (Scissors, Rock or Paper)
// calculate result from user choice and computer choice
// print result

// calcResult(computerNo, userNo):
// if userNo == computerNo
//    result is: draw
// else if userNo - computerNo == 1 or userNo - computerNo == -2
//    result is: user wins
// else
//    result is: computer wins
// return result
