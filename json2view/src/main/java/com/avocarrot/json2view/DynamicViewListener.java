package com.avocarrot.json2view;

import android.view.View;

/**
 * Created by kolja on 09.09.2016.
 */
public interface DynamicViewListener {

	Object getViewHolderParams(View generatedParent);

}
