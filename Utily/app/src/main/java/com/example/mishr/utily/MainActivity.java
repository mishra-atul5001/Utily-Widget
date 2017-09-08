package com.example.mishr.utily;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.provider.AlarmClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    Button btn_whatsapp;
    Context context;
    int[] options = {R.drawable.ic_alarm_add_black_24dp,R.drawable.ic_library_music_black_24dp,R.drawable.ic_airplanemode_inactive_black_24dp,R.drawable.ic_highlight_black_24dp,R.drawable.ic_network_wifi_black_24dp,R.drawable.ic_settings_brightness_black_24dp,R.drawable.ic_signal_cellular_connected_no_internet_4_bar_black_24dp,R.drawable.ic_wifi_tethering_black_24dp};
    String[] txt_strings = {"Alarm","Music","Airplane Mode","Torch","WIFI","Brightness","Mobile Data","HotSpot"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btn_whatsapp = (Button)findViewById(R.id.buttonwhatsapp);
    GrideViewAdapterClass grideViewAdapterClass = new GrideViewAdapterClass(MainActivity.this,options,txt_strings);
        gridView = (GridView)findViewById(R.id.gridview);
        gridView.setAdapter(grideViewAdapterClass);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:     Toast.makeText(MainActivity.this,"You Clicked Case 0  " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                      /*  Intent openClockIntent = new Intent(AlarmClock.ACTION_SET_ALARM);
                        openClockIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(openClockIntent); */
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"You Clicked Case 1 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"You Clicked Case 2 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                                                            break;
                    case 3:

                        Toast.makeText(MainActivity.this,"You Clicked Case 3 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                                                      break;
                    case 4:
                        Toast.makeText(MainActivity.this,"You Clicked Case 4 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                      /*  WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                        if(wifiManager.isWifiEnabled()){
                            wifiManager.setWifiEnabled(false);
                        }else{
                            wifiManager.setWifiEnabled(true);
                        } */
                         break;
                    case 5:
                        Toast.makeText(MainActivity.this,"You Clicked Case 5 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                                          break;
                    case 6:
                        Toast.makeText(MainActivity.this,"You Clicked Case 6 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                                    break;
                    case 7:
                        Toast.makeText(MainActivity.this,"You Clicked Case 7 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                              break;
                    case 8:
                        Toast.makeText(MainActivity.this,"You Clicked Case 8 " + txt_strings[+i],Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this,"You Clicked " + txt_strings[+i],Toast.LENGTH_SHORT).show();

                }
            }
        });



        btn_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"Whatsapp Will be invoked here..!! " ,Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
        Toast.makeText(this,"Bye Byee..!!",Toast.LENGTH_SHORT).show();
    }
}

