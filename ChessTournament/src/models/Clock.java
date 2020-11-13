package models;

public class Clock extends Naming {

    private int totalTime;
    private int tick;
   

    Clock() {
        System.out.println("Clock time is.");
        this.totalTime = 15;
        this.tick = 15;
    }

    Clock(int totalTime) {
        this.totalTime = totalTime;
        this.tick = 15;
    }     
    
    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getTick() {
        return tick;
    }

    public void setTick(int tick) {
        this.tick = tick;
    }
    
    public int Tick (){
        return this.totalTime = this.totalTime - this.tick;
    }

}
