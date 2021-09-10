package 힙;


import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42628
public class 이중우선순위큐 {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> min = new PriorityQueue<>();
        Queue<Integer> max = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (String operation : operations) {
            String oper = operation.split(" ")[0];
            int num = Integer.parseInt(operation.split(" ")[1]);

            if ("I".equals(oper)) {
                min.add(num);
            }else {
                if (min.isEmpty()) {
                    continue;
                }

                if (num == -1) {
                    min.poll();

                }else {
                    max.clear();
                    max.addAll(min);
                    max.poll();
                    min.clear();
                    min.addAll(max);
                }
            }
        }

        if (min.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;

            return answer;
        }

        int MAX = Integer.MIN_VALUE;
        int MIN = min.peek();
        while (!min.isEmpty()) {
            int num = min.poll();
            MAX = Math.max(MAX, num);
        }

        answer[0] = MAX;
        answer[1] = MIN;

        return answer;
    }

    public static void main(String[] args) {
//        String[] operations = {"I 16","D 1"};
//        String[] operations = {"I 7","I 5","I -5","D -1"};
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        System.out.println(Arrays.toString(new 이중우선순위큐().solution(operations)));

    }
}
