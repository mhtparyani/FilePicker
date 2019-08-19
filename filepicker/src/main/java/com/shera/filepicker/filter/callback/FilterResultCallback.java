package com.shera.filepicker.filter.callback;

import com.shera.filepicker.filter.entity.BaseFile;
import com.shera.filepicker.filter.entity.Directory;

import java.util.List;

/**
 * Created by Shera
 * Date: 2019/04/11
 * Time: 11:39
 */

public interface FilterResultCallback<T extends BaseFile> {
    void onResult(List<Directory<T>> directories);
}
