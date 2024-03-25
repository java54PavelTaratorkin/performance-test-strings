package telran.performance.symbolsremove;

import telran.performance.PerformanceTest;
import telran.symbolsremove.SymbolsRemove;

public class SymbolsRemovePerformance extends PerformanceTest {
	String str;
	char symbol;
	SymbolsRemove symbolsRemove;
	protected SymbolsRemovePerformance(String displayName, int nRuns, 
			SymbolsRemove symbolsRemove, String str, char symbol) {
		super(displayName, nRuns);
		this.str = str;
		this.symbolsRemove = symbolsRemove;
		this.symbol = symbol;
	}

	@Override
	protected void runTest() {
		symbolsRemove.symbolsRemove(str, symbol);
	}

}
