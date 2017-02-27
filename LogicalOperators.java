/**
 * Created by apple on 2017/2/26.
 */
public class LogicalOperators {

    public static void main(String[] args){
        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional AND (&&)", "false && false", (false && false),
                "false && true", (false && true),
                "true && true", (true && true));

        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Conditional OR (||)", "false || false", (false && false),
                "false || true", (false || true),
                "true || true", (true || true));

        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical AND(&) ", "false && false", (false && false),
                "false && true", (false & true),
                "true & false", (true & false),
                "true && true", (true & true));

        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical inclusive OR (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false", (true | false),
                "true | true", (true | true));

        System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                "Boolean logical exculsive OR (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ true", (true ^ true),
                "true ^ false", (true ^ false));

        System.out.printf("%s\n%s: %b\n%s: %b\n",
                "Logical NOT (!)",
                "!false", (!false),
                "!true", (!true));
    }
}
