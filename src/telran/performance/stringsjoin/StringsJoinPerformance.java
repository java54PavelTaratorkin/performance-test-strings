package telran.performance.stringsjoin;

import telran.performance.PerformanceTest;
import telran.stringsjoin.StringsJoin;


public class StringsJoinPerformance extends PerformanceTest {
	String[] array;
	StringsJoin stringsJoin;
	public StringsJoinPerformance(String displayName, int nRuns, 
			StringsJoin stringsJoin, String[] array) {
		super(displayName, nRuns);
		this.stringsJoin = stringsJoin;
		this.array = array;
	}
	@Override
	protected void runTest() {
		stringsJoin.joinStrings(array, ";");		
	}
	
	
}
