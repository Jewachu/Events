package com.example.events;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailDialog extends AppCompatDialogFragment {

    @BindView(R.id.edt_venue) EditText edtVenue;
    @BindView(R.id.edt_event) EditText edDate_th;
    @BindView(R.id.edt_da) EditText edEvent;
//    private DetailDialogListener listener;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);
        ButterKnife.bind(this, view);
        builder.setView(view)
                .setTitle("Book Event")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        String venue = edtVenue.getText().toString();
                        String event = edEvent.getText().toString();
                        String date = edDate_th.getText().toString();
                        if (TextUtils.isEmpty(edtVenue.getText()) && TextUtils.isEmpty(edDate_th.getText()) && TextUtils.isEmpty(edEvent.getText())){
                            edtVenue.setError("Input fields");
                            Toast.makeText(getActivity(),"Please input this details",Toast.LENGTH_SHORT).show();
                        }else {
                            Intent intent = new Intent(getActivity(),AllDetail.class);
                            intent.putExtra("event",event);
                            intent.putExtra("venue",venue);
                            intent.putExtra("date",date);
                            startActivity(intent);

                            Log.e("this---------------",venue);
                            Log.e("this---------------",event);
                            Log.e("this---------------",date);
                        }




                    }
                });
        return builder.create();
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        try {
//            listener = (DetailDialogListener) context;
//        } catch (ClassCastException e) {
//            throw new ClassCastException(context.toString() +
//                    "must implement DetailDialogListener");
//        }
//
//    }

//    public interface DetailDialogListener {
//        void applyTexts(String event, String date, String venue);
//    }
}
