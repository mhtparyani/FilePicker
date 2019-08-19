package com.vincent.filepicker.adapter;

/**
 * Created by Shera
 * Date: 2019/04/14
 * Time: 16:06
 */

public interface OnSelectStateListener<T> {
    void OnSelectStateChanged(boolean state, T file);
}
