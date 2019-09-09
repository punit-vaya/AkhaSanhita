package com.punit.developer.akha_sanhita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class BhashaAng extends AppCompatActivity
{
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhasha_ang);
        tv = (TextView)findViewById(R.id.Content_bhasha);
        tv.setText("ભાષા અંગ\n" +
                "\n" +
                "ભાષાને શું વળગે ભૂર, જે રણમાં જીતે તે શૂર; \n" +
                "\n" +
                "સંસ્કૃત બોલે તે શું થયું, કાંઇ પ્રાકૃતમાંથી નાસી ગયું;\n" +
                "\n" +
                "બાવનનો સઘળો વિસ્તાર, અખા ત્રેપનમો જાણે પાર. ૨૪૬ \n" +
                "\n" +
                "સંસ્કૃત પ્રાકૃત જેવડે ભણે, જેમ કાષ્ટવેષે રહ્યો ભાથા કણે; \n" +
                "\n" +
                "તે છોડ્યાં બાણો નાવે અર્થ, તેમ પ્રાકૃતવિના સંસ્કૃત તે વ્યર્થ;\n" +
                "\n" +
                "બધા દામ વેપારી લખે, અખા વ્યાજ નોય છુટા પખે. ૨૪૭ \n" +
                "\n" +
                "હરખે કરખે અનુભવ કશા, આકાશ ઉદરમાં વરતે દશે દિશા; \n" +
                "\n" +
                "જ્યારે જેનું રાજજ જાણ, ત્યારે માનવી તેની આણ;\n" +
                "\n" +
                "જ્ઞાનગગનમાં નોહે દેશકાળ, એતો અખા અજાણ્યા બોલે આળ. ૨૪૮ \n" +
                "\n" +
                "જ્ઞાનાધિક નોય સિદ્ધિવડે, સિદ્ધિનામ શણગારે પડે; \n" +
                "\n" +
                "એક મની કહાવે સાધવી, તેમ સેજ ન ઇચ્છે સિધિ વાધવી;\n" +
                "\n" +
                "અખા અણલિંગી નાવે સંસાર, એતો ફોકટ માયા ઉડાવે વાર. ૨૪૯ \n" +
                "\n" +
                "અષ્ટમહાસિદ્ધિ ઇશ્વરને વિષે, તેને વેદ માયા કરી લખે; \n" +
                "\n" +
                "તેની કણ્યકા તે આ જીવ, તો સિદ્ધિસહિત કેમ થાએ શિવ;\n" +
                "\n" +
                "લોકપતિ જે તે સિધ્યવડે, અખા અનુભવને કાંઇ ન અડે. ૨૫૦ \n" +
                "\n" +
                "મુળગો અહંરોગ નહિ ટળ્યો, તેમાં સિદ્ધિરૂપી ભરમજ ભળ્યો; \n" +
                "\n" +
                "જેમ પેલો ઘેલો હોય બુધ્યવિષે, વળી વ્યસને લાગ્યો માદકભખે;\n" +
                "\n" +
                "અખા અહંકારને ટાળી જોય, તું ન રહે તો સિદ્ધિસાથે સિદ મો‘ય. ૨૫૧ \n" +
                "\n" +
                "પોત ન લહ્યું પછે પોતે થયા, ઉત્તમ મધ્યમ વ્યસને વહ્યા; \n" +
                "\n" +
                "માયાકૃતનો નાવે અંત, માને નહિ તો જો વેદાંત;\n" +
                "\n" +
                "અખા ઉપનું ન માને આધ, ક્રયવિક્રય વિના શી વ્રધ્ય. ૨૫૨ \n" +
                "\n" +
                "પ્રપંચ પ્રીછી જોયો ખરો, નહિ ઉપજ ને નહિ તો વરો; \n" +
                "\n" +
                "જ્યાથું ઉપનું ત્યાં નવ ઘટે, શઢ વળે જ્યાં જઇ આવટે;\n" +
                "\n" +
                "જાતું મરતું દીસે ખરૂં, અંતે અખા ભર્યાનું ભર્\u200Dયું. ૨૫૩ \n" +
                "\n" +
                "જેમ દુધે ફીણ ફિસોટા થાય, તોલ ન વધે આકાશ રૂંધાય; \n" +
                "\n" +
                "જેમ અગ્નિયોગે જળ ઉભરે, તેમ તત્વે તત્વ જગત અવતરે;\n" +
                "\n" +
                "વકર્યા તત્વ ધરે રૂપ નામ, અખા ઉત્પત લે ઠામનું ઠામ. ૨૫૪ \n" +
                "\n" +
                "પંચતણાં પચવિશે તત્વ, વાસનાલિંગ તે તેનું સત્વ; \n" +
                "\n" +
                "ભૂત ભૂત પ્રત્યે વિચરે, અને મૃત્યુ નામ પરપોટો મરે;\n" +
                "\n" +
                "ભૂતકલ્લોલ સદા સર્વદા, ચિદ્વિલાસ અખા મન મુદા. ૨૫૫ \n" +
                "\n" +
                "ચલનવલન તે ચેતનતણી, પંચરૂપે આપે થયો ધણી; \n" +
                "\n" +
                "આપ આપમાંહી વિસ્તર્યું, ન કર્યા સરખું તે ત્યાં કર્યું;\n" +
                "\n" +
                "જેમ છે તેમનું તેમ છે જાણ, સમજે સાન અખા નિર્વાણ. ૨૫૬ \n");
    }
}