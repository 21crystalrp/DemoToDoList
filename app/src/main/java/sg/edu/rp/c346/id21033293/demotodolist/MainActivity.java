package sg.edu.rp.c346.id21033293.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvToDoList;
    ArrayList<ToDoItem> alToDo;
    ArrayAdapter<ToDoItem> aaToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDoList = findViewById(R.id.lv);
        alToDo = new ArrayList<>();

        ToDoItem item1 = new ToDoItem("Go for movie", 1, 8, 2020);
        ToDoItem item2 = new ToDoItem("Go for haircut", 2, 8, 2020);

        alToDo.add(item1);
        alToDo.add(item2);

        aaToDo = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alToDo);
        lvToDoList.setAdapter(aaToDo);
    }
}