package com.orgzly.android.ui.views.style

import android.text.TextPaint
import android.text.style.ClickableSpan
import android.view.View
import com.orgzly.android.ui.views.ActionableTextView
import com.orgzly.android.ui.views.TextViewWithMarkup

class DrawerSpan(val name: String, val content: CharSequence, var isFolded: Boolean) : ClickableSpan() {
    override fun onClick(view: View) {
        if (view is ActionableTextView) {
            view.toggleDrawer(this)
        }
    }

    override fun updateDrawState(tp: TextPaint) {
        // tp.isUnderlineText = true
        // tp.color = Color.GREEN
    }
}
