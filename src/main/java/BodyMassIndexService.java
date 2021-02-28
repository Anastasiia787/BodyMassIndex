public class BodyMassIndexService {
    double calculate(double weight,double heightSm){
        double heightM = heightSm/100;
        double bmi = weight/(heightM * heightM);
        return bmi;
    }
}
