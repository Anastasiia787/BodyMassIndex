public class BodyMassIndexService {
    double calculate(double weight,double heightSm){
        double heightM = heightSm/100;
        double BMI = weight/(heightM * heightM);
        return BMI;
    }
}
