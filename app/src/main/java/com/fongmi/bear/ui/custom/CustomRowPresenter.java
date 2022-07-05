package com.fongmi.bear.ui.custom;

import android.annotation.SuppressLint;

import androidx.leanback.widget.HorizontalGridView;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.RowPresenter;

import com.fongmi.bear.utils.ResUtil;

public class CustomRowPresenter extends ListRowPresenter {

    private final int spacing;

    public CustomRowPresenter(int spacing) {
        this.spacing = spacing;
        setShadowEnabled(false);
        setSelectEffectEnabled(false);
        setKeepChildForeground(false);
    }

    @Override
    @SuppressLint("RestrictedApi")
    protected void initializeRowViewHolder(RowPresenter.ViewHolder holder) {
        super.initializeRowViewHolder(holder);
        ViewHolder vh = (ViewHolder) holder;
        vh.getGridView().setHorizontalSpacing(ResUtil.dp2px(spacing));
        vh.getGridView().setFocusScrollStrategy(HorizontalGridView.FOCUS_SCROLL_ITEM);
    }
}