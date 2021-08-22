package com.company.createrobots;

public class Run {
    public static void main(String[] args) {
        SonyHead sonyHead = new SonyHead(12);
        ToshibaHead toshibaHead = new ToshibaHead(19);
        SamsungHead samsungHead = new SamsungHead(11);

        SonyHand sonyHand = new SonyHand(8);
        ToshibaHand toshibaHand = new ToshibaHand(7);
        SamsungHand samsungHand = new SamsungHand(5);

        SonyLeg sonyLeg = new SonyLeg(12);
        ToshibaLeg toshibaLeg = new ToshibaLeg(18);
        SamsungLeg samsungLeg = new SamsungLeg(14);

        Robot[] robots = new Robot[3];
        robots[0] = new Robot(sonyHead, toshibaHand, toshibaLeg);
        robots[1] = new Robot(toshibaHead, sonyHand, sonyLeg);
        robots[2] = new Robot(samsungHead, samsungHand, samsungLeg);
        int num = 0;
        for (Robot robot : robots) {
            num++;
            robot.action();
            System.out.println("robot "+num+ " cost "+ robot.getPrice());
            System.out.println();

        }

        int maxPrice = 0;
        int maxRobotPrice = 0;
        for (int i = 0; i < robots.length; i++) {
            if (robots[i].getPrice() > maxPrice) {
                maxPrice = robots[i].getPrice();
                maxRobotPrice = i + 1;
            }


        }
        System.out.println("Робот "+ maxRobotPrice + " стоимостью "+maxPrice+" самый дорогой");



    }
}
