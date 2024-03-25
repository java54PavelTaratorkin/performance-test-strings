package telran.symbolsremove.tests;

import static org.junit.jupiter.api.Assertions.*;
import telran.symbolsremove.*;

import org.junit.jupiter.api.Test;

class SymbolsRemoveTests {


	@Test
	void SymbolsRemoveCharArray() {
		String testStr = "andf]adf";
		SymbolsRemove removeSymbol = new SymbolsRemoveCharArray();
		assertEquals("ndf]df", removeSymbol.symbolsRemove(testStr, 'a'));
		assertEquals("andfadf", removeSymbol.symbolsRemove(testStr, ']'));
		assertEquals("", removeSymbol.symbolsRemove("", ']'));
		assertEquals("", removeSymbol.symbolsRemove("nnn", 'n'));
	}
	
	@Test
	void SymbolsRemoveStandard() {
		String testStr = "andf]adf";
		SymbolsRemove removeSymbol = new SymbolsRemoveStandard();
		assertEquals("ndf]df", removeSymbol.symbolsRemove(testStr, 'a'));
		assertEquals("andfadf", removeSymbol.symbolsRemove(testStr, ']'));
		assertEquals("", removeSymbol.symbolsRemove("", ']'));
		assertEquals("", removeSymbol.symbolsRemove("nnn", 'n'));	
	}

}
