package telran.symbolsremove;

public class SymbolsRemoveCharArray implements SymbolsRemove {

	@Override
	public String symbolsRemove(String str, char symbol) {
//		char[] tempArray = new char[str.length()];
//		int index = 0;
//		
//		for (int i = 0; i < tempArray.length; i++) {
//			if (str.charAt(i) != symbol) {
//				tempArray[index++] = str.charAt(i);
//			}
//		}
//		
//		char[] strArray = new char[index];
//		for(int i = 0; i < strArray.length; i++) {
//			strArray[i] = tempArray[i];
//		}
//		
//		return new String(strArray);
		StringBuilder strArray = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != symbol) strArray.append(ch);
		}		
		return strArray.toString();
	}

}
