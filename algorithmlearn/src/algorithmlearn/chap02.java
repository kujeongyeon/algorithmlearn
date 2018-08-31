package algorithmlearn;

public class chap02 {
	 //나의 풀이
	  public static String solution(String s) {
	      String answer = "";
	      String as[] = new String[100];
	      for(int i=0; i<s.length(); i++ ) {
	    	  as[i] = new String();
	    	  as[i] += s.charAt(i);
	      }
	      if (s.length()%2 != 0){
	    	  	int a = (1 + s.length()) / 2;
	    	  	answer += as[a-1];
	    	  }else {
	    		int a = s.length() / 2;
	    		String test1 = as[a-1];
	    		String test2 = as[a];
	    		answer = test1 + test2;
	    	  }
	      return answer;
	  }
	  //다른이 풀이
	  public static String getMiddle(String s){

	      return s.substring((s.length()-1) / 2, s.length()/2 + 1);    
	  }
	  
	public static void main(String[] args) {
		chap02 sou = new chap02();
		System.out.println(sou.solution("안녕하세요하하"));
		System.out.println(sou.getMiddle("안녕하세요하하"));
		String sdo= "안녕하세요하하요";
		System.out.println(sdo.substring(3,5));
		
	}

}
