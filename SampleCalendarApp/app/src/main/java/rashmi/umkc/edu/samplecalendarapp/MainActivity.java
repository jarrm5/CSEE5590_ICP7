package rashmi.umkc.edu.samplecalendarapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.displaycalendareventintent.R;

public class MainActivity extends Activity {

    CalendarView mCalendarView;
    TextView mCurrentDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCalendarView = (CalendarView)findViewById(R.id.simpleCalendarView);
        mCurrentDate = (TextView)findViewById(R.id.current_date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        mCurrentDate.setText(simpleDateFormat.format(date));

        mCalendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                // display the selected date by using a toast
                String dateString = (month + "/" + dayOfMonth + "/" + year);
                mCurrentDate.setText(dateString);
            }
        });
    }


}