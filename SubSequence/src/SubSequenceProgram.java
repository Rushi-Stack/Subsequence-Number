import java.util.Arrays;
import java.util.List;

public class SubSequenceProgram {

	//o(n) is the time complexity of program and 0(1) is space complexity of program n is the length of element 
	
	public static void main(String[] args) {
		Integer a[]= {5,1,22,25,6,-1,8,10};
		Integer b[]= {1,6,-1,10};
		
		List<Integer> aa= Arrays.asList(a);
		List<Integer> bb= Arrays.asList(b);
		Boolean c=isValidSubsequence(aa, bb);
		System.out.println("It is subsequence :: "+c);

	}
	
	public static boolean isValidSubsequence(List<Integer> a, List<Integer> b) {
		int arrIdx=0;
		int seqIdx=0;
		while(arrIdx<a.size() && seqIdx<b.size()) {
			if(a.get(arrIdx).equals(b.get(seqIdx))) {
				seqIdx++;
			}
			arrIdx++;
		}
		
		return seqIdx == b.size();	
	}

}
