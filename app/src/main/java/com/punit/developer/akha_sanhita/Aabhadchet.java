package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Aabhadchet extends AppCompatActivity
{
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aabhadchet);
        tv = (TextView)findViewById(R.id.Content_abhadchet);
        tv.setText("આભડછેટનિંદા અંગ\n" +
                "\n" +
                "આભડછેટ અંત્યજની જણી,બ્રાહ્મણ વૈષ્ણવ કીધા ધણી; \n" +
                "\n" +
                "બારે માસ ભોગવે એ બે,સૌને ઘેર આવી ગઇ રહે;\n" +
                "\n" +
                "અખા હરિ જાણે જડ જાય,નૈં તો મનસા વાચા પેશીરે ક્યાંય. ૯ \n" +
                "\n" +
                "પોતાનાં પડખાં નવ જુવે,હાડ ચામડા મુરખ ધુવે; \n" +
                "\n" +
                "શુદ્ધ કેમ થાય જો ચામડું,મોટું માંહે એ વાંકડું;\n" +
                "\n" +
                "હરી જાણ્યા વિના ભૂલા ભમે,અખા પાર ન પામે ક્યમે. ૧૦ \n" +
                "\n" +
                "ઇશ્વર જાણે તે આચાર,એ તો છે ઉપલો ઉપચાર; \n" +
                "\n" +
                "મીઠાં મૌડાં માન્યાં દ્રાક્ષ,અન્ન નોય અન્નમાંની રાખ;\n" +
                "\n" +
                "સોનામખી સોનું નવ થાય,અખા આંધળીને પાથરતાં વાણું વાય. ૧૧ \n");
    }
}
