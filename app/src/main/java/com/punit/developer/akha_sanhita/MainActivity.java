package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity
{
    Button  btn_abhadchet,btn_bhasha,btn_chanak,btn_dambhbhakti,btn_dashvighgyani,
            btn_fatfal,btn_gyandagdh,btn_jadbhakti,btn_khalgyani,
            btn_prapanch,btn_sagunbhakti,btn_sthool,btn_sukshma,btn_vedanish,btn_vibhram;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_abhadchet = (Button)findViewById(R.id.btn_abhadchet);
        btn_bhasha = (Button)findViewById(R.id.btn_bhasha);
        btn_chanak = (Button)findViewById(R.id.btn_chanak);
        btn_dambhbhakti = (Button)findViewById(R.id.btn_dambhbhakti);
        btn_dashvighgyani = (Button)findViewById(R.id.btn_dashvighgyani);
        btn_fatfal = (Button)findViewById(R.id.btn_fatfal);
        btn_gyandagdh = (Button)findViewById(R.id.btn_gyandagdh);
        btn_jadbhakti = (Button)findViewById(R.id.btn_jadbhakti);
        btn_khalgyani = (Button)findViewById(R.id.btn_khalgyani);
        btn_prapanch = (Button)findViewById(R.id.btn_prapanch);
        btn_sagunbhakti = (Button)findViewById(R.id.btn_sagunbhakti);
        btn_sthool = (Button)findViewById(R.id.btn_sthool);
        btn_sukshma = (Button)findViewById(R.id.btn_sukshmadosh);
        btn_vedanish = (Button)findViewById(R.id.btn_Vedanish);
        btn_vibhram = (Button)findViewById(R.id.btn_vibhram);

        btn_abhadchet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Aabhadchet.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"આભડછેટનિંદા અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_bhasha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,BhashaAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ભાષા અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_chanak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ChanakAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ચાનક અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_dambhbhakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DambhBhakti.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"દંભભક્તિ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_dashvighgyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DashVighGyaniAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"દશવિધજ્ઞાની અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_fatfal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FatFalAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"કુટફળ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_gyandagdh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,GyanDagdhAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"જ્ઞાનદગ્ધ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_jadbhakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,JadbhaktiAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"જડભક્તિ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_khalgyani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  =  new Intent(MainActivity.this,KhalgyaniAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"ખળજ્ઞાની અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_prapanch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PrapanchAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"પ્રપંચ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_sagunbhakti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SagunBhaktiAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"સગુણભક્તિ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_sthool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SthoolDoshAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"શ્થુળદોષ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_sukshma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SukshmaDosh.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"સુક્ષ્મદોષ અંગ",Toast.LENGTH_LONG).show();
            }
        });
        btn_vedanish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,vedanish.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"વેષનિંદા અંગ",Toast.LENGTH_LONG).show();

            }
        });
        btn_vibhram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,VibhramAng.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"વિભ્રમ અંગ",Toast.LENGTH_LONG).show();
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.about:
                startActivity(new Intent(this,about.class));

            default:
                return super.onOptionsItemSelected(item);

        }
    }



    @Override
    public void onBackPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Exit ?");
        builder.setMessage("Are you sure ?").setPositiveButton("Yes", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialogInterface, int i)
            {
                    MainActivity.super.onBackPressed();
            }
        }).setNegativeButton("No",null).setCancelable(false);

        AlertDialog alert =builder.create();
        alert.show();
    }
}
