package com.example.emreakcan.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import junit.framework.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends Activity {
    private View hiddenPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<TestItem> b = new ArrayList<>();
        b.add(new TestItem("a", "1"));
        b.add(new TestItem("b", "2"));
        b.add(new TestItem("c", "3"));
        b.add(new TestItem("d", "4"));

        test(b,"id","value");
        System.out.println("---------TEST 1");
        ArrayList<Test2Item> c = new ArrayList<>();
        c.add(new Test2Item("x", "1"));
        c.add(new Test2Item("y", "2"));
        c.add(new Test2Item("z", "3"));
        c.add(new Test2Item("d", "4"));

        test(c,"testValue","value");
        System.out.println("---------TEST 2");


    }

    public void test(ArrayList<?> a, String id, String value) {
        if(!a.isEmpty()){
            for (int i = 0; i < a.size(); i++) {

                try {
                    Field field1 = a.get(i).getClass().getDeclaredField(value);
                    Field field2 = a.get(i).getClass().getDeclaredField(id);

                    field1.setAccessible(true);

                    Object value2 = field1.get(a.get(i));
                    Object value1 = field2.get(a.get(i));

                    System.out.println(value2.toString()  + "  " + value1.toString());

                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }

            }
        }
    }





}