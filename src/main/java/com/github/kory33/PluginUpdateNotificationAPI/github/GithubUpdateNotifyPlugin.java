package com.github.kory33.PluginUpdateNotificationAPI.github;

import com.github.kory33.PluginUpdateNotificationAPI.UpdateNotifyPlugin;

public abstract class GithubUpdateNotifyPlugin extends UpdateNotifyPlugin {

    @Override
    public boolean checkForUpdate() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return false;
    }

    @Override
    public String getUpdateLogString() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return null;
    }

    @Override
    public String getUpdatePlayerLogString() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return null;
    }

    @Override
    public String getUpToDateLogString() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return null;
    }

    @Override
    public String getUpToDatePlayerLogString() {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        return null;
    }
}
