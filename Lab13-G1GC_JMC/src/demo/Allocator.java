package demo;
import java.util.Collection;
import java.util.HashMap;

public class Allocator {

	private HashMap<Integer, MyAlloc> map = new HashMap<Integer, MyAlloc>();
	
	private static class MyAlloc {
		private Integer   id;
		
		private MyAlloc(Integer id) {
			this.id = id;
		}
			private Integer  getId() {
			return id;
		}	}
	
	public static void main(String[] args) {
		new Allocator().go();	}

	private void go() {
		alloc(10000);
		long yieldCounter = 0;
		while(true) {
			Collection<MyAlloc> myAllocSet = map.values();
			for (MyAlloc c : myAllocSet ) {
				if (!map.containsKey(c.getId()))
					System.out.println("Now this is strange!");
				if (++yieldCounter % 1000 == 0)
					Thread.yield();
			}
		}
	}

	private void alloc(int count) {
		for (Integer i = 0; i < count; i++) {
			map.put(i, new MyAlloc(i));
		}
	}
}
