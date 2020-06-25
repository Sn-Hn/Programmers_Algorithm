package sort_basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_sort_List {
	public List<Integer> mergeSort(final List<Integer> input){
        if(input.size() < 2)
            return input;
        
        final List<Integer> leftHalf = input.subList(0, input.size()/2); // 왼쪽 절반 
        final List<Integer> rightHalf = input.subList(input.size()/2, input.size()); // 오른쪽 절반 
        
        return merge(mergeSort(leftHalf), mergeSort(rightHalf));
    }
    
    // 병합 
    private List<Integer> merge(final List<Integer> left, final List<Integer> right){
        int leftPtr = 0;
        int rightPtr = 0;
        
        final List<Integer> mergedList = new ArrayList<>(left.size() + right.size());
        
        while(leftPtr < left.size() && rightPtr < right.size()) {
            if(left.get(leftPtr) < right.get(rightPtr)) {
                mergedList.add(left.get(leftPtr));
                leftPtr++;
            }else {
                mergedList.add(right.get(rightPtr));
                rightPtr++;
            }
        }
        // 나머지 데이터 삽입
        while(leftPtr < left.size()) {
            mergedList.add(left.get(leftPtr));
            leftPtr++;
        }
        
        while(rightPtr < right.size()) {
            mergedList.add(right.get(rightPtr));
            rightPtr++;
        }
        System.out.println(mergedList);
        
        return mergedList;
    }
    public static void main(String[] args) {
    	Merge_sort_List msl = new Merge_sort_List();
        List<Integer> input = Arrays.asList(5,10,2,8,9,3,1,7,4,6);
        List<Integer> output = msl.mergeSort(input);
        
        List<Integer> result = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
//        assertArrayEquals(output.toArray(), result.toArray());
	}

}
