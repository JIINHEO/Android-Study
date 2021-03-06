// Generated by view binder compiler. Do not edit!
package com.example.kotlinstudy3_recycler.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.kotlinstudy3_recycler.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecyclerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView textData;

  @NonNull
  public final TextView textNo;

  @NonNull
  public final TextView textTitle;

  private ItemRecyclerBinding(@NonNull LinearLayout rootView, @NonNull TextView textData,
      @NonNull TextView textNo, @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.textData = textData;
    this.textNo = textNo;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecyclerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecyclerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recycler, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecyclerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.textData;
      TextView textData = rootView.findViewById(id);
      if (textData == null) {
        break missingId;
      }

      id = R.id.textNo;
      TextView textNo = rootView.findViewById(id);
      if (textNo == null) {
        break missingId;
      }

      id = R.id.textTitle;
      TextView textTitle = rootView.findViewById(id);
      if (textTitle == null) {
        break missingId;
      }

      return new ItemRecyclerBinding((LinearLayout) rootView, textData, textNo, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
