import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(3, Week4.max2Int(2, 3));
    }
    @Test
    public void testMax2Int2(){
        assertEquals(4, Week4.max2Int(2, 4));
    }
    @Test
    public void testMax2Int3(){
        assertEquals(5, Week4.max2Int(2, 5));
    }
    @Test
    public void testMax2Int4(){
        assertEquals(7, Week4.max2Int(2, 7));
    }
    @Test
    public void testMax2Int5(){
        assertEquals(8, Week4.max2Int(2, 8));
    }

    @Test
    public void testMinArray1(){
        assertEquals(1, Week4.minArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }
    @Test
    public void testMinArray2(){
        assertEquals(-5, Week4.minArray(new int[]{-1, -2, -3, -4, -5}));
    }

    @Test
    public void testMinArray3(){
        assertEquals(0, Week4.minArray(new int[]{0, 1, 2, 3, 4, 5}));
    }

    @Test
    public void testMinArray4(){
        assertEquals(10, Week4.minArray(new int[]{10}));
    }

    @Test
    public void testMinArray5(){
        assertEquals(-5000, Week4.minArray(new int[]{-5000, -2000, - 1000, 100, 200}));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Thiếu cân", Week4.calculateBMI(50, 1.9));
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals("Thừa cân", Week4.calculateBMI(70, 1.7));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Béo phì", Week4.calculateBMI(100, 1.7));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Béo phì", Week4.calculateBMI(120,1.8));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Bình thường", Week4.calculateBMI(65, 1.7));
    }
}
