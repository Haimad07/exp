package arrays;
import java.util.*;

public class MajorityElement {
	
	public static void main(String[] args) {
		
		int a[]= {10,20,20,30,30,40,40,40,40,20,20,20};
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])==false) {
				map.put(a[i],1);
			}
			else {
				int oldval =map.get(a[i]); 
				map.put(a[i],oldval+1);
			}
		}
		Set<Map.Entry<Integer,Integer>> hmap = map.entrySet();
		int maxInt=0;
		int maxVal=-1;
		for(Map.Entry<Integer,Integer>data:hmap) {
			if(data.getValue()>maxVal) {
				maxVal =data.getValue();
				maxInt=data.getKey();
				
			}
			
		}
		System.out.println(maxInt+" "+maxVal);
}
	}
