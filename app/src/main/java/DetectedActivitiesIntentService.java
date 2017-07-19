import android.app.IntentService;
import android.content.Intent;

/**
 * Created by DIPANSH KHANDELWAL on 19-07-2017.
 */

public class DetectedActivitiesIntentService extends IntentService{

    protected static final String TAG = "detection_is";

    public DetectedActivitiesIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
