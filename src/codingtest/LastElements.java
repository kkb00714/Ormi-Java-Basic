package codingtest;

public class LastElements {
    public static void main(String[] args) {
        int[] numList = {3, 1, 5, 6, 7};
        int[] result = solution(numList);
        for (int a : result) {
            System.out.printf(a + " ");
        }
    }
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length + 1];
        for (int i = 0; i < length; i++) {
            answer[i] = num_list[i];
        }
        int cnt = 0;
        if (num_list[length - 1] > num_list[length - 2]) {
            cnt = num_list[length - 1] - num_list[length - 2];
        } else {
            cnt = num_list[length - 1] * 2;
        }

        answer[length] = cnt;

        return answer;

    }
}
