package javastreamapi.StreamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streammethod1 {

	public static void main(String[] args) {
		
List<String>vehiclesList=Arrays.asList("bus", "car", "bycle", "bus", "car", "car", "bike");
		
		//distinct
		
		List<String> distinctVehicles=vehiclesList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVehicles); 
		
		vehiclesList.stream().distinct().forEach(value->System.out.println(value));
		
		//count
		long count=vehiclesList.stream().distinct().count();
		System.out.println(count);
		
		//limit()
		List<String> limitedVehicleslist=vehiclesList.stream().limit(3).collect(Collectors.toList());
		System.out.println("Limited Vehicles:"+limitedVehicleslist);
		
		vehiclesList.stream().limit(3).forEach(value->System.out.println(value));
	}
}
