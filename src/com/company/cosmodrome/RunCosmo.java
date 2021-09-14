package com.company.cosmodrome;

public class RunCosmo {
    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle("Falcon9", 5000, 2700);
        shuttle.launch(shuttle);

        PassengerShuttle shuttle1 = new PassengerShuttle("SuperShuttle", 2500, 120, 8, 6);
        shuttle1.launch(shuttle1);




    }
}
