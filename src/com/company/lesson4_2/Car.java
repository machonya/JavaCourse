package com.company.lesson4_2;

public class Car {
  private   int lifting;
   private int maxSpeed;
   private long mileage;
   private String colors;

    @Override
    public String toString() {
        return "Car{" +
                "lifting=" + lifting +
                ", maxSpeed=" + maxSpeed +
                ", mileage=" + mileage +
                ", colors='" + colors + '\'' +
                '}';
    }

    public Car(int lifting, int maxSpeed, long mileage, String colors) {
        this.lifting = lifting;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.colors = colors;
    }

    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public long getMileage() {
        return mileage;
    }

    public void setMileage(long mileage) {
        this.mileage = mileage;
    }

    public void drive() {
        System.out.println(" Максимальная скорость "+maxSpeed);

    }


}
