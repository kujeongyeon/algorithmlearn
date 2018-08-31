package algorithmlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
예를들면

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 * 
 */
public class chap03 {
	
	//LinkedHashSet 으로 중복되는 숫자값 전부 제거 
	public int[] solution(int []arr) {
        int[] answer = {};
        if(arr == null || arr.length == 0) return (int[])null;
        
        LinkedHashSet<Integer> hSet = new LinkedHashSet<Integer>();
        	
        	for(int i : arr) {
        		hSet.add(new Integer(i));
        	}
        	Iterator<Integer> it = hSet.iterator();
        	answer = new int[hSet.size()];
        	for (int i=0; i<hSet.size(); i++) {
        		answer[i] = it.next();
        		
        	}      
        return answer;
	}
	
	public int[] solution2(int []arr) {
		int[] answer = {};
		
		ArrayList<Integer> marray = new ArrayList<>();
		for(int i : arr) {
			marray.add(new Integer(i));
		}
		answer = new int[marray.size()];
		int sum = 0;
		for(int i=0; i<marray.size(); i++) {
			for(int j=i; j<marray.size(); j++) {
			if(i != j) {
				int s = i+1;
		//	System.out.println("for문 안에 i: " + i);
			if(marray.get(i).equals(marray.get(s))) {
		//		System.out.println("사라진 i: " + i);
				marray.remove(i);
		//		System.out.println("같음");
		//		System.out.println("aj: "+ s);
				continue;
			
				} 
	//		System.out.println("bj: "+ s);
		//	System.out.println("같지않음");
			break;
			
			}
			
			}
			answer[i] = marray.get(i);
			System.out.println("for 밖에 i: " + i);
	//		answer[i] = marray.get(i);
	//		System.out.println(answer[i]);
			++sum;
			
		}
	//	System.out.println(sum);
		int[] temp = new int[sum];
		for(int i=0; i<sum; i++) {
			temp[i] = answer[i];
		}
		answer = temp;
		
		System.out.println(Arrays.toString(answer));


		return answer;
	}
	
	public static void main(String[] args) {
		chap03 sol = new chap03();
		int[] art = {1,3,4,4,4,4,4,4,4,3,4,4,5,5,1,1,4,1,1,0,0,1};
	
			System.out.println(sol.solution2(art));

	}

}
