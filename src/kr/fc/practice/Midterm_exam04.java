package kr.fc.practice;

public class Midterm_exam04 {
    public static void main(String[] args) {
        String mydab="1,3,2,4,4";
        int[] dab={ 2, 3, 2, 4, 1};

        StringBuilder sb = new StringBuilder();
        sb.append("[박주현 성적]\n");
        sb.append("-------------------------------\n");
        for (int i =0; i<5; i++) {
            sb.append(i+"\t");
        }
        sb.append("SCORE\n");
        sb.append("-------------------------------\n");
        int sum = 0;
        String[] strs = mydab.split(",");
        for (int i=0; i<dab.length;i++){
            if (dab[i] == Integer.parseInt(strs[i])){
                sb.append("O\t");
                sum += 20;
            } else {
                sb.append("X\t");
            }
        }
        sb.append(sum+"\n");
        System.out.println(sb);
    }
}
