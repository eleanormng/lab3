import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testreverseInPlace2() {
    int[] input2 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input2);
  }

  @Test
  public void testReversed2() {
    int[] input2 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] containsZero = { };
    double[] oneElem = {1};
    double[] list1 = {1.0, 2.0, 3.0};
    double[] list2 = {10, 10, 10, 10};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(containsZero), 0.001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(oneElem), 0.001);
    assertEquals(2.5, ArrayExamples.averageWithoutLowest(list1), 0.001);
    assertEquals(10, ArrayExamples.averageWithoutLowest(list2), 0.001);
  }
}
