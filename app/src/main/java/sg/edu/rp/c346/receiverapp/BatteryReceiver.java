package sg.edu.rp.c346.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 17010578 on 15/8/2018.
 */

public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast myToast = Toast.makeText(context,"Low Battery", Toast.LENGTH_LONG);
        myToast.show();

    }
}
