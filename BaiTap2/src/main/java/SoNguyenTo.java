public class SoNguyenTo {
    /**
     * Check so nguyen to.
     *
     * @param n la so nguyen duong
     * @return true la so nguyen to,
     * false khong phai la so nguyen to
     */
    public boolean isPrime(int n) {
        // so nguyen n = 2 khong phai so nguyen to
        if (n < 2) {
            return false;
        }
        // check n >= 2 co phai so nguyen to khong
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}