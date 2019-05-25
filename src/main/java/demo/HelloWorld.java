package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloWorld {

	public static void main(String[] args) {
		TempDTO temp = new TempDTO("x", "29");
		TempDTO temp_1 = new TempDTO("y", "30");
		TempDTO temp_3 = new TempDTO("z", "31");
		List<TempDTO> list = new ArrayList<TempDTO>();
		list.add(temp);
		list.add(temp_1);
		list.add(temp_3);
		Map<String, TempDTO> map = new HashMap<String, TempDTO>();
		map.put("x", temp);
		map.put("y", temp_1);
		map.put("z", temp_3);
		for (TempDTO tempDTO : list) {
			if (map.containsKey(tempDTO.getName())) {
				map.get(tempDTO.getName()).setAge("30");
				System.out.println(map.get(tempDTO.getName()).getAge());
			}

		}

	}

}
