/**
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 * <p>
 * <code>ReclamationProject.java</code>.
 */
public class ReclamationProject {
    /**
    * @param firstInput is a string.
    * @param secondInput is a string.
    * @return the factorial of input if it is valid, or FACTORIAL_INVALID if it is not.
    */
    static String doit(final String firstInput, final String secondInput) {

        String longString = firstInput, shortString = secondInput;


        if (longString.length() > shortString.length()) {
            String swap = longString; // set c to a

            longString = shortString;
            shortString = swap;
        }

        String r = "";

        for (int longStringPos = 0; longStringPos < longString.length(); longStringPos++) {

            for (int lettersChecked = longString.length() - longStringPos;
                    lettersChecked > 0; lettersChecked--) {

                for (int shotStringPos = 0; shotStringPos < shortString.length() - lettersChecked;
                        shotStringPos++) {

                    if (longString.regionMatches(longStringPos, shortString,
                            shotStringPos, lettersChecked) && lettersChecked > r.length()) {

                        r = longString.substring(longStringPos, longStringPos + lettersChecked);
                    }
                }
            }
        }

        return r;

    }
}
