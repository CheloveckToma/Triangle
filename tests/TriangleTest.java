import org.junit.Test;
import ru.kav.triangle.IncorrectTriangle;
import ru.kav.triangle.Triangle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTest {



    @Test(expected = IncorrectTriangle.class)
    public void negativeData() throws IncorrectTriangle {
        new Triangle(-5, 2, 3);
    }

    @Test(expected = IncorrectTriangle.class)
    public void zeroData() throws IncorrectTriangle {
       new Triangle(0, 0, 0);
    }

    @Test
    public void isTrueScalene() throws IncorrectTriangle {
        Triangle triangle = new Triangle(3, 4, 5);
        assertTrue(triangle.isScalene());
    }

    @Test
    public void isTrueIsosceles() throws IncorrectTriangle {
        Triangle triangle = new Triangle(3, 2, 2);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void isTrueEquilateral() throws IncorrectTriangle {
        Triangle triangle = new Triangle(3, 3, 3);
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void isFalseEquilateral() throws IncorrectTriangle {
        Triangle triangle = new Triangle(5, 1, 5);
        assertFalse(triangle.isEquilateral());
    }

    @Test
    public void isFalseIsosceles() throws IncorrectTriangle {
        Triangle triangle = new Triangle(3, 4, 2);
        assertFalse(triangle.isIsosceles());
    }

    @Test
    public void isFalseScalene() throws IncorrectTriangle {
        Triangle triangle = new Triangle(3, 3, 3);
        assertFalse(triangle.isScalene());
    }

}