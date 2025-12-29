public class OperatorsAndPrecedenceDemo {

    public static void main(String[] args) {

        System.out.println("=== 1) Variable declaration (with/without initialization) ===");

        int a;                 // declared, NOT initialized (cannot be used yet)
        int b = 10;            // declared + initialized
        double price = 4.50;   // initialized
        int qty = 3;           // initialized
        boolean isMember;      // declared, NOT initialized
        String item = "Pen";   // initialized

        // Now initialize the previously uninitialized variables (otherwise we'd get a compile error if we used them)
        a = 7;                 // 2) assignment operator =
        isMember = true;       // assignment for boolean

        System.out.println("a=" + a + ", b=" + b + ", item=" + item + ", isMember=" + isMember);


        System.out.println("\n=== 2) Assignment operators (=, +=, -=, *=, /=, ++, --) ===");

        int points = 0;        // start at zero
        points = points + 5;   // normal assignment with expression
        points += 10;          // shorthand assignment
        points -= 3;           // shorthand assignment
        points *= 2;           // shorthand assignment
        points /= 4;           // shorthand assignment (integer division)

        System.out.println("points after several assignments = " + points);

        int counter = 1;
        System.out.println("counter initially = " + counter);
        counter++; // ++ increases by 1
        System.out.println("counter after counter++ = " + counter);
        ++counter; // pre-increment also increases by 1
        System.out.println("counter after ++counter = " + counter);

        // Show difference between post-increment and pre-increment in an expression
        int x = 5;
        int post = x++;  // post gets old value, then x increments
        int y = 5;
        int pre = ++y;   // y increments first, then pre gets new value
        System.out.println("post = " + post + ", x after x++ = " + x);
        System.out.println("pre  = " + pre  + ", y after ++y = " + y);


        System.out.println("\n=== 3) Arithmetic operators (+, -, *, /, %, unary +/-, parentheses) ===");

        double subTotal = price * qty;         // * multiplication
        double taxRate = 0.085;                // 8.5%
        double tax = subTotal * taxRate;       // another multiplication
        double total = subTotal + tax;         // + addition
        double change = 20.00 - total;         // - subtraction
        int remainder = 17 % 5;                // % modulus (remainder)

        System.out.println("subTotal = " + subTotal);
        System.out.println("tax      = " + tax);
        System.out.println("total    = " + total);
        System.out.println("change from $20 = " + change);
        System.out.println("17 % 5 remainder = " + remainder);

        int neg = -b; // unary minus
        System.out.println("neg = -b = " + neg);


        System.out.println("\n=== 4) Relational operators (>, <, >=, <=, ==, !=) ===");

        boolean isExpensive = total > 10.00;    // >
        boolean isCheap = total < 5.00;         // <
        boolean isAtLeastTen = total >= 10.00;  // >=
        boolean notEqualExample = (a != b);     // !=
        boolean equalExample = (qty == 3);      // ==

        System.out.println("total > 10?   " + isExpensive);
        System.out.println("total < 5?    " + isCheap);
        System.out.println("total >= 10?  " + isAtLeastTen);
        System.out.println("a != b?       " + notEqualExample);
        System.out.println("qty == 3?     " + equalExample);


        System.out.println("\n=== 5) Logical operators (&&, ||, !) + short-circuiting ===");

        boolean hasCoupon = false;
        boolean bigOrder = (qty >= 5);
        boolean qualifiesForDiscount = isMember && (total >= 10.00); // AND
        boolean canGetAnyDeal = qualifiesForDiscount || hasCoupon;   // OR
        boolean notMember = !isMember;                               // NOT

        System.out.println("qualifiesForDiscount (member AND total>=10)? " + qualifiesForDiscount);
        System.out.println("canGetAnyDeal (qualifies OR coupon)?         " + canGetAnyDeal);
        System.out.println("notMember (!isMember)?                       " + notMember);

        // Demonstrate short-circuiting: right side won't run if left decides result
        int divisor = 0;
        boolean safeToDivide = (divisor != 0) && ((10 / divisor) > 1); // second part skipped
        System.out.println("safeToDivide with divisor=0 (short-circuit) = " + safeToDivide);


        System.out.println("\n=== 6) Precedence rules (and parentheses to control order) ===");

        int p = 2;
        int q = 3;
        int r = 4;

        // Multiplication before addition:
        int expr1 = p + q * r;          // = 2 + (3*4) = 14
        int expr2 = (p + q) * r;        // = (2+3)*4 = 20

        System.out.println("p + q * r       = " + expr1);
        System.out.println("(p + q) * r     = " + expr2);

        // Relational before logical? Actually arithmetic -> relational -> logical
        boolean expr3 = p + q > r && isMember;  // (p+q)>r evaluated before &&
        System.out.println("p + q > r && isMember = " + expr3);

        // NOT has higher precedence than && and ||
        boolean expr4 = !hasCoupon || isMember && (total > 0);
        // Interprets as: (!hasCoupon) || (isMember && (total > 0))
        System.out.println("!hasCoupon || isMember && (total > 0) = " + expr4);

        // Assignment has low precedence: evaluate RHS first, then assign
        int z = 0;
        z += p + q * r; // equivalent to z = z + (p + (q*r))
        System.out.println("z after z += p + q * r  => " + z);

        System.out.println("\n=== End of Demo ===");
    }
}
