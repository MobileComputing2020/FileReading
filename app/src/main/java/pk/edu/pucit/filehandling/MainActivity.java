package pk.edu.pucit.filehandling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            String json = "";
            InputStream is = getResources().openRawResource(R.raw.data);
            byte[] data = new byte[is.available()];

            //loop will read data into byte[] data
            while (is.read(data)!=-1){
                //empty as nothing needs to be done here
            }
            json = new String(data);
            Log.i("data.json","length => "+ json.length());
            Log.i ("data.json","last 100 chars => " + json.substring(json.length()-100));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
