package algorithmlearn;

public class chap01 {
	
	  public static String solution(int a, int b) {
	      String answer = "";
	      
	      int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	      String week[] = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
	      
	      int day = 0;
	      for(int i=0; i<a-1; i++ ) {
	    	  day += month[i];
	      }
	      day += b-1;
	      answer = week[day % 7];
	      
	      return answer;
	  }

	public static void main(String[] args) {
		
		String answer = chap01.solution(5,24);
		System.out.println(answer);
	}
}
