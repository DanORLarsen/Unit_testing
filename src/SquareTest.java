import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @org.junit.Test
    public void getArea() {
        Square s = new Square(1,1);
        Square s2 = new Square(1000,0);
        Square s3 = new Square(6);
        assertEquals(1,s.getArea(),0.1);
        assertEquals(0,s2.getArea(),0.1);
        assertEquals(30,s3.getArea(),0.1);
    }

    @org.junit.Test
    public void getPerimeter() {
        Square s = new Square(1,1);
        assertEquals(4,s.getPerimeter(),0.1);
    }
}