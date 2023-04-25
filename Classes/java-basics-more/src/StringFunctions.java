import java.util.Locale;

public class StringFunctions {
    public static void main(String[] args) {
        // String Functions: lower case, upper case, trim, substring with one and two parameters, replace, first index and last index, split.

        String original = "    ABC def GHI abc def ghi    ";
        String s = "potato apple lemon";
        String [] v = s.split(" ");

        String word1 = v[0];
        String word2 = v[1];
        String word3 = v[2];

        String modLowerCase = original.toLowerCase();
        String modUpperCase = original.toUpperCase();
        String modTrim = original.trim();
        String modSubstring = original.substring(8);
        String modSubstringTwoParameters = original.substring(8, 12);
        String modReplace = original.replace("d", "b");
        int modFirstIndex = original.indexOf("def");
        int modLastIndex = original.lastIndexOf("def");

        System.out.println("Original Upper Case: " + "-" + original + "-");
        System.out.println("Modified to Lower Case: " + modLowerCase);
        System.out.println("Modified to Upper Case: " + modUpperCase);
        System.out.println("Modified with Trim: " + "-" + modTrim + "-");
        System.out.println("Modified with substring (01 parameter): " + modSubstring);
        System.out.println("Modified with substring (two parameters): " + modSubstringTwoParameters);
        System.out.println("Modified with replace: " + modReplace);
        System.out.println("First index of def: " + modFirstIndex);
        System.out.println("Last index of def: " + modLastIndex);
        System.out.println("First split (position 0 in vector): " + word1);
        System.out.println("Second split (position 1 in vector): " + word2);
        System.out.println("Third split (position 2 in vector): " + word3);

    }
}
