package kr.fc.practice;

public class Midterm_exam07 {

    public static void main(String[] args) {
        String str = "3,2,5,4,4,1,5,5,4,1,2,4,5,5,1";
        int[] countArray = countOccurrences(str);
        printStars(countArray);
    }
    public static int[] countOccurrences(String str) {
        int[] counts = new int[5];
        String[] nums = str.split(",");

        for (String num : nums) {
            int value = Integer.parseInt(num);
            counts[value - 1]++;
        }
        return counts;
    }
    public static void printStars(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.print((i + 1)+"("+counts[i]+"개)" + " : ");
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("★");
            }
            System.out.println("");
        }
    }
}
