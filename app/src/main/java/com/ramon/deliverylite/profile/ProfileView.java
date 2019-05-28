package com.ramon.deliverylite.profile;

import com.ramon.deliverylite.base.MVPView;

public interface ProfileView extends MVPView {
    void initializeView(UserProfile userProfile);

    void closeActivity();
}
