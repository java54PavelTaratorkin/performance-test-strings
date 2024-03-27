package telran.symbolsremove.tests;

import static org.junit.jupiter.api.Assertions.*;
import telran.symbolsremove.*;

import org.junit.jupiter.api.Test;

class SymbolsRemoveTests {

	

	@Test
	void SymbolsRemoveCharArrayTest() {
		SymbolsRemoveTest(new SymbolsRemoveCharArray());
	}
	
	@Test
	void SymbolsRemoveStandardTest() {
		SymbolsRemoveTest(new SymbolsRemoveStandard());
	}
	
	private static void SymbolsRemoveTest(SymbolsRemove removeSymbols) {
		String testStr = "andf]adf";		
		assertEquals("ndf]df", removeSymbols.symbolsRemove(testStr, 'a'));
		assertEquals("andfadf", removeSymbols.symbolsRemove(testStr, ']'));
		assertEquals("", removeSymbols.symbolsRemove("", ']'));
		assertEquals("", removeSymbols.symbolsRemove("nnn", 'n'));
	}

}
