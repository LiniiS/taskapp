package com.asantos.taskmanagerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditarTarefaActivity extends AppCompatActivity {

    private EditText tarefaEditInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_tarefa);

        tarefaEditInput = findViewById(R.id.tarefaEditInput);
       // Button salvarButton = findViewById(R.id.salvarButton);

        // Recebe a tarefa da MainActivity
        String tarefa = getIntent().getStringExtra("tarefa");
        if (tarefa != null) {
            tarefaEditInput.setText(tarefa);
        }

        // TRATAMENTO DE EVENTOS
        /*
        salvarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tarefaEditada = tarefaEditInput.getText().toString();
                Intent resultIntent = new Intent();
                resultIntent.putExtra("tarefa_editada", tarefaEditada);
                setResult(RESULT_OK, resultIntent);
                finish(); // Volta para a MainActivity
            }
        });
        */

    }
}
