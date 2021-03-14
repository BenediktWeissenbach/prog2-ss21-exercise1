import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {

    //arrays with suffix "Test" start with n (number of students); arrays with out this suffix are the expected result
    private static Integer[] negativeGrades = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};
    private static Integer[] negativeGradesTest= {38, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};
    private static Integer[] eightAndThreeTest = {13, 38, 43, 48, 53, 58, 63, 68, 73, 78, 83, 88, 93, 98};
    private static Integer[] nineAndFourTest = {13, 39, 44, 49, 54, 59, 64, 69, 74, 79, 84, 89, 94, 99};
    private static Integer[] zeroAndFive = {40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
    private static Integer[] zeroAndFiveTest = {13, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};
    private static Integer[] OneAndSix = {41, 46, 51, 56, 61, 66, 71, 76, 81, 86, 91, 96, 100};
    private static Integer[] OneAndSixTest = {13, 41, 46, 51, 56, 61, 66, 71, 76, 81, 86, 91, 96, 100};
    private static Integer[] twoAndSeven = {42, 47, 52, 57, 62, 67, 72, 77, 82, 87, 92, 97, 100};
    private static Integer[] twoAndSevenTest = {13, 42, 47, 52, 57, 62, 67, 72, 77, 82, 87, 92, 97, 100};

    @Test
        /*
        Each grade in negativeGrades is lower than 38
        Therefore gradingStudents should not change the grades negativeGrades
         */
    void testGradingStudents_negativeGrades(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(negativeGradesTest));
        List<Integer> expected = Arrays.asList(negativeGrades);
        assertEquals(expected,actual);
    }

    @Test
        /*
        Each grade of eightAndThree ends either with eight or three
        Therefore gradingStudents should raise each grade by two
        Hence gradingStudents should change the list eightAndThree to a List which is identical to zeroAndFive
        (all grades in zeroAndFive end either with zero or five)
         */
    void testGradingStudents_eightAndThree(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(eightAndThreeTest));
        List<Integer> expected = Arrays.asList(zeroAndFive);
        assertEquals(expected,actual);
    }

    @Test
        /*
        Each grade of eightAndThree ends either with nine or four
        Therefore gradingStudents should raise each grade by one
        Hence gradingStudents should change the list eightAndThree to a List which is identical to zeroAndFive
        (all grades in zeroAndFive end either with zero or five)
         */
    void testGradingStudents_nineAndFour(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(nineAndFourTest));
        List<Integer> expected = Arrays.asList(zeroAndFive);
        assertEquals(expected,actual);
    }

    @Test
        /*
        All grades in zeroAndFive end either with zero or five
        Therefore gradingStudents should not change the grades in zeroAndFive
         */
    void testGradingStudents_zeroAndFive(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(zeroAndFiveTest));
        List<Integer> expected = Arrays.asList(zeroAndFive);
        assertEquals(expected,actual);
    }

    @Test
        /*
        All grades in oneAndSix end either with one or six
        Therefore gradingStudents should not change the grades in OneAndSix
         */
    void testGradingStudents_oneAndSix(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(OneAndSixTest));
        List<Integer> expected = Arrays.asList(OneAndSix);
        assertEquals(expected,actual);
    }

    @Test
        /*
        All grades in twoAndSeven end either with two or seven
        Therefore gradingStudents should not change the grades in twoAndSeven
         */
    void testGradingStudents_twoAndSeven(){
        List<Integer> actual = Result.gradingStudents(Arrays.asList(twoAndSevenTest));
        List<Integer> expected = Arrays.asList(twoAndSeven);
        assertEquals(expected,actual);
    }

}
