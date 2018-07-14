/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Jake
 */
public class Question implements Serializable{
    
    private String question;
    private String answer;
    private String options;
    private boolean required;
    private long amount;
    private ArrayList<ChallengeScene> scene = new ArrayList<>();

    public Question() {
    }

    public Question(String question, String answer, String options) {
        this.question = question;
        this.answer = answer;
        this.options = options;
    }

    public String getOptions() {
        return options;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean required) {
        this.required = required;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public ArrayList<ChallengeScene> getScene() {
        return scene;
    }

    public void setScene(ArrayList<ChallengeScene> scene) {
        this.scene = scene;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.question);
        hash = 59 * hash + Objects.hashCode(this.answer);
        hash = 59 * hash + (this.required ? 1 : 0);
        hash = 59 * hash + (int) (this.amount ^ (this.amount >>> 32));
        hash = 59 * hash + Objects.hashCode(this.scene);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.required != other.required) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.scene, other.scene)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer=" + answer + ", required=" + required + ", amount=" + amount + ", scene=" + scene + '}';
    }

    
}
