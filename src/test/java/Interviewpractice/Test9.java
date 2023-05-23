package Interviewpractice;



public class Test9 {

	public static void main(String[] args) {
		int[] num = {23,25,68,97,56};
		int max = num[0];
		for(int i =0;i<num.length;i++) {
			max= Math.max(max, num[i]);
			
		}
		System.out.println("largest value is "+ max);
		
		
		

}
}
