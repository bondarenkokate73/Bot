/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package кликер.бьет.мобов;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Zver
 */
public class BOT {

public void kill() throws InterruptedException, AWTException
{
 int stech=0;
        System.out.println("Старт программы начнется через 10 секунд.");
        long start = System.currentTimeMillis();
                
                Robot robot = new Robot();
                
                Thread.sleep(10000);

                System.out.print("Программа запущена. Убито... ");
        do
        {
//                robot.keyPress(KeyEvent.VK_4);
//                robot.keyRelease(KeyEvent.VK_4);
                // Simulate a key press
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);
             //   System.out.println("Монстр выбран");5
                robot.keyPress(KeyEvent.VK_1);
                robot.keyRelease(KeyEvent.VK_1);
              //  System.out.println("Монстр убит");
                 Thread.sleep(10500);
           //      put(robot);
                 
                stech++;
                System.out.print(stech + "...");
                
                
    //1
        }   
        while(stech<1000);
        System.out.println("Программа остановлена. Убито мобов: " + stech);
    }
    
//    public void put( Robot robot) throws InterruptedException
//    {
//        for (int i=0; i<2; i++)
//        {
//        robot.keyPress(KeyEvent.VK_5);
//        Thread.sleep(3000);
//        robot.keyRelease(KeyEvent.VK_5);
//        }
//    }
}

