
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


public class CalculatorTest{

    @Test
    public void sum_a21b51_72(){
        double expected = 7.2;

        double actual = Calculator.sum(2.1, 5.1);

        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void sum_a5b6_11(){
        int expected = 11;

        int actual = Calculator.sum(5, 6);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void substraction_a5b8_3(){
        double expected  = -3;
        double actual = Calculator.substraction(5, 8);

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void multiply_a5b8_40(){
        double expected  = 40;
        double actual = Calculator.multiply(5, 8);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void divide_a10b0_3() {
        try {
            Calculator.divide(10, 0);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
            return;
        }
        Assert.fail("Niepowiodlo sie wyrzucanie wyjatku");

    }



    @Test
    public void divide_a12b4_3(){
        try{
            Calculator.divide(10, 0);
        }catch (IllegalArgumentException e){
            Assert.assertTrue(true);
            return;
        }
        Assert.fail();


        double expected  = 3;
        double actual = Calculator.divide(12, 4);

        Assert.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void getFibonaciNumber_a3_2(){
        int expected  = 2;
        int actual = Calculator.getFibonaciNumber(3);

        Assert.assertEquals(expected, actual, 0.000001);
    }

    //mozna Rule + Test
    @Rule
    public ExpectedException rule = ExpectedException.none();

    @Test
    public void divide_a10b0_IllegalArgumentExceptionRule(){
        rule.expect(IllegalArgumentException.class);
        Calculator.divide(10, 0);
    }

    //mozna samo Test
    @Test (expected = IllegalArgumentException.class)
    public void divide_a10b0_IllegalArgumentExceptionExpected(){
        Calculator.divide(10, 0);
    }

    @Test
    public void log_a2b4_2(){
        double expected  = 2;
        double actual = Calculator.log(2, 4);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void log_a0b4_ExceptionExpected(){
        Calculator.log(0,4);
    }
    @Test (expected = IllegalArgumentException.class)
    public void log_a2b0_ExceptionExpected(){
        Calculator.log(2,0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void log_a1b4_ExceptionExpected(){
        Calculator.log(1,4);
    }


}