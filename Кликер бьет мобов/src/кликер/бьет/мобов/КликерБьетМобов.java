package кликер.бьет.мобов;

import static com.sun.java.accessibility.util.AWTEventMonitor.addFocusListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class КликерБьетМобов {
    
    public static void main(String[] args) throws InterruptedException, AWTException {
        
        BOT bot = new BOT();
        bot.kill();
       
    }
    
    
}




         
