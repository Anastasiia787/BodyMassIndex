public class BodyMassIndexService {
    int calculate(int weight,int height){
        int BMI = (int) (weight*10000/(height*height));
        return BMI;
    }
}
