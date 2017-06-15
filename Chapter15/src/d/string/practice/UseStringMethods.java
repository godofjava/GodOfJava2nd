package d.string.practice;

public class UseStringMethods {

	public static void main(String[] args) {
		UseStringMethods use = new UseStringMethods();

		String str = "The String class represents character strings.";
		String findStr = "string";

		use.printWords(str);
		use.findString(str, findStr);
		use.findAnyCaseString(str, findStr);
		use.countChar(str, 's');
		use.printContainWords(str, "ss");
	}

	public void printWords(String str) {
		String[] words = str.split(" ");
		for (String tempStr : words) {
			System.out.println(tempStr);
		}
	}

	public void findString(String str, String findStr) {
		int idx = str.indexOf(findStr);
		if (idx != -1) {
			System.out.println(findStr + " is appeared at " + idx);
		}
	}

	public void findAnyCaseString(String str, String findStr) {
		String lowerStr = str.toLowerCase();
		String lowerFindStr = findStr.toLowerCase();
		int idx = lowerStr.indexOf(lowerFindStr);
		if (idx != -1) {
			System.out.println(findStr + " is appeared at " + idx);
		}
	}

	public void countChar(String str, char c) {
		char[] strArray = str.toCharArray();
		int count = 0;
		for (char tempChar : strArray) {
			if (tempChar == c)
				count++;
		}
		System.out.println("char \'" + c + "\' count is " + count);
	}

	public void printContainWords(String str, String findStr) {
		String[] words = str.split(" ");
		for (String tempStr : words) {
			if (tempStr.contains(findStr)) {
				System.out.println(tempStr + " contains " + findStr);
			}
		}
	}
}
