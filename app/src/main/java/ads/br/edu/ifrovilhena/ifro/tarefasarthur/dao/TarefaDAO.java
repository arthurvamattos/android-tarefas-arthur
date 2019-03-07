package ads.br.edu.ifrovilhena.ifro.tarefasarthur.dao;

import android.arch.persistence.room.*;

import java.util.List;

import ads.br.edu.ifrovilhena.ifro.tarefasarthur.model.Tarefa;

@Dao
public interface TarefaDAO {

    @Query("select * from tarefas")
    List<Tarefa> listarTodos();

    @Query("select * from tarefas where id = :id")
    Tarefa listarUm(int id);

    @Insert
    void inserir(Tarefa tarefa);

    @Update
    void alterar(Tarefa tarefa);

    @Delete
    void deletar(Tarefa tarefa);
}