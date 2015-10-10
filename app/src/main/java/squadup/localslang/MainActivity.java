package squadup.localslang;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import squadup.localslang.R;
import squadup.localslang.expandListView.Adapter.ExpandListAdapter;
import squadup.localslang.expandListView.Classes.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    private ExpandListAdapter ExpAdapter;
    private ArrayList<ExpandListGroup> ExpListItems;
    private ExpandableListView ExpandList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExpandList = (ExpandableListView) findViewById(R.id.ExpList);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter(MainActivity.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);
    }

    public ArrayList<ExpandListGroup> SetStandardGroups() {
        ArrayList<ExpandListGroup> list = new ArrayList<ExpandListGroup>();
        ArrayList<ExpandListChild> list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru1 = new ExpandListGroup();
        gru1.setName("Hip");
        ExpandListChild ch1_1 = new ExpandListChild();
        ch1_1.setName("Aware of, knowledgeable about");
        ch1_1.setTag(null);
        list2.add(ch1_1);
        gru1.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru3 = new ExpandListGroup();
        gru3.setName("HoCo");
        ExpandListChild ch3_1 = new ExpandListChild();
        ch3_1.setName("Howard County, Maryland");
        ch3_1.setTag(null);
        list2.add(ch3_1);
        gru3.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru4 = new ExpandListGroup();
        gru4.setName("MoCo");
        ExpandListChild ch4_1 = new ExpandListChild();
        ch4_1.setName("Montgomery County, Maryland");
        ch4_1.setTag(null);
        list2.add(ch4_1);
        gru4.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru5 = new ExpandListGroup();
        gru5.setName("Sice");
        ExpandListChild ch5_1 = new ExpandListChild();
        ch5_1.setName("To overhype something / to be excite");
        ch5_1.setTag(null);
        list2.add(ch5_1);
        gru5.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru6 = new ExpandListGroup();
        gru6.setName("Cakey");
        ExpandListChild ch6_1 = new ExpandListChild();
        ch6_1.setName("having an appealing buttocks");
        ch6_1.setTag(null);
        list2.add(ch6_1);
        gru6.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru7 = new ExpandListGroup();
        gru7.setName("swiggity");
        ExpandListChild ch7_1 = new ExpandListChild();
        ch7_1.setName("smoking week / being high");
        ch7_1.setTag(null);
        list2.add(ch7_1);
        gru7.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru8 = new ExpandListGroup();
        gru8.setName("finesse");
        ExpandListChild ch8_1 = new ExpandListChild();
        ch8_1.setName("to do well after being tasked with something; the attempt to impress a girl enough for her to want to mate ");
        ch8_1.setTag(null);
        list2.add(ch8_1);
        gru8.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru9 = new ExpandListGroup();
        gru9.setName("headass/faceass");
        ExpandListChild ch9_1 = new ExpandListChild();
        ch9_1.setName("a word used as a nominative pronoun to make aware that what they're doing is not okay");
        ch9_1.setTag(null);
        list2.add(ch9_1);
        gru9.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru10 = new ExpandListGroup();
        gru10.setName("alias");
        ExpandListChild ch10_1 = new ExpandListChild();
        ch10_1.setName("someone / something with unknown whereabouts");
        ch10_1.setTag(null);
        list2.add(ch10_1);
        gru10.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru11 = new ExpandListGroup();
        gru11.setName("Takashi");
        ExpandListChild ch11_1 = new ExpandListChild();
        ch11_1.setName("a popular local rapper/producer");
        ch11_1.setTag(null);
        list2.add(ch11_1);
        gru11.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru12 = new ExpandListGroup();
        gru12.setName("Saki");
        ExpandListChild ch12_1 = new ExpandListChild();
        ch12_1.setName("HoCo renowned drug dealer for non-weed substances, MLG League of Legends player ");
        ch12_1.setTag(null);
        list2.add(ch10_1);
        gru12.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru13 = new ExpandListGroup();
        gru13.setName("Cuff");
        ExpandListChild ch13_1 = new ExpandListChild();
        ch13_1.setName("to put someone in a relationship ");
        ch13_1.setTag(null);
        list2.add(ch13_1);
        gru13.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru14 = new ExpandListGroup();
        gru14.setName("Cuffed");
        ExpandListChild ch14_1 = new ExpandListChild();
        ch14_1.setName("to be in a relationship");
        ch14_1.setTag(null);
        list2.add(ch14_1);
        gru14.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru15 = new ExpandListGroup();
        gru15.setName("The Cuffing Season");
        ExpandListChild ch15_1 = new ExpandListChild();
        ch15_1.setName("A period of time, October 15 - February 15, where girls attempt to swindle guys into being in an exclusive relationship");
        ch15_1.setTag(null);
        list2.add(ch15_1);
        gru15.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru16 = new ExpandListGroup();
        gru16.setName("In the cut");
        ExpandListChild ch16_1 = new ExpandListChild();
        ch16_1.setName("far away from relevant areas/in an area that is hard to find");
        ch16_1.setTag(null);
        list2.add(ch16_1);
        gru16.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru17 = new ExpandListGroup();
        gru17.setName("Jew Crew");
        ExpandListChild ch17_1 = new ExpandListChild();
        ch17_1.setName("a group of attractive females known all around the eastern United States, particularly Howard County, who are majoritively Jewish");
        ch17_1.setTag(null);
        list2.add(ch17_1);
        gru17.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru18 = new ExpandListGroup();
        gru18.setName("PG");
        ExpandListChild ch18_1 = new ExpandListChild();
        ch18_1.setName("Prince George’s County");
        ch18_1.setTag(null);
        list2.add(ch18_1);
        gru18.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru19 = new ExpandListGroup();
        gru19.setName("Moves");
        ExpandListChild ch19_1 = new ExpandListChild();
        ch19_1.setName("the right thing to do");
        ch19_1.setTag(null);
        list2.add(ch19_1);
        gru19.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru20 = new ExpandListGroup();
        gru20.setName("Geekin’");
        ExpandListChild ch20_1 = new ExpandListChild();
        ch20_1.setName("overly excited/ laughing excessively");
        ch20_1.setTag(null);
        list2.add(ch20_1);
        gru20.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru21 = new ExpandListGroup();
        gru21.setName("Whip");
        ExpandListChild ch21_1 = new ExpandListChild();
        ch21_1.setName("car");
        ch21_1.setTag(null);
        list2.add(ch21_1);
        gru21.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru22 = new ExpandListGroup();
        gru22.setName("Jah’");
        ExpandListChild ch22_1 = new ExpandListChild();
        ch22_1.setName("very");
        ch22_1.setTag(null);
        list2.add(ch22_1);
        gru22.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru23 = new ExpandListGroup();
        gru23.setName("rt");
        ExpandListChild ch23_1 = new ExpandListChild();
        ch23_1.setName("”real talk”");
        ch23_1.setTag(null);
        list2.add(ch23_1);
        gru23.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru24 = new ExpandListGroup();
        gru24.setName("THOT");
        ExpandListChild ch24_1 = new ExpandListChild();
        ch24_1.setName("”that hoe over there”");
        ch24_1.setTag(null);
        list2.add(ch24_1);
        gru24.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();


        ExpandListGroup gru25 = new ExpandListGroup();
        gru25.setName("Fleek");
        ExpandListChild ch25_1 = new ExpandListChild();
        ch25_1.setName("On point");
        ch25_1.setTag(null);
        list2.add(ch25_1);
        gru25.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru26 = new ExpandListGroup();
        gru26.setName("Peep");
        ExpandListChild ch26_1 = new ExpandListChild();
        ch26_1.setName("to see");
        ch26_1.setTag(null);
        list2.add(ch26_1);
        gru26.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru27 = new ExpandListGroup();
        gru27.setName("Dip");
        ExpandListChild ch27_1 = new ExpandListChild();
        ch27_1.setName("to leave");
        ch27_1.setTag(null);
        list2.add(ch27_1);
        gru27.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru28 = new ExpandListGroup();
        gru28.setName("Finna");
        ExpandListChild ch28_1 = new ExpandListChild();
        ch28_1.setName("want to");
        ch28_1.setTag(null);
        list2.add(ch28_1);
        gru28.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru29 = new ExpandListGroup();
        gru29.setName("Jah blazing");
        ExpandListChild ch29_1 = new ExpandListChild();
        ch29_1.setName("very hot");
        ch29_1.setTag(null);
        list2.add(ch29_1);
        gru29.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru30 = new ExpandListGroup();
        gru30.setName("Jah burr");
        ExpandListChild ch30_1 = new ExpandListChild();
        ch30_1.setName("very cold");
        ch30_1.setTag(null);
        list2.add(ch30_1);
        gru30.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        list.add(gru1);
        //list.add(gru2);
        list.add(gru3);
        list.add(gru4);
        list.add(gru5);
        list.add(gru6);
        list.add(gru7);
        list.add(gru8);
        list.add(gru9);
        list.add(gru10);
        list.add(gru11);
        list.add(gru12);
        list.add(gru13);
        list.add(gru14);
        list.add(gru15);
        list.add(gru16);
        list.add(gru17);
        list.add(gru18);
        list.add(gru19);
        list.add(gru20);
        list.add(gru21);
        list.add(gru22);
        list.add(gru23);
        list.add(gru24);
        list.add(gru25);
        list.add(gru26);
        list.add(gru27);
        list.add(gru28);
        list.add(gru29);
        list.add(gru30);

        return list;
    }

}