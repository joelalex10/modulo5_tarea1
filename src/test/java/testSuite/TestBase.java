package testSuite;

import activities.AlarmTabActivity;
import activities.DeskClockActivity;
import activities.RelojTabActivity;
import activities.TimeZoneListActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singletonSession.Session;

public class TestBase {

    protected DeskClockActivity deskClockActivity;
    protected AlarmTabActivity alarmTabActivity;
    protected RelojTabActivity relojTabActivity;
    protected TimeZoneListActivity timeZoneListActivity;

    @BeforeEach
    public void openApp(){
        deskClockActivity = new DeskClockActivity();
        alarmTabActivity = new AlarmTabActivity();
        relojTabActivity = new RelojTabActivity();
        timeZoneListActivity = new TimeZoneListActivity();
    }
    @AfterEach
    public void closeApp(){
        Session.getInstance().closeSession();
    }
}
