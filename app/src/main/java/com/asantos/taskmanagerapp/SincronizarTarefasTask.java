package com.asantos.taskmanagerapp;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

public class SincronizarTarefasTask extends AsyncTask<Void, Void, String> {

    private Context context;

    // Construtor para receber o contexto da MainActivity
    public SincronizarTarefasTask(Context context) {
        this.context = context;
    }

    @Override
    protected String doInBackground(Void... voids) {
        // Simular sincronização com servidor
        try {
            Thread.sleep(3000); // Simula tempo de sincronização
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Sincronização concluída!";
    }

    @Override
    protected void onPostExecute(String result) {
        // Mostrar resultado da sincronização usando o contexto
        Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }
}
