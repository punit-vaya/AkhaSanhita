package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.TelecomManager;
import android.widget.TextView;

public class ChanakAng extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chanak_ang);

        TextView tv = (TextView)findViewById(R.id.Content_chanak);
        tv.setText("ચાનક અંગ\n" +
                "\n" +
                "હઠ કરી નૈં ઓળખ્યા હરિ,કાચો જીવ જાશે નિસરી; \n" +
                "\n" +
                "જેમ નિંભાડે ભાજન કાચું રયું,ન સયું કામ માટિથું ગયું;\n" +
                "\n" +
                "છતી બુદ્ધિયે હરિ નૈં અભ્યસ્યો,તો ડાહ્યા થતાં ઠેકાણે થશો. ૨૧૩ \n" +
                "\n" +
                "ભણ્યા ગણ્યા ભલે પાકે પંચ,ન્યાય ઉકેલે જાણે સંચ; \n" +
                "\n" +
                "સભાપતિ થઇ બેસે મધ્ય,આતમની નવ જાણે વિધ;\n" +
                "\n" +
                "અખા ક્યાંય નવ કુંવારિ ગાય,ઠાલા આવ્યા ને ભૂલા જાય. ૨૧૪ \n" +
                "\n" +
                "મૂક મછર(મત્સર) ને પરહર માન,ચતુરાઇ સામું છે જાંન; (હાનિ); \n" +
                "\n" +
                "કરકરો થયે કાળ નવ બિયે,જોરે જમ જીત્યો છે કિયે;\n" +
                "\n" +
                "ગળિત થશે ઉતરશે ગાળ,અખા હરિ મળવાનો એ કાળ. ૨૧૫ \n" +
                "\n" +
                "નિત્ય નિમિત્ત બે માથે પડ્યાં,જેમ બાળક હીંડે કાંધે ચડ્યાં; \n" +
                "\n" +
                "પુણ્ય ન લાગે પાડ ન થાય,પેર પડ્યાં કેમ નાખ્યાં જાય;\n" +
                "\n" +
                "નિષ્કર્મ થઇ નર હરિને જાણ,તો જ અખા ટળશે તું જ તાણ્ય. ૨૧૬ \n");
    }
}
