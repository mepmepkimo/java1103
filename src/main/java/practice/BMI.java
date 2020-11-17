package practice;

public class BMI {

    double h;
    double w;

    double calc() {
        double bmi = w / Math.pow(h / 100, 2);
        return bmi;

    }

    double calc(int sex) {
        double bmi = calc();
        switch (sex) {
            case 1://男生BMI
                bmi *= 1.1;
                break;
            case 2://女生BMI
                bmi *= 0.9;
                break;
            default:
                bmi = 0;
        }
        return bmi;

    }
}
