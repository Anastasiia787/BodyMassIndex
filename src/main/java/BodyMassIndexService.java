public class BodyMassIndexService {
    int calculate(int weight,double heightSm){
        double heightM = heightSm/100;
        int BMI = (int) (weight/(heightM * heightM));
        return BMI;
    }
}
