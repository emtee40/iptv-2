package com.iptv.core;

import android.view.Surface;

import com.iptv.core.channel.ChannelGroup;

public interface IPTVClient {
    /**
     * 事件回调
     */
    interface Listener {
        /**
         * 加载频道表完毕
         */
        void onLoadChannelTableComplete(ChannelGroup[] groups);

        /**
         * 加载媒体完毕
         */
        void onLoadMediaComplete();

        /**
         * 出错
         */
        void onError(String error);
    }

    /**
     * 注册事件回调
     */
    void setListener(Listener listener);

    /**
     * 加载频道表
     */
    void loadChannelTable();

    /**
     * 选择频道源
     */
    void loadMedia(String url);

    /**
     * 设置输出画面
     */
    void setOutputSurface(Surface surface);

    /**
     * 开始播放
     */
    void startPlay();

    /**
     * 停止播放
     */
    void stopPlay();

    /**
     * 设置音量
     */
    void setVolume(float volume);

    /**
     * 释放
     */
    void release();
}
