package com.bugcreators.makeyourownsurvey.Controller.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bugcreators.makeyourownsurvey.Controller.Adapters.CreateQuestionsAdapter;
import com.bugcreators.makeyourownsurvey.Model.Question;
import com.bugcreators.makeyourownsurvey.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView QuestionsRecyclerView;
    private RecyclerView.Adapter QuestionsAdapter;
    private RecyclerView.LayoutManager LayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("1:", "how much u like the job"));
        questions.add(new Question("2:", "how much u respect Boby"));
        questions.add(new Question("3:", "how much u respect Jacob"));
        questions.add(new Question("1:", "how much u like the job"));
        questions.add(new Question("2:", "how much u respect Boby"));
        questions.add(new Question("3:", "how much u respect Jacob"));

        QuestionsRecyclerView = findViewById(R.id.recyclerViewCreateQuestions);
        LayoutManager = new LinearLayoutManager(this);
        QuestionsAdapter = new CreateQuestionsAdapter(questions);

        QuestionsRecyclerView.setLayoutManager(LayoutManager);
        QuestionsRecyclerView.setAdapter(QuestionsAdapter);
    }
}
