import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < grades.get(0); i++){
            //negative grades will not be changed
            if(grades.get(1 + i) > 37){
                //positive grades which end with either 3 or 8 will be raised by 2
                if(grades.get(1 + i) % 10 == 3 || grades.get(1 + i) % 10 == 8){
                    grades.set(1 + i, grades.get(1 + i) + 2);
                //positive grades which end with either 4 or 9 will be raised by 1
                }else if(grades.get(1 + i) % 10 == 4 || grades.get(1 + i) % 10 == 9){
                    grades.set(1 + i, grades.get(1 + i) + 1);
                }
            }
        }

        for(int i = 0; i < (grades.size() - 1); i++){
            result.add(grades.get(1 + i));
        }

        return result;
    }
}
