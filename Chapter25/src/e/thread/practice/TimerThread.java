package e.thread.practice;

import java.util.Date;

public class TimerThread extends Thread{
	public void run() {
		printCurrentTimeFirst();
		printCurrentTime();
		
	}
	public void reduceTimeGap() {
		long currentTime=System.currentTimeMillis();
		long timeMod=currentTime%1000;
		try {
			Thread.sleep(1000-timeMod);
		} catch (Exception e) {
			
		}
	}
	public void printCurrentTimeFirst() {
		try {
			int count=0;
			while(count<10) {
				Thread.sleep(1000);
				long currentTime=System.currentTimeMillis();
				System.out.println(new Date(currentTime)+" "+currentTime);
				count++;
			}
		} catch(Exception e) {
			
		}
	}
	public void printCurrentTime() {
		try {
			int count=0;
			while(count<10) {
				long current=System.currentTimeMillis();
				System.out.println(new Date(current)+" "+current);
				Thread.sleep(900);
				reduceTimeGap();
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
