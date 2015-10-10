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
        //Scanner scan = new Scanner(new File(HoCo.txt));
        //for(String s: scan.nextLine() ){ }

        ExpandListGroup gru1 = new ExpandListGroup();
        gru1.setName("Hip");
        ExpandListChild ch1_1 = new ExpandListChild();
        ch1_1.setName("Aware of, knowledgeable about");
        ch1_1.setTag(null);
        list2.add(ch1_1);
        gru1.setItems(list2);
        list2 = new ArrayList<ExpandListChild>();

        ExpandListGroup gru2 = new ExpandListGroup();
        gru2.setName("Cuffed");
        ExpandListChild ch2_1 = new ExpandListChild();
        ch2_1.setName("To be in a committed relationship");
        ch2_1.setTag(null);
        list2.add(ch2_1);
        gru2.setItems(list2);
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

        list.add(gru1);
        list.add(gru2);
        list.add(gru3);
        list.add(gru4);



        return list;
    }

}