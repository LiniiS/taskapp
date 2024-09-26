package com.asantos.taskmanagerapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_EDITAR_TAREFA = 1; // Código de solicitação
    private ArrayList<String> tarefas;
    private ArrayAdapter<String> adapter;
    private EditText tarefaInput;
    private int tarefaEditadaPosicao = -1; // Posição da tarefa a ser editada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tarefas = new ArrayList<>();
        tarefaInput = findViewById(R.id.tarefaInput);
        Button addTarefaButton = findViewById(R.id.addTarefaButton);
        Button syncButton = findViewById(R.id.syncButton);
        ListView listView = findViewById(R.id.tarefaListView);

        // Inicializa o ArrayAdapter
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, tarefas);
        listView.setAdapter(adapter);

        // Adiciona uma tarefa à lista
        addTarefaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tarefa = tarefaInput.getText().toString();
                if (!tarefa.isEmpty()) {
                    tarefas.add(tarefa);
                    adapter.notifyDataSetChanged();
                    tarefaInput.setText("");
                    Toast.makeText(MainActivity.this, "Tarefa adicionada", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, insira uma tarefa", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // TAREFA ASSÍNCRONA
        /*
        syncButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new SincronizarTarefasTask(MainActivity.this).execute();
            }
        });
        */

        //PASSAGEM DE PARÂMETROS
        // Abrir EditarTarefaActivity ao clicar em uma tarefa da lista
        /*
        listView.setOnItemClickListener((parent, view, position, id) -> {
            tarefaEditadaPosicao = position; // Armazena a posição da tarefa
            String tarefa = tarefas.get(position);
            Intent intent = new Intent(MainActivity.this, EditarTarefaActivity.class);
            intent.putExtra("tarefa", tarefa);
            startActivityForResult(intent, REQUEST_CODE_EDITAR_TAREFA); // Abre a EditarTarefaActivity
        });
        */
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_EDITAR_TAREFA && resultCode == RESULT_OK) {
            // Atualiza a tarefa editada na lista
            if (data != null) {
                String tarefaEditada = data.getStringExtra("tarefa_editada");
                if (tarefaEditada != null && tarefaEditadaPosicao != -1) {
                    tarefas.set(tarefaEditadaPosicao, tarefaEditada); // Atualiza a tarefa na lista
                    adapter.notifyDataSetChanged(); // Atualiza o ListView
                    Toast.makeText(this, "Tarefa atualizada", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
