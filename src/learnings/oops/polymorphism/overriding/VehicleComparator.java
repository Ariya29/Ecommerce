package learnings.oops.polymorphism.overriding;

public class VehicleComparator {

	public static Vehicle compare(Vehicle v1, Vehicle v2) {
		if (v1.getEngineCapacity() > v2.getEngineCapacity())
			return v1;
		else
			return v2;
	}
}
