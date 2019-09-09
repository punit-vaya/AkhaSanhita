package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView tv_about = (TextView)findViewById(R.id.tv_about);
        tv_about.setText("જન્મની વિગત :\t-૧૫૯૧  \n" +
                "મૃત્યુની વિગત :\t-૧૬૫૬  \n" +
                "વ્યવસાય :\tલેખક, કવિ; \n" +
                "કાર્યો :\t-અખાના છપ્પા, અખેગીતા, પંચીકરણ, અનુભવબિંદુ, કૈવલ્યગીતા, બ્રહ્મલીલા \n" +
                "\n" +
                "અખા રહિયાદાસ સોની[૧] (આશરે ૧૬૧૫ - આશરે ૧૬૭૪) જેઓ અખા ભગત અથવા અખો તરીકે વધુ જાણીતા છે, \n" +
                "ગુજરાતી ભાષાના પ્રાચીન કવિઓ પૈકીના એક છે. \n"+
                "તેઓ બહુ શરૂઆતનાં ગુજરાતી સાહિત્યકારોમાંનાં એક છે.\n" +
                "તેમની ગણના સલ્તનતી સમયગાળામાં થઇ ગયેલા ગુજરાતીનાં ત્રણ મોટા સાહિત્યકારોમાં થાય છે.\n");
    }
}
