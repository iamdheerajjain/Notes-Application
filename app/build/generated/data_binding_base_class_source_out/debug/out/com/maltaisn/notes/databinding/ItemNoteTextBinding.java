// Generated by view binder compiler. Do not edit!
package com.maltaisn.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.maltaisn.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemNoteTextBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final MaterialButton actionBtn;

  @NonNull
  public final MaterialCardView cardView;

  @NonNull
  public final TextView contentTxv;

  @NonNull
  public final TextView dateTxv;

  @NonNull
  public final ChipGroup labelGroup;

  @NonNull
  public final Chip reminderChip;

  @NonNull
  public final ImageView swipeImv;

  @NonNull
  public final TextView titleTxv;

  private ItemNoteTextBinding(@NonNull FrameLayout rootView, @NonNull MaterialButton actionBtn,
      @NonNull MaterialCardView cardView, @NonNull TextView contentTxv, @NonNull TextView dateTxv,
      @NonNull ChipGroup labelGroup, @NonNull Chip reminderChip, @NonNull ImageView swipeImv,
      @NonNull TextView titleTxv) {
    this.rootView = rootView;
    this.actionBtn = actionBtn;
    this.cardView = cardView;
    this.contentTxv = contentTxv;
    this.dateTxv = dateTxv;
    this.labelGroup = labelGroup;
    this.reminderChip = reminderChip;
    this.swipeImv = swipeImv;
    this.titleTxv = titleTxv;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNoteTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNoteTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_note_text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNoteTextBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.action_btn;
      MaterialButton actionBtn = ViewBindings.findChildViewById(rootView, id);
      if (actionBtn == null) {
        break missingId;
      }

      id = R.id.card_view;
      MaterialCardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.content_txv;
      TextView contentTxv = ViewBindings.findChildViewById(rootView, id);
      if (contentTxv == null) {
        break missingId;
      }

      id = R.id.date_txv;
      TextView dateTxv = ViewBindings.findChildViewById(rootView, id);
      if (dateTxv == null) {
        break missingId;
      }

      id = R.id.label_group;
      ChipGroup labelGroup = ViewBindings.findChildViewById(rootView, id);
      if (labelGroup == null) {
        break missingId;
      }

      id = R.id.reminder_chip;
      Chip reminderChip = ViewBindings.findChildViewById(rootView, id);
      if (reminderChip == null) {
        break missingId;
      }

      id = R.id.swipe_imv;
      ImageView swipeImv = ViewBindings.findChildViewById(rootView, id);
      if (swipeImv == null) {
        break missingId;
      }

      id = R.id.title_txv;
      TextView titleTxv = ViewBindings.findChildViewById(rootView, id);
      if (titleTxv == null) {
        break missingId;
      }

      return new ItemNoteTextBinding((FrameLayout) rootView, actionBtn, cardView, contentTxv,
          dateTxv, labelGroup, reminderChip, swipeImv, titleTxv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
