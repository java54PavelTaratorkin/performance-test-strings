package telran.symbolsremove;

public class SymbolsRemoveStandard implements SymbolsRemove {

	@Override
	public String symbolsRemove(String str, char symbol) {
//		return str.replaceAll(getRegexSymbol(symbol), "");
		return str.replaceAll("\\Q" + symbol + "\\E", "");
	}
	
	private String getRegexSymbol(char symbol) {
		String specSymbols = "[].(){}\\*+?^$|";
		String returnSymbol = "\\" + symbol;
		if (specSymbols.indexOf(symbol) == -1) {
			returnSymbol = Character.toString(symbol);
		}
		return returnSymbol;
	}

}
