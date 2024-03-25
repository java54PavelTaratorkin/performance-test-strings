package telran.performance.symbolsremove;

import java.util.Random;

import telran.symbolsremove.SymbolsRemove;
import telran.symbolsremove.SymbolsRemoveCharArray;
import telran.symbolsremove.SymbolsRemoveStandard;

public class SymbolsRemovePerformanceApp {
	private static final int N_SYMBOLS = 10000;
	private static final int N_RUNS = 10000;
	public static Random random = new Random();
		
	public static void main(String[] args) {
		String str = getRandomString(N_SYMBOLS);
		char symbol = getRandomAsciiSymb();
		SymbolsRemovePerformance testSymbolsRemoveCharArray = getTest(str, N_RUNS, 
				"test of SymbolsRemoveCharArray", new SymbolsRemoveCharArray(), symbol);
		SymbolsRemovePerformance testSymbolsRemoveStandard = getTest(str, N_RUNS, 
				"test of SymbolsRemoveStandard", new SymbolsRemoveStandard(), symbol);
		testSymbolsRemoveCharArray.run();
		testSymbolsRemoveStandard.run();		
	}
	
	private static SymbolsRemovePerformance getTest(String str, int nRuns, 
			String displayName, SymbolsRemove symbolsRemove, char symbol) {
		
		return new SymbolsRemovePerformance(displayName, nRuns, symbolsRemove, str, symbol);
	}
	private static char getRandomAsciiSymb() {
		int randomSymbolCode = 32 + random.nextInt(95);
		
		return (char)randomSymbolCode;
	}
	
	private static String getRandomString(int newStrLength) {
		StringBuilder newStr = new StringBuilder();
		
		for (int i = 0; i < newStrLength; i++) {
			newStr.append(getRandomAsciiSymb());
		}
		
		return newStr.toString();
	}


}
