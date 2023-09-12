import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract_1() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract_2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(-1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(3, x.denominator);
    }

    @Test
    public void testEqual_1() {
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        Assert.assertTrue(x.equals(y));
    }

    @Test
    public void testEqual_2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        Assert.assertFalse(x.equals(y));
    }

    @Test
    public void testCompareTo_1() {
        Rational x = new Rational();
        x.numerator = 20;
        x.denominator = 10;
        Rational y = new Rational();
        y.numerator = 50;
        y.denominator = 10;
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void testCompareTo_2() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Assert.assertEquals(0, x.compareTo(y));
    }

    @Test
    public void testCompareTo_3() {
        Rational x = new Rational();
        x.numerator = 5;
        x.denominator = 1;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 1;
        Assert.assertEquals(1, x.compareTo(y));
    }

    @Test
    public void testToString() {
        Rational x = new Rational();
        x.numerator = 21;
        x.denominator = 10;
        Assert.assertEquals("21/10", x.toString());
    }
}
