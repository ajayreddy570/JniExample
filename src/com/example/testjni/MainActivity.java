
package com.example.testjni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employee emp = new Employee();
        emp.name = "ajay";
        emp.id = 2152;
        sendObject(emp);
    }
    native public void  sendObject(Employee emp);
    static{
        System.loadLibrary("TestJni");
    }
}
