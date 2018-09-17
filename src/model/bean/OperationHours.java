
package model.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class OperationHours {
    
    private Date openingTime[];
    private Date closingTime[];
    private boolean openToday[];
    
    private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    
    public OperationHours(int idBar) {
        
        Calendar calopen = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calopen.set(Calendar.HOUR, calopen.get(Calendar.HOUR) - 2);
        
        Calendar calclose = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calclose.set(Calendar.HOUR, calclose.get(Calendar.HOUR) + 2);
        
        Date open = calopen.getTime();
        Date close = calclose.getTime();
        
        openingTime = new Date[]{open, open, open, open, open, open, open};
        closingTime = new Date[]{close, close, close, close, close, close, close};
        openToday = new boolean[]{true, true, true, true, true, true, true};
       
    }
    
    private int getIndexWeek(){
        Calendar currentCalendar = Calendar.getInstance();
        
        return currentCalendar.get(Calendar.DAY_OF_WEEK); 
    }
    
    public boolean isOpenToday(){
        return openToday[getIndexWeek()-1];
    }
    
    public boolean isOpenNow(){
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.set(Calendar.HOUR, currentCalendar.get(Calendar.HOUR));
        Date currentDate = currentCalendar.getTime();
        int currentDayOfWeek = currentCalendar.get(Calendar.DAY_OF_WEEK);

        Date currentClosingTime = this.closingTime[currentDayOfWeek-1];
        Date currentOpeningTime = this.openingTime[currentDayOfWeek-1];
        
        boolean openNow = currentDate.after(currentOpeningTime) && 
                          currentDate.before(currentClosingTime);
        
        return this.isOpenToday() && openNow;
    }
    
    
    
}
