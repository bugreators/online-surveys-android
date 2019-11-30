package com.bugcreators.makeyourownsurvey.Controller.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bugcreators.makeyourownsurvey.Model.Question;
import com.bugcreators.makeyourownsurvey.R;

import java.util.ArrayList;

public class CreateQuestionsAdapter extends RecyclerView.Adapter<CreateQuestionsAdapter.CreateQuestionsViewHolder> {
    private ArrayList<Question> QuestionList;

    public static class CreateQuestionsViewHolder extends RecyclerView.ViewHolder {
        public TextView itemNumberTextView;
        public EditText questionEditText;

        public CreateQuestionsViewHolder(@NonNull View itemView) {
            super(itemView);
            itemNumberTextView = itemView.findViewById(R.id.textViewItemNumberQuestion);
            questionEditText = itemView.findViewById(R.id.editTextQuestion);
        }
    }

    public CreateQuestionsAdapter(ArrayList<Question> questions) {
        QuestionList = questions;
    }

    @NonNull
    @Override
    public CreateQuestionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_create_question, parent, false);
        CreateQuestionsViewHolder createQuestionsViewHolder = new CreateQuestionsViewHolder(view);
        return createQuestionsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CreateQuestionsViewHolder holder, int position) {
        Question question = QuestionList.get(position);

        holder.itemNumberTextView.setText(question.getItemNumber());
        holder.questionEditText.setText(question.getQuestionText());
    }

    @Override
    public int getItemCount() {
        return QuestionList.size();
    }
}
