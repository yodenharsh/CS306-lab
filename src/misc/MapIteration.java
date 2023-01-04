package misc;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	public static void main(String[] args) {
		Map<String,String> hm = new HashMap<>();
		hm.put("yolo", "damn");
		hm.put("hi","world");
		hm.forEach((key,value) -> {
			key = key.toUpperCase();
			System.out.println(key+ ": "+value);
		});
	}
}
