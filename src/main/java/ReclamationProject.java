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
    * @param a is a string.
    * @param b is a string.
    * @return the factorial of input if it is valid, or FACTORIAL_INVALID if it is not.
    */
    static String doit(final String a, final String b) {

        String a2 = a, b2 = b;


        if (a2.length() > b2.length()) {
            String c = a2; // set c to a

            a2 = b2;
            b2 = c;
        }

        String r = "";

        for (int i = 0; i < a2.length(); i++) {
            for (int j = a2.length() - i; j > 0; j--) {
                for (int k = 0; k < b2.length() - j; k++) {

                    if (a2.regionMatches(i, b2, k, j) && j > r.length()) {

                        r = a2.substring(i, i + j);
                    }
                }
            }
        }

        return r;

    }
}
