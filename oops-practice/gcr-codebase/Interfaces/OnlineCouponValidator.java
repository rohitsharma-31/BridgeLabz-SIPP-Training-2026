interface CouponValidator {
    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code != null && code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {
    @Override
    public boolean validateCoupon(String code) {
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }
        return code.startsWith("SAVE") || code.startsWith("DISC");
    }
}

public class OnlineCouponValidator {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        String[] couponCodes = {"SAVE10", "DISC20", "ABC", "INVALID"};

        for (String code : couponCodes) {
            boolean valid = cart.validateCoupon(code);
            System.out.println(code + " -> " + (valid ? "valid" : "invalid"));
        }
    }
}
