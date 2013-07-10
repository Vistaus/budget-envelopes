package com.notriddle.budget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class SimpleEnvelopesAdapter extends SimpleCursorAdapter {
    static final String[] FROM = new String[] {
        "name"
    };
    static final int[] TO = new int[] {
        android.R.id.text1
    };
    public SimpleEnvelopesAdapter(Context cntx, Cursor csr) {
        super(cntx, android.R.layout.simple_list_item_1, csr, FROM, TO, 0);
    }
    public SimpleEnvelopesAdapter(Context cntx, Cursor csr, int layout) {
        super(cntx, layout, csr, FROM, TO, 0);
    }
    @Override public View newDropDownView(Context cntx, Cursor csr,
                                          ViewGroup parent) {
        View retVal = LayoutInflater.from(cntx).inflate(
            android.R.layout.simple_spinner_dropdown_item,
            parent,
            false
        );
        bindView(retVal, cntx, csr);
        return retVal;
    }
}
