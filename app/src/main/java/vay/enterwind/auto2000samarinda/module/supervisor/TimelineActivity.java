package vay.enterwind.auto2000samarinda.module.supervisor;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import vay.enterwind.auto2000samarinda.BaseActivity;
import vay.enterwind.auto2000samarinda.R;

public class TimelineActivity extends BaseActivity {
    private static final String TAG = "TimelineActivity";
    private static final int ACTIVITY_NUM = 3;
    private Context mContext = TimelineActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spv_timeline);
        ButterKnife.bind(this);

        setupBottomNavigationView(mContext, ACTIVITY_NUM);
    }
}
