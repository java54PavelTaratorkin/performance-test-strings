package telran.stringsjoin;

public class StringsJoinBuilder implements StringsJoin {

	@Override
	public String joinStrings(String[] array, String delimeter) {
		StringBuilder stringBuilder = new StringBuilder(array[0]);
		
		for (int i = 1; i <array.length; i++) {
			stringBuilder.append(delimeter).append(array[i]);
		}
		return stringBuilder.toString();
	}

}
