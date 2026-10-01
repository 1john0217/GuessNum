import java.util.*;
public class Main {
    public static void main(String[] args) {

        // 일단 여기에 그냥 내가 쓰고 싶은 코드들을 다 적으면 된다.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Guess number!!! 1 to 100: ");
        int answer = random.nextInt(100) + 1;
        int guessNum = scanner.nextInt();

        while (answer != guessNum){

            if(answer > guessNum){
                System.out.printf("정답은 %s보다 큽니다\n", guessNum);
            }
            if (answer < guessNum){
                System.out.printf("정답은 %s보다 작습니다\n", guessNum);
            }

            System.out.print("retry : ");
            guessNum = scanner.nextInt();

        }

        System.out.println("정답입니다");





    }
}