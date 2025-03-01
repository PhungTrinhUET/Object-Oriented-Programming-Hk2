public class Week4 {
    public static int max2Int(int a, int b) {
        // tim gia tri lon nhat cua 2 so nguyen
        return (a > b) ? a : b;
    }

    /**
     * Tim gia tri lon nhat cua hai so nguyen.
     * Neu mang rong hoac null, nem ra loi IllegalArgumentException.
     *
     * @param array la mang so nguyen.
     * @return gia tri nho nhat trong mang.
     * @throws IllegalArgumentException neu mang rong hoac null.
     */
    public static int minArray(int[] array) {
        //Tim gia tri nho nhat cua 1 mang so nguyen
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("mang khong the rong");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    /**
     * Tinh chi so BMI.
     * Thieu can, Binh thuong, Thua can va Beo phi.
     * Neu chieu cao <= 0 thi nem ra loi IllegaLArgumentException.
     *
     * @param weight la can nang
     * @param height la chieu cao
     * @return chuoi mo ta trang thai can nang dua tren BMI.
     * @throws IllegalArgumentException neu height <= 0.
     */
    public static String calculateBMI(double weight, double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Chieu cao phai lon hon 0");
        }
        double bmi = weight / (height * height);
        bmi = Math.round(bmi * 10.0) / 10.0;
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi < 23) {
            return "Bình thường";
        } else if (bmi < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
