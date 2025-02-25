package WhileLoopDemo;

public class WhileloopPractice {
    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apperal and the slightly "
                + "more in demand category:makeup along with the category:furniture and ...";

        int count = 0;

        while (count < 5){
            System.out.println("Count is: " + count);
            count++;
            if (count == 3){
                break;
            }
        }

        printCategories(str);

    }

    public static void printCategories(String str){
        int i = 0;
        while (true){
            // Find the index of the first occurrence of the substring "category:" in the string str starting from index i
            int found = str.indexOf("category:", i);
            // If the substring "category:" is not found in the string str starting from index i, then break out of the loop
            if (found == -1) break;
            // The start index of the category name is 9 characters after the index of the substring "category:"
            int start = found + 9;
            // The end index of the category name is the index of the first space character after the start index
            int end = str.indexOf(" ", start);
            System.out.println(str.substring(start, end));
            i = end + 1;
        }
    }


}
