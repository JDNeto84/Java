package BMI;

public class People {

    // Attributes

    private float weightPerson = 0;
    private float heightPerson = 0;
    private double bmiPerson;

    // Constructor Method

    public People(float weightPerson, float heightPerson) {

        this.weightPerson = weightPerson;
        this.heightPerson = heightPerson;

    }

    public float calcBMI() {

        float bmiPerson = weightPerson / (heightPerson * heightPerson);

        this.bmiPerson = bmiPerson;

        return bmiPerson;
    }

    public void returnBMI() {

        if (bmiPerson < 18.5) {

            System.out.println("SLIM Ranking Obesity O");

        } else {
            if (bmiPerson < 24.9) {

                System.out.println("NORMAL Ranking Obesity O");

            } else {
                if (bmiPerson < 29.9) {

                    System.out.println("OVERWEIGHT Ranking Obesity I");

                } else {
                    if (bmiPerson < 39.9) {

                        System.out.println("OBESITY Ranking Obesity II");
                    } else {

                        System.out.println("SEVERE OBESITY Ranking Obesity III");
                    }
                }

            }
        }
    }

    // Accessor Methods

    public void setWeightPerson(float weightPerson) {

        this.weightPerson = weightPerson;

    }

    public float getWeightPerson() {

        return weightPerson;
    }

    public void setHeightPerson(float heightPerson) {

        this.heightPerson = heightPerson;

    }

    public float getHeightPerson() {

        return heightPerson;
    }

}
