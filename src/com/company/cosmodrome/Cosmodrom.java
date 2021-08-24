package com.company.cosmodrome;

public class Cosmodrom {

    public void launch(IStart iStart) {
        if (iStart.systemCheck()){
                iStart.engineStart();
                Timer timer = new Timer();
                timer.runTimer();
                iStart.start();
            }

        }
        }


