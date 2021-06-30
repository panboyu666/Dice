package pan.bu.yu;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

public class ServiceA extends Service {
    public static MediaPlayer mp ;

    @Override
    public void onCreate(){
        super.onCreate();
        mp =MediaPlayer.create(this, R.raw.background);
        mp.setLooping(true);
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("LocalService", "Received start id " + startId + ": " + intent);

        mp.start();

        return START_STICKY;


   }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.w("boobs","onBind");
        return null;
    }
}
