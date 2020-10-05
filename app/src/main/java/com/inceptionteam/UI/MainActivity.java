package com.inceptionteam.UI;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.inceptionteam.Android.AndroidFragment;
import com.inceptionteam.HR.HrFragment;
import com.inceptionteam.Home.HomeFragment;
import com.inceptionteam.Menu.Callback;
import com.inceptionteam.Menu.MenuAdapter;
import com.inceptionteam.Menu.MenuItem;
import com.inceptionteam.Menu.MenuUtil;
import com.inceptionteam.PR.PrFragment;
import com.inceptionteam.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Callback {

    Context mContext;
    RecyclerView menuRv;
    List<MenuItem> menuItems;
    MenuAdapter adapter;
    int selectedMenuPos = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.getWindow().setStatusBarColor(0xFFFFFF);
        mContext = getApplicationContext();
        // setup side menu
        setupSideMenu();
    }
    private void setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu);
        menuItems = MenuUtil.getMenuList();
        adapter = new MenuAdapter(menuItems,this , mContext);
        menuRv.setLayoutManager(new LinearLayoutManager(this));
        menuRv.setAdapter(adapter);

    }

    @Override
    public void onSideMenuItemClick(int i) {

        switch (menuItems.get(i).getCode()){
            case MenuUtil.HOME_FRAGMENT_CODE :
                setHomeFragment();
                break;
            case MenuUtil.Android_FRAGMENT_CODE :
                setAndroidFragment();
                break;
            case MenuUtil.HR_FRAGMENT_CODE:
                setHRFragment();
                break;
            case MenuUtil.PR_FRAGMENT_CODE:
                setPRFragment();
                break;
            default:
                setHomeFragment();
        }

        // change the selected menu item
        menuItems.get(selectedMenuPos).setSelected(false);
        menuItems.get(i).setSelected(true);
        selectedMenuPos = i ;
        adapter.notifyDataSetChanged();
    }

    private void setPRFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container , new PrFragment()).commit();
    }

    private void setHRFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container , new HrFragment()).commit();
    }

    private void setAndroidFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container , new AndroidFragment()).commit();
    }

    private void setHomeFragment() {
        getSupportFragmentManager().beginTransaction().replace(R.id.container , new HomeFragment()).commit();
    }

}