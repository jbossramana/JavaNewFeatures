package demo;

	import java.util.ArrayList;
	import java.util.List;
	
	import java.util.ArrayList;
	import java.util.List;

	public class TestStreamWithOutParallel {
		public static void main(String[] args) {
			
			long currentTime=System.currentTimeMillis();
			List<Integer> data=new ArrayList<Integer>();
			for (int i = 0; i < 1000; i++) {
				data.add(i);
			}
			
			long sum=data.stream()
					.map(i ->(int)Math.sqrt(i))
					.map(number->performComputation(number))
					.reduce(0,Integer::sum);
			
			System.out.println(sum);
			long endTime=System.currentTimeMillis();
			System.out.println("Time taken to complete:"+(endTime-currentTime)+" ms");
			
		}
		
		public static int performComputation(int number)
		{
			int sum=0;
			for (int i = 1; i < 1000; i++) {
				int div=(number/i);
				sum+=div;
				
			}
			return sum;
		}
	}
	
