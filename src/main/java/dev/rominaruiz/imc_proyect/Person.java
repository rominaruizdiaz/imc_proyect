package dev.rominaruiz.imc_proyect;

public class Person {
    private double weight;
    private double height;

    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    public double calculateImc() {
        return weight / (height * height);
    }

    public String determineWeight() {

        double imc = calculateImc();


        if (imc < 16) {
            return "delgadez severa";
        } else if (imc >= 16 && imc < 17) {
            return "delgadez moderada";
        } else if (imc >= 17 && imc < 18.5) {
            return "delgadez leve";
        } else if (imc >= 18.5 && imc < 25) {
            return "peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "obesidad leve";
        } else if (imc >= 35 && imc < 40) {
            return "obesidad moderada";
        } else {
            return "obesidad mórbida";
        }
    }
    
}
