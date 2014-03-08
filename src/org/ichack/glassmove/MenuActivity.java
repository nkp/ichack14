package org.ichack.glassmove;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }


  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
  
  @Override
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    openOptionsMenu();
  }

  @Override
  public void onOptionsMenuClosed(Menu menu) {
    // Nothing else to do, closing the activity.
    finish();
  }
  
  
  @Override
  public void onDestroy() {
    super.onDestroy();
    finish();
  }
  
}
