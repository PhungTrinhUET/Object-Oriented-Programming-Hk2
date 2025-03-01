public class Solution {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * Gan gia tri cho mau so.
     * Neu tham so denominator bang 0 , giu nguyen gia tri truoc do.
     *
     * @param denominator gia tri mau so.
     */
    public void setDenominator(int denominator) {
        // khong duoc cho mau so bang 0, neu vay thi giu nguyen
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    // Phuong thuc khoi tao co tu khoa this

    /**
     * Ham khoi tao co tham so cho lop Solution.
     * Neu tham so denominator bang 0, se duoc gan mac dinh la 1.
     *
     * @param numerator la tu so.
     * @param denominator la mau so.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        // Neu mau so bang 0 thi gan bang 1
        if (denominator == 0) {
            this.denominator = 1;
        } else {
            this.denominator = denominator;
        }
    }

    // phuong thuc tim uoc chung lon nhat (dung euclid)
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phuong thuc rut gon phan so va tra ve doi tuong hien tai

    /**
     * Rut gon phan so va tra ve doi tuong hien tai .
     * Neu tu so bang 0, mau so se duoc gan la 1.
     *
     * @return doi tuong Solution sau khi rut gon.
     */
    public Solution reduce() {
        if (this.numerator == 0) {
            this.denominator = 1;
        } else {
            int divisor = gcd(this.numerator, this.denominator);
            this.numerator /= divisor;
            this.denominator /= divisor;
        }
        return this;
    }

    // phuong thuc cong phan so voi tham so la mot phan so khac

    /**
     * Cong phan so voi mot so khac.
     *
     * @param other phan so khac can cong.
     * @return doi tuong Solution sau khi cong.
     */
    public Solution add(Solution other) {
        int newNumerator = this.numerator * other.getDenominator()
                + this.denominator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this;
    }

    // phuong thuc tru phan so voi tham so la mot phan so khac.
    /**
     * Tru phan so voi mot phan so khac.
     *
     * @param other phan so can tru.
     * @return doi tuong Solution sau khi tru.
     */
    public Solution subtract(Solution other) {
        int newNumerator = this.numerator * other.getDenominator()
                - this.denominator * other.getNumerator();
        int newDenominator = this.denominator * other.getDenominator();
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this;
    }

    //phuong thuc nhan phan so voi tham so la mot phan so khac

    /**
     * Nhan phan so voi mot phan so khac.
     *
     * @param other phan so can nhan.
     * @return doi tuong solution sau khi nhan.
     */
    public Solution multiply(Solution other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this;
    }

    //phuong thuc chia phan so

    /**
     * Chia phan so voi mot phan so khac.
     * Neu phan so chia co tu so bang 0, khong thuc hien phep chia va giu nguyen.
     *
     * @param other phan so muon chia
     * @return doi tuong Solution sau khi chia.
     */
    public Solution divide(Solution other) {
        // khong cho phep chia cho 0
        if (other.numerator == 0) {
            return this; // Khong thay doi
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        if (newDenominator == 0) {
            return this;
        }
        this.numerator = newNumerator;
        this.denominator = newDenominator;
        return this;
    }

    // phuong thuc equals so sanh 2 phan so
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Solution)) {
            return false;
        }
        Solution other = (Solution) obj;
        // Hai phan so bang nhau neu tich a*d == b*c
        return this.numerator * other.denominator == this.denominator * other.numerator;
    }
}
