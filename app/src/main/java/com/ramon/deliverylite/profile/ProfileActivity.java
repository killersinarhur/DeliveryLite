package com.ramon.deliverylite.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.ramon.deliverylite.R;
import com.ramon.deliverylite.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends BaseActivity implements ProfileView {
    @BindView(R.id.profile_et_given_name)
    EditText givenName;
    @BindView(R.id.profile_et_address)
    EditText givenAddress;
    @BindView(R.id.profile_et_email)
    EditText givenEmail;
    @BindView(R.id.profile_et_phone_number)
    EditText givenPhoneNum;

    private ProfilePresenter presenter;

    public static void launch(Context context) {
        context.startActivity(new Intent(context, ProfileActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);
        presenter = new ProfilePresenter(this, datastore, datastore.getUserProfile() != null ? datastore.getUserProfile() : new UserProfile());
        presenter.onAttach(ProfileActivity.this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        presenter.onViewCreated();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetach();
    }

    @Override
    public void initializeView(UserProfile userProfile) {
        givenName.setText(userProfile.getName());
        givenEmail.setText(userProfile.getEmail());
        givenPhoneNum.setText(userProfile.getPhone());
        givenAddress.setText(userProfile.getAddressString());

    }

    @Override
    public void closeActivity() {
        finish();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.saveInstance(givenName.getText().toString(),
                givenAddress.getText().toString(),
                givenEmail.getText().toString(),
                givenPhoneNum.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @OnClick(R.id.profile_btn_submit)
    public void submitProfile() {
        presenter.persistUserProfile(givenName.getText().toString(),
                givenAddress.getText().toString(),
                givenEmail.getText().toString(),
                givenPhoneNum.getText().toString());
    }

}
