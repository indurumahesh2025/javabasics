package ForLoopDemo;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            System.out.println("Count is: " + i);
            if (i == 3){
                break;
            }
        }
    }
}
